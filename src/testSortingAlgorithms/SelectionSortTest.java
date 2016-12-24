package testSortingAlgorithms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import sortingAlgorithms.SelectionSort;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Sam on 22/10/2016.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SelectionSortTest {

    @Test
    public void testSelectionSortAsc(){

        SelectionSort selectionSort = new SelectionSort();

        int[] array = new int[]{2,0,4,-1,7,10,3,60,33};
        int[] sortedArray = new int[]{-1,0,2,3,4,7,10,33,60};

        assertArrayEquals(sortedArray,selectionSort.selectionSortAsc(array));
    }


    @Test
    public void testSelectionSortAscEmptyArray(){

        SelectionSort selectionSort = new SelectionSort();

        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        assertArrayEquals(sortedArray,selectionSort.selectionSortAsc(array));
    }

    @Test
    public void testSelectionSortDesc(){

        SelectionSort selectionSort = new SelectionSort();

        int[] array = new int[]{2,0,4,11,7,100,3,6,33};
        int[] sortedArray = new int[]{100,33,11,7,6,4,3,2,0};

        assertArrayEquals(sortedArray,selectionSort.selectionSortDesc(array));
    }

    @Test
    public void testSelectionSortDescEmptyArray(){

        SelectionSort selectionSort = new SelectionSort();

        int[] array = new int[]{};
        int[] sortedArray = new int[]{};

        assertArrayEquals(sortedArray,selectionSort.selectionSortDesc(array));
    }

}
