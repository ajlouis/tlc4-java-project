package Arrays_Lab;

import java.util.Arrays;

public class ArrayInt {

    private int[] Array1 = {4, 56, 4, 6, 8};

    public ArrayInt() {
        int arraySize = this.Array1.length;
        for (int i = 0; i < arraySize; i++) {
            Array1[i] = i + 1;
            System.out.println(Array1[i]);
        }
        System.out.println(Arrays.toString(Array1));
    }

    public int getLength() {
        return Array1.length;
    }
}
