package day04_practice_tasks_statments;

public class MonthName {


    public static void main(String[] args) {

        int number = 10;
        String var10000;

        switch (number) {
            case 1:
                var10000 = "January";
                break;
            case 2:
                var10000 = "February";
                break;
            case 3:
                var10000 = "March";
                break;
            case 4:
                var10000 = "April";
                break;
            case 5:
                var10000 = "May";
                break;
            case 6:
                var10000 = "June";
                break;
            case 7:
                var10000 = "July";
                break;
            case 8:
                var10000 = "August";
                break;
            case 9:
                var10000 = "September";
                break;
            case 10:
                var10000 = "October";
                break;
            case 11:
                var10000 = "November";
                break;
            case 12:
                var10000 = "December";
                break;
            default:
                var10000 = "No such a month";
        }

        String month = var10000;
        System.out.println(month);
    }
}
/*
11. Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.

			Example 1:
				     number = 10

			Output:
				  October

			Example 2:
				     number = -20

			Output:
				  No such a month
 */

