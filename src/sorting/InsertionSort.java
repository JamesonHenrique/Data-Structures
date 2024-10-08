package sorting;

public class InsertionSort {
        public static void sort(int[] arr) {
            int n = arr.length;

            if (arr == null || n == 0) {
                throw new IllegalArgumentException("Invalid input");
            }
            for (int i = 1; i < n; i++) {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6};
            sort(arr);
            printArray(arr);
        }
    }


