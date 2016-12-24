package sortingAlgorithms;

/**
 * Created by Sam on 22/10/2016.
 */

/**
 * Merge Sort:
 *  Stable search, based on the rule of Divide and Conquer
 *
 *  In this algorithm, the unsorted array is sorted into N subarrays, each having one element.
 *  Then, it repeatedly merge these subarrays, to produce new sorted subarrays, and at lasts one sorted array is produced.
 *
 *  Worst Case Time Complexity : O(n2)
 *  Best Case Time Complexity : O(n log n)
 *  Average Time Complexity : O(n log n)
 */
public class MergeSort {

    /**
     * Method doing the quick sort
     * @param array the array to be sorted
     * @param p the starting index (= 0)
     * @param r the last index of array
     * @return the sorted array
     */
    public int[] mergeSortAsc(int[] array, int p, int r){

        if(p < r){
            int q = (int) Math.floor((p+r)/2);
            mergeSortAsc(array,p,q);
            mergeSortAsc(array,q+1,r);
            mergeAsc(array,p,q,r);
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
    public void mergeAsc(int[] array, int p,int q,int r){

        int[] tmpArray = new int[array.length];

        int i = p, j = q+1, k = 0;

        while(i <= q && j <= r){
            if(array[i] < array[j]) tmpArray[k++] = array[i++];
            else tmpArray[k++] = array[j++];
        }

        while(i <= q){
            tmpArray[k++] = array[i++];
        }
        while(j <= r){
            tmpArray[k++] = array[j++];
        }

        // copying back the sorted array to array[]
        for(i = r;i >= p;i--){
            array[i] = tmpArray[--k];
        }
    }


    /**
     * Method doing the quick sort
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
