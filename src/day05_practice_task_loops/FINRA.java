package day05_practice_task_loops;

public class FINRA {

    public static void main(String[] args) {

        int number = 15;
        String result = "";


        if (number % 3 == 0 && number % 5 == 0) {
            result = "FINRA";
        } else if (number % 5 == 0) {
            result = "RA";
        } else if (number % 3 == 0) {
            result = "FIN";
        } else {
            result = "" + number;
        }

        System.out.println("reslut = " + result);
    }
}

/*
6. Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
"FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.

				Example:
					1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...
 */
