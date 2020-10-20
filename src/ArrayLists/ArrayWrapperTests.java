package ArrayLists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayWrapperTests {
    private ArrayWrapper actualWrapper;

    @Before
    public void setUp() {
        actualWrapper = new ArrayWrapper();
    }

    @Test
    public void testReplaceMiddle() {
        // Populate the data structure.
        int[] actualArr = new int[5];
        actualArr[0] = 2050;
        actualArr[1] = 1331;
        actualArr[2] = 2110;
        actualArr[3] = 1301;
        actualArr[4] = 2200;
        actualWrapper.setArray(actualArr);

        // Call the appropriate method.
        int actualOldVal = actualWrapper.replace(2, 1332);

        // Construct expected result.
        int[] expectedArr = new int[5];
        expectedArr[0] = 2050;
        expectedArr[1] = 1331;
        expectedArr[2] = 1332; // Expected result replaces the value at index 2.
        expectedArr[3] = 1301;
        expectedArr[4] = 2200;
        int expectedOldVal = 2110;


        // Check to see if the implementation matches the expected result.
        assertArrayEquals(expectedArr, actualWrapper.getArray());
        assertEquals(expectedOldVal, actualOldVal);
    }

    @Test
    public void testReplaceFront() {
        // Populate the data structure.
        int[] actualArr = new int[5];
        actualArr[0] = 2050;
        actualArr[1] = 1331;
        actualArr[2] = 2110;
        actualArr[3] = 1301;
        actualArr[4] = 2200;
        actualWrapper.setArray(actualArr);

        // Call the appropriate method.
        int actualOldVal = actualWrapper.replace(0, 1332);

        // Construct expected result.
        int[] expectedArr = new int[5];
        expectedArr[0] = 1332;  // Value at index 0 replaced.
        expectedArr[1] = 1331;
        expectedArr[2] = 2110;
        expectedArr[3] = 1301;
        expectedArr[4] = 2200;
        int expectedOldVal = 2050;


        // Check to see if the implementation matches the expected result.
        assertArrayEquals(expectedArr, actualWrapper.getArray());
        assertEquals(expectedOldVal, actualOldVal);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReplaceLargeIndex() {
        // Populate the data structure.
        int[] actualArr = new int[5];
        actualArr[0] = 2050;
        actualArr[1] = 1331;
        actualArr[2] = 2110;
        actualArr[3] = 1301;
        actualArr[4] = 2200;
        actualWrapper.setArray(actualArr);


        try {
            // Call the appropriate method.
            actualWrapper.replace(5, 1332); // Method call we are testing.
        } catch (IndexOutOfBoundsException e) {
            // Construct expected result (i.e. ensure array didn't change).
            int[] expectedArr = new int[5];
            expectedArr[0] = 2050;
            expectedArr[1] = 1331;
            expectedArr[2] = 2110; // Value at index 2 replaced.
            expectedArr[3] = 1301;
            expectedArr[4] = 2200;
            assertArrayEquals(expectedArr, actualWrapper.getArray());

            // Rethrow exception so test passes with expected exception.
            throw e;
        }
    }

    @Test
    public void testCapacity() {
        // Populate the data structure.
        int[] actualArr = new int[4];
        actualArr[0] = 1;
        actualArr[1] = 3;
        actualArr[2] = 3;
        actualArr[3] = 2;
        actualWrapper.setArray(actualArr);

        // Call the appropriate method.
        int actualCapacity = actualWrapper.capacity();

        // Construct the expected result.
        int[] expectedArr = new int[4];
        expectedArr[0] = 1;
        expectedArr[1] = 3;
        expectedArr[2] = 3;
        expectedArr[3] = 2;
        int expectedCapacity = 4;

        // Check to see if the implementation matches the expected result.
        assertEquals(expectedCapacity, actualCapacity);
        // capacity shouldn't change the array, but who knows what bugs we have.
        assertArrayEquals(expectedArr, actualWrapper.getArray());
    }
}