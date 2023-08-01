import java.util.Arrays;

public class ArrayRotate {

    public static void rotate(int[] array,int k){
        int[] newArray=new int[array.length];
        int j=0;
        for (int i = k+1; i < array.length; i++) {
            newArray[j++]=array[i];
        }
        for (int i = 0; i <= k; i++) {
            newArray[j++]=array[i];
        }

        System.out.println(Arrays.toString(newArray));

    }

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7};
        rotate(array,3);
    }
}
