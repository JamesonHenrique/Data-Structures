package mathematics;

import java.util.Arrays;

public class RemoveEvenInteger {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[oddCount] = arr[i];
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < oddCount; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }

        }
        return result;


    }

    public static void main(
            String[] args) {

        int[] arr = {1, 2, 4, 5, 10, 6, 3};

        printArray(arr);
        int[] odd = removeEven(arr);
        printArray(odd);


    }
}
