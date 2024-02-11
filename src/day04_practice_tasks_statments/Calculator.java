package day04_practice_tasks_statments;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 100.0;
        double n2 = 200.0;
        char operator = 45;

        switch (operator) {
            case 42:
                System.out.println(n1 * n2);
                break;
            case 43:
                System.out.println(n1 + n2);
                break;
            case 44:
            case 46:
            default:
                System.out.println("Invalid Operator");
                break;
            case 45:
                System.out.println(n1 - n2);
                break;
            case 47:

                System.out.println(n1 / n2);
        }

    }
}
/*
10. Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30
 */

