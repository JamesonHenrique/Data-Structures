package array;

import java.sql.SQLOutput;

import static array.ArrayUtil.printArray;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(
            String[] args) {
        int[] arr = {1, 6,7,8,5,9};
        printArray(arr);
        System.out.println("Reversing array: ");
        reverseArray(arr);
        printArray(arr);
    }
}
