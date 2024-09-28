package search;

public class BinarySearch {
    public static int search(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid =  (right + left) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 9;
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }
}
