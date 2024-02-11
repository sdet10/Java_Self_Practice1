package day07_practice_task_object_part1;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Meho";
        employee1.age = 36;
        employee1.gender = 'M';
        employee1.jobTitle = "Driver";
        employee1.salary = 25000.0;
        employee1.work();

        System.out.println(employee1);
    }
}


