package sortingAlgorithms;

/**
 * Created by Sam on 22/10/2016.
 */

/**
 * Worst, best and average complexity : O(n2)
 *
 * The most simplest sorting algorithm
 */

public class SelectionSort {

    /**
     * a method that sort the array in an increasing order
     *
     * @param array the array to be sorted
     * @return a sorted array
     */
    public int[] selectionSortAsc(int[] array){

        int length = array.length;

        for(int i=0;i<length-1;i++) {
            for(int j=i+1;j<length;j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }

    /**
     * a method that sort the array in an decreasing order
     *
     * @param array the array to be sorted
     * @return a sorted array
     */
    public int[] selectionSortDesc(int[] array){

        int length = array.length;

        for(int i=0;i<length-1;i++) {
            for(int j=i+1;j<length;j++){
                if(array[i] < array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }

}
