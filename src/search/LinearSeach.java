package search;

public class LinearSeach {
    public static int search(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
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
