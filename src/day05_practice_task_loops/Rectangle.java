package day05_practice_task_loops;

public class Rectangle {

    public static void main(String[] args) {

        int givingNumber = 8;

        for(int i = 1; i <= givingNumber; ++i) {
            for(int j = 1; j <= givingNumber; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}

/*
1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
 */
