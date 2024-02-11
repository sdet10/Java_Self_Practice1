package day09_practice_task_arrays;


import java.util.Arrays;

public class ReverseArray {
    public ReverseArray() {
    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];
        int i = array.length - 1;

        for(int j = 0; i >= 0; ++j) {
            reversedArray[j] = array[i];
            --i;
        }

        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
/*
8. Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
 */