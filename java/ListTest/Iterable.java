package ListTest;

public class Iterable {

    int[] ia = {1, 2, 3, 4, 5};

    public Iterable() {
        for (
                int i : ia) {
            System.out.println(i);
        }
    }

}
