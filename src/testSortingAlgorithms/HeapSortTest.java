package testSortingAlgorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import sortingAlgorithms.HeapSort;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sam on 22/10/2016.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HeapSortTest {

    @Test
    public void testHeapSort(){

        HeapSort heapSort = new HeapSort();

        int[] array = new int[]{2,0,4,-1,7,10,3,60,33};
        int[] sortedArray = new int[]{-1,0,2,3,4,7,10,33,60};

        assertArrayEquals(sortedArray, heapSort.heapSort(array));
    }

    @Test
    public void testHeapSortEmptyArray(){

        HeapSort heapSort = new HeapSort();

        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        assertArrayEquals(sortedArray, heapSort.heapSort(array));
    }
}
