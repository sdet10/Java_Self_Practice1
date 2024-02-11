package day10_practice_wrapper_classes_arraylist;

public class UpperCaseAndLowerCase {


    public static void main(String[] args) {

        String str = "JAVA java";
        int countUpperCase = 0;
        int countLowerCase = 0;
        char[] var4 = str.toCharArray();
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            char each = var4[var6];
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    ++countUpperCase;
                } else {
                    ++countLowerCase;
                }
            }
        }

        System.out.println(countLowerCase == countUpperCase);
    }
}


/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */