package Arrays_Lab;

import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void testArray() {
        ArrayInt array1 = new ArrayInt();
        boolean value = array1.getLength() == 5;
        assertTrue("Length", value);
    }
}
