package day09_practice_task_arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classmates = new String[]{"Mike Smith", "Pete Long", "Liam Johnson", "Amir Luck", "Mary Peterson"};

        for(int i = classmates.length - 1; i >= 0; --i) {
            System.out.println(classmates[i] + "  ");
        }

    }
}
/*

6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */

