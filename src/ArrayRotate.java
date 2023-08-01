import java.util.Arrays;

public class ArrayRotate {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotate arrayRotate = new ArrayRotate();
        arrayRotate.rotate(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public void rotate(int[] array, int k) {
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
        System.arraycopy( newArray, 0, array, 0, array.length );

//        array = Arrays.copyOf(newArray, array.length);
        System.out.println(Arrays.toString(array));

    }
}
