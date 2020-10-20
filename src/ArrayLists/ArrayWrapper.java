package ArrayLists;

/**
 * Wrapper class for Array used in JUnit Tutorial.
 *
 * @author CS 1332 TAs
 * @version 1.0
 */
public class ArrayWrapper {
    private int[] array;

    /**
     * Replaces element at an index with specified data
     * @param index index in array to replace
     * @param data new data
     * @return data currently at index
     */
    public int replace(int index, int data) {
        if (index >= array.length) {
            throw new IndexOutOfBoundsException("index is larger than or equal "
                    + "to array length");
        }
        int toReturn = array[index];
        array[index] = data;
        return toReturn;
    }

    /**
     * Returns the length of the array
     * @return length of array
     */
    public int capacity() {
        return array.length;
    }

    /**
     * Assigns this array to array parameter.
     * @param array input array
     */
    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * Returns current array
     * @return current array
     */
    public int[] getArray() {
        return array;
    }
}
