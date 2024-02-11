package day07_practice_task_object_part1;


import java.util.Scanner;

public class MilesToKm {
    public MilesToKm() {
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles:");
        double miles = input.nextDouble();
        double kilometers = miles * 1.60934;

        System.out.println("" + miles + " miles is equal to " + kilometers + " kilometers");
        input.close();
    }
}
/*
9. Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers
 */