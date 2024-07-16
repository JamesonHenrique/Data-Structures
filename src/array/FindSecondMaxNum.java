package array;

public class FindSecondMaxNum {
    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(
            String[] args) {
        int[] arr = {9, 2, 3, 8, 5, 7};

        System.out.println("The second maximum element in the array is:  " + findSecondMaximum(arr));
    }

}
