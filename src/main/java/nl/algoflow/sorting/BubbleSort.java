package nl.algoflow.sorting;

public class BubbleSort implements BaseSorting {

    /**
     * Sorts the given int array in ascending order using the bubble sort algorithm.
     *
     * @param array the array to be sorted
     */
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
