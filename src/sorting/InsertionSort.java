package sorting;

public class InsertionSort {
        public static void sort(int[] arr) {

            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Invalid input");
            }
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6};
            sort(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


