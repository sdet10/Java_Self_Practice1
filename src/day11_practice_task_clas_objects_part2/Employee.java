package day11_practice_task_clas_objects_part2;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee() {
        this.name = this.name;
        this.age = this.age;
        this.gender = this.gender;
        this.jobTitle = this.jobTitle;
        this.salary = this.salary;
    }

    public void work() {
        System.out.println(this.jobTitle + " " + this.name + " is working");
    }

    public String toString() {
        return "Employee{name='" + this.name + "', age=" + this.age + ", gender=" + this.gender + ", jobTitle='" + this.jobTitle + "', salary=" + this.salary + "}";
    }
}
/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */