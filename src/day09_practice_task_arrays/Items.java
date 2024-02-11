package day09_practice_task_arrays;

import java.util.Arrays;

public class Items {
    public Items() {
    }


    public static void main(String[] args) {

        String[] items = new String[]{"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = new double[]{99.99, 150.0, 9.99, 250.0, 439.5, 39.99};
        int[] itemIDs = new int[]{12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println(Arrays.binarySearch(items, "Gloves"));
        String[] var4 = items;
        int var5 = items.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String i = var4[var6];
            if (i.equalsIgnoreCase("iPad")) {
                System.out.println(true);
            }
        }

        for(int i = 0; i < items.length; ++i) {
            System.out.println(items[i] + "-" + prices[i] + "-" + itemIDs[i]);
        }

    }
}
/*
5. Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID

 */