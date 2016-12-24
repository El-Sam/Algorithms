package sortingAlgorithms;

/**
 * Created by Sam on 22/10/2016.
 */

/**
 * Worst and average complexity : O(n2)
 * Best complexity : O(n)
 *
 * Better than bubble sort and selection sort
 * Efficient for small data sets
 * Stable, as it does not change the relative order of elements with equal keys
 */

public class InsertionSort {

    /**
     * a method that sort the array in an increasing order
     *
     * @param array the array to be sorted
     * @return a sorted array
     */
    public int[] insertionSortAsc(int[] array){

        int length = array.length;

        //We start from the second element
        for(int i=1;i<length;i++) {

            int key = array[i];
            int j = i-1;
            while (j >= 0 && key < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }

    /**
     * a method that sort the array in an decreasing order
     *
     * @param array the array to be sorted
     * @return a sorted array
     */
    public int[] insertionSortDesc(int[] array){

        int length = array.length;

        //We start from the second element
        for(int i=1;i<length;i++) {

            int key = array[i];
            int j = i-1;
            while (j >= 0 && key > array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        return array;
    }

}
