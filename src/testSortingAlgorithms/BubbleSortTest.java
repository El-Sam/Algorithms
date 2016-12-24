package testSortingAlgorithms;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import sortingAlgorithms.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sam on 22/10/2016.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BubbleSortTest {

    @Test
    public void testBubbleSortASC(){

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = new int[]{2,0,4,-1,7,10,3,60,33};
        int[] sortedArray = new int[]{-1,0,2,3,4,7,10,33,60};

        assertArrayEquals(sortedArray, bubbleSort.BubbleSortASC(array));
    }

    @Test
    public void testBubbleSortASCEmptyArray(){

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        assertArrayEquals(sortedArray, bubbleSort.BubbleSortASC(array));
    }

    @Test
    public void testBubbleSortDESC(){

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = new int[]{2,0,4,11,7,100,3,6,33};
        int[] sortedArray = new int[]{100,33,11,7,6,4,3,2,0};

        assertArrayEquals(sortedArray, bubbleSort.BubbleSortDESC(array));
    }

    @Test
    public void testBubbleSortDESCEmptyArray(){

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = new int[]{2,0,4,11,7,100,3,6,33};
        int[] sortedArray = new int[]{100,33,11,7,6,4,3,2,0};

        assertArrayEquals(sortedArray, bubbleSort.BubbleSortDESC(array));
    }

}
