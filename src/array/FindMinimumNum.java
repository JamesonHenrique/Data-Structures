package array;

import static array.ArrayUtil.printArray;

public class FindMinimumNum {
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(
            String[] args) {
        int[] arr = {9, 2, 3, 1,5, 2};

      printArray(arr);
        System.out.println("The minimum element in the array is: " + findMinimum(arr));
    }
}
