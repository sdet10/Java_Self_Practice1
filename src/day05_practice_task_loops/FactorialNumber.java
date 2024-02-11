package day05_practice_task_loops;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        long result = 1L;

        for(int i = num; i >= 1; --i) {
            result *= (long)i;
        }

        System.out.println("result = " + result);
    }
}

/*
5. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
