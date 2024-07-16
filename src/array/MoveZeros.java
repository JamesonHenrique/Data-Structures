package array;

import static array.ArrayUtil.printArray;

public class MoveZeros {
    public static void moveZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }


    }
    public static void main(
            String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        printArray(arr);
    }
}
