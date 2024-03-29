import java.util.*;

public class myArray {
    public static void main(String[] args) {
        // declaration of arrays of type int (They are not initialized so they will be
        // considered undefined)
        int[] myInteger0;
        int myInteger1[];

        // Declared and initialized integer array with default values (0)
        int myInteger2[] = new int[10];
        int[] myInteger3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // System.out.println("Integer Array 0 has these numbers: " +
        // Arrays.toString(myInteger0)); //You cannot print arrays that have not been
        // initialized
        // System.out.println("Integer Array 1 has these numbers: " +
        // Arrays.toString(myInteger1)); //You cannot print arrays that have not been
        // initialized
        System.out.println("Integer Array 2 has these numbers: " + Arrays.toString(myInteger2));
        System.out.println("Integer Array 3 has these numbers: " + Arrays.toString(myInteger3));
    }
}