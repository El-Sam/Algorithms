package sortingAlgorithms;

/**
 * Created by Sam on 22/10/2016.
 */

/**
 * (n-1)+(n-2)+(n-3)+.....+3+2+1
 * Sum = n(n-1)/2
 * i.e O(n2)
 *
 * the complexity of Bubble Sort is O(n^2).
 */
public class BubbleSort {

    /**
     * a method that sort the array in an increasing order
     *
     * @param array the array to be sorted
     * @return a sorted array
     */
    public int[] BubbleSortASC(int[] array){

        int temp;
        int length = array.length;

        for(int i=0;i<length;i++){

            boolean flag = false;

            for(int j=0; j<length - i - 1; j++){

                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    flag = true;
                }
            }

            //No swapping occured in the j loop ==> array sorted
            if(!flag) break;
        }
        return array;
    }


    /**
     * a method that sort the array in a decreasing order
     *
     * @param array the array to be sorted
     * @return a sorted array
     */
    public int[] BubbleSortDESC(int[] array){

        int temp;
        int length = array.length;

        for(int i=0;i<length;i++){

            boolean flag = false;

            for(int j=0; j<length - i - 1; j++){

                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    flag = true;
                }
            }

            //No swapping occured in the j loop ==> array sorted
            if(!flag) break;
        }
        return array;
    }

}
