package day06_practice_task_methods;

public class SalaryCaculator {

    public static void main(String[] args) {

        double income = salary(45.0, 40);
        System.out.println("Your income is = " + income);
    }

    public static double salary(double hourlyRate, int weeklyHours) {
        double salary = hourlyRate * (double)weeklyHours * 52.0;
        return salary;
    }
}
/*
4. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */

