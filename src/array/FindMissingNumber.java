package array;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum +=
                    num;
        }
        return sum - arrSum;

    }
    public static void main(
            String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}
