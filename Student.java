/*
 3.Create a class 'Student' with three data members which are name, age and address. The constructor of the class 
 assigns default values name as "unknown", age as '0' and address as "not available". It has two Members with the
 same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method
 takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint-Use array of objects. 
 
 */

package Assignment5;

public class Student {

	private String name;
	private int age;
	private String address;

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printStudentInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("sagar", 26, "mumbai");
		students[1].setInfo("bhushan", 24, "mumbai");
		students[2].setInfo("nilesh",26, "goa");
		students[3].setInfo("ashu", 25,"pune");
		students[4].setInfo("chinmay", 20,"nagpur");
		students[5].setInfo( "sahil",21, "nagar");
		students[6].setInfo("viraj", 23,"shirdi");
		students[7].setInfo("nilanjan", 22, "dule");
		students[8].setInfo("siddhant", 23,"pune");
		students[9].setInfo("mahaveer", 22, "pune");

		for (int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
		}
	}

}