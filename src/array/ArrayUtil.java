package array;

public class ArrayUtil {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

    }
    public void arrayDemo() {
        int[] myArray = new int[5];

        myArray[0] = 1;
        myArray[1] = 9;
        myArray[2] = 3;
        myArray[3] = 7;
        myArray[4] = 2;
        printArray(myArray);
        System.out.println("Array length: " + myArray.length);
        System.out.println(myArray[myArray.length -1]);
    }

    public static void main(
            String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
