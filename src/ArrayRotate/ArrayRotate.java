package ArrayRotate;

import java.util.Arrays;

public class ArrayRotate {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayV2 = {1, 2, 3, 4, 5, 6, 7};
        rotate(array, 3);
        rotateV2(arrayV2, 3);
        System.out.println("First method: " + Arrays.toString(array));
        System.out.println("Second method: " + Arrays.toString(arrayV2));
    }

    public static void rotate(int[] array, int k) {
        if (k > array.length) {
            k = k % array.length;
        }

        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = k + 1; i < array.length; i++) {
            newArray[j++] = array[i];
        }
        for (int i = 0; i <= k; i++) {
            newArray[j++] = array[i];
        }
        System.arraycopy(newArray, 0, array, 0, array.length);

    }

    public static void rotateV2(int[] array, int k) {

        if (array == null || array.length == 0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if (k > array.length) {
            k = k % array.length;
        }

        reverse(array, 0, k);
        reverse(array, k + 1, array.length - 1);
        reverse(array, 0, array.length - 1);
    }

    private static void reverse(int[] array, int start, int finish) {
        if (array == null || array.length == 1)
            return;
        while (start < finish) {
            int temp = array[start];
            array[start] = array[finish];
            array[finish] = temp;
            start++;
            finish--;

        }
    }


}
