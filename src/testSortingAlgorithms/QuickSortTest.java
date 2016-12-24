package testSortingAlgorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import sortingAlgorithms.QuickSort;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sam on 22/10/2016.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuickSortTest {

    @Test
    public void testQuickSortAsc(){

        QuickSort quickSort = new QuickSort();

        int[] array = new int[]{2,0,4,-1,7,10,3,60,33};
        int[] sortedArray = new int[]{-1,0,2,3,4,7,10,33,60};

        assertArrayEquals(sortedArray,quickSort.quickSortAsc(array,0,array.length-1));
    }


    @Test
    public void testQuickSortAscEmptyArray(){

        QuickSort quickSort = new QuickSort();

        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        assertArrayEquals(sortedArray,quickSort.quickSortAsc(array,0,array.length-1));
    }

    @Test
    public void testQuickSortDesc(){

        QuickSort quickSort = new QuickSort();

        int[] array = new int[]{2,0,4,11,7,100,3,6,33};
        int[] sortedArray = new int[]{100,33,11,7,6,4,3,2,0};

        assertArrayEquals(sortedArray,quickSort.quickSortDesc(array,0,array.length-1));
    }

    @Test
    public void testQuickSortDescEmptyArray(){

        QuickSort quickSort = new QuickSort();

        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        assertArrayEquals(sortedArray,quickSort.quickSortDesc(array,0,array.length-1));
    }

}
