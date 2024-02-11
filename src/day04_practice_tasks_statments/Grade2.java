package day04_practice_tasks_statments;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 65;
        String result;

        switch (grade) {
            case 65:
                result = "Excellent";
                break;
            case 66:
                result = "Great job";
                break;
            case 67:
                result = "Good";
                break;
            case 68:
                result = "Passed";
                break;
            case 69:
            default:
                result = "Invalid";
                break;
            case 70:
                result = "Failed";
        }

        System.out.println(result);
    }
}

/*
9. Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job
 */
