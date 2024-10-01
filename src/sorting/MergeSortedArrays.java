package sorting;

public class MergeSortedArrays {
    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }
        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(arr3[l] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int n = arr1.length;
        int m = arr2.length;
        mergeSortedArrays(arr1, arr2);
    }
}
