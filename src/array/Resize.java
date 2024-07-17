package array;

import static array.ArrayUtil.printArray;

public class Resize {
    public static int[] resize(int[] arr, int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public static void main(
            String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        arr = resize(arr, arr.length*2);
        System.out.println(arr.length);
        printArray(arr);
    }
}
