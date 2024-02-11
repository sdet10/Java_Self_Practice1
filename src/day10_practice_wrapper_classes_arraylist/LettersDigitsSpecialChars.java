package day10_practice_wrapper_classes_arraylist;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        String digits = "";
        String letters = "";
        String specialChars = "";

        char[] var5 = str.toCharArray();
        int var6 = var5.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            char each = var5[var7];
            if (Character.isDigit(each)) {
                digits = digits + each;
            } else if (Character.isLetter(each)) {
                letters = letters + each;
            } else {
                specialChars = specialChars + each;
            }
        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}

/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */
