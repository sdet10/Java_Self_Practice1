package day10_practice_wrapper_classes_arraylist;

import java.util.ArrayList;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList();
        String[] var4 = arr1;
        int var5 = arr1.length;

        int var6;
        String each;
        for(var6 = 0; var6 < var5; ++var6) {
            each = var4[var6];
            list.add(each);
        }

        var4 = arr2;
        var5 = arr2.length;

        for(var6 = 0; var6 < var5; ++var6) {
            each = var4[var6];
            list.add(each);
        }

        System.out.println(list);
    }
}
/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */