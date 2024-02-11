package day07_practice_task_object_part1;

public class Employee {

        String name;
        int age;
        char gender;
        String jobTitle;
        double salary;

        public Employee() {
        }

        public void work() {
            System.out.println(this.jobTitle + " " + this.name + " is working.");
        }

        public String toString() {
            return "Employee{name=' " + this.name + "', age= ' " + this.age + "', gender = '" + this.gender + "'' jobTitle = '" + this.jobTitle + "'' salary =  ' " + this.salary + "'}";
        }
    }


/*
1. Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): prints the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */