package day08_practice_task_string;

import java.util.Scanner;

public class TipCalculator {
    public TipCalculator() {
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String yesOrNo = scan.next().toLowerCase();
        System.out.println("Enter the number of people:");
        int numOfPeople = scan.nextInt();
        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();
        double tipRate = service.equals("excellent") ? 0.25 : (service.equals("great") ? 0.2 : (service.equals("good") ? 0.15 : (service.equals("fair") ? 0.1 : 0.05)));
        double totalTip = amount * tipRate;
        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + totalTip);
        if (yesOrNo.equals("yes")) {
            System.out.println("Total per person: " + amount / (double) numOfPeople);
            System.out.println("Tip per person: " + totalTip / (double) numOfPeople);
        }

        scan.close();
    }
}
/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75
 */