package day08_practice_task_string;

import java.util.Scanner;

public class WithoutFirstCharacter {
    public WithoutFirstCharacter() {
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = scan.next();
        System.out.println("Enter your second word:");
        String secondWord = scan.next();
        scan.close();
        String var10000 = firstWord.substring(1);
        String result = var10000 + secondWord.substring(1);
        System.out.println(result);
    }
}
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */