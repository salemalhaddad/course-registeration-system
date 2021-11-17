public class Student extends System {
	String department;
	int load;

	public Student(String name, String department, int load) {
		super(name);
		this.department = department;
		this.load = load;
	}

	public String getDepartment() {
		return department;
	}

	public int getLoad() {
		return load;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setLoad(int load) {
		this.load = load;
	}

	public String toString() {
		return "Student: " + getName() + " Department: " + getDepartment() + " Load: " + getLoad();
	}
}
