package sortingAlgorithms;

/**
 * Created by Sam on 22/10/2016.
 */

/**
 * Quick sort:
 *  Not stable search, but it is very fast, based on the rule of Divide and Conquer
 *
 *  This algorithm divides the list into three main parts :
 *  - Elements less than the Pivot element
 *  - Pivot element
 *  - Elements greater than the pivot element
 *
 *  Worst Case Time Complexity : O(n2)
 *  Best Case Time Complexity : O(n log n)
 *  Average Time Complexity : O(n log n)
 */
public class QuickSort {

    /**
     * Method doing the quick sort in increasing order
     * @param array the array to be sorted
     * @param p the starting index (= 0)
     * @param r the last index of array
     * @return the sorted array
     */
    public int[] quickSortAsc(int[] array, int p, int r){

        if(p < r){

            int q = partitionAsc(array,p,r);
            quickSortAsc(array,p,q);
            quickSortAsc(array,q+1,r);
        }
        return array;
    }

    /**
     * partition the array into 3 parts : elements < pivot , pivot, elements > pivot
     * @param array array to partition
     * @param p starting index (=0)
     * @param r array last index
     * @return the first index of the 'elements > pivot' partition
     */
    public int partitionAsc(int[] array, int p,int r){

        int pivot = array[p];
        int tmp;

        int i = p, j = r;

        while(true){
            while(array[i] < pivot && array[i] != pivot) i++;
            while(array[j] > pivot && array[j] != pivot) j--;

            if(i < j){
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            else
                return j;
        }
    }


    /**
     * Method doing the quick sort in decreasing order
     * @param array the array to be sorted
     * @param p the starting index (= 0)
     * @param r the last index of array
     * @return the sorted array
     */
    public int[] quickSortDesc(int[] array, int p, int r){

        if(p < r){

            int q = partitionDesc(array,p,r);
            quickSortDesc(array,p,q);
            quickSortDesc(array,q+1,r);
        }
        return array;
    }

    /**
     * partition the array into 3 parts : elements > pivot , pivot, elements < pivot
     * @param array array to partition
     * @param p starting index (=0)
     * @param r array last index
     * @return the first index of the 'elements < pivot' partition
     */
    public int partitionDesc(int[] array, int p,int r){

        int pivot = array[p];
        int tmp;

        int i = p, j = r;

        while(true){
            while(array[i] > pivot && array[i] != pivot) i++;
            while(array[j] < pivot && array[j] != pivot) j--;

            if(i < j){
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            else
                return j;
        }
    }
}
