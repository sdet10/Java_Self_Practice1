package day09_practice_task_arrays;

import java.util.Arrays;

public class ClassMatesInitials {
    public ClassMatesInitials() {
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Mike Smith", "Joe Rey", "Tom  Becker", "Sherl Tomson", "Tylar Oak", "Ken Voss",
                "Tim Gordon", "John Blac", "Jessica Smith"};
        String[] initials = new String[names.length];

        for(int i = 0; i < names.length; ++i) {
            char var10002 = names[i].charAt(0);
            initials[i] = "" + var10002 + names[i].charAt(names[i].indexOf(" ") + 1);
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(initials));
    }

    public static String[] findInitials(String[] names) {
        String[] initials = new String[names.length];

        for(int i = 0; i < names.length; ++i) {
            char var10002 = names[i].charAt(0);
            initials[i] = "" + var10002 + names[i].charAt(names[i].indexOf(" ") + 1);
        }

        return initials;
    }
}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */