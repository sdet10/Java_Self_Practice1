package day11_practice_task_clas_objects_part2;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Mike";
        employee.age = 20;
        employee.gender = 'M';
        employee.jobTitle = "Driver";
        employee.salary = 8000.0;
        employee.work();

        System.out.println(employee);
    }
}


