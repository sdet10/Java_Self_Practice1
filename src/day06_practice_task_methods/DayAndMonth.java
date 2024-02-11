package day06_practice_task_methods;

public class DayAndMonth {

    public static void day(int day) {

        if (day >= 1 && day <= 7) {
            System.out.println(day == 1 ? "Monday" : (day == 2 ? "Tuesday" : (day == 3 ? "Wednesday" :
                    (day == 4 ? "Thursday" : (day == 5 ? "Friday" : (day == 6 ? "Saturday" : "Sunday"))))));
        } else {
            System.out.println("Invalid Number");
        }

    }

    public static void monthName(int month) {

        String var10000;
        switch (month) {

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

        String result = var10000;
        System.out.println(result);
    }

    public static void daysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}

/*
3. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */
