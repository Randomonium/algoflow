package nl.algoflow.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        this.bubbleSort = new BubbleSort();
    }

    @Test
    void testSortedArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 6};

        bubbleSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void testAlmostSortedArray() {
        int[] array = new int[]{1, 2, 4, 3, 6, 5};
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 6};

        bubbleSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void testReverseArray() {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 6};

        bubbleSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void testArrayWithNegativeIntegers() {
        int[] array = new int[]{3, 0, 2, -1, -2, 1};
        int[] sortedArray = new int[]{-2, -1, 0, 1, 2, 3};

        bubbleSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    void testEmptyArray() {
        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        bubbleSort.sort(array);
        assertArrayEquals(array, sortedArray);
    }
}
