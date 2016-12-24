package sortingAlgorithms;

/**
 * Created by Sam on 24/12/2016.
 */

/**
 * Heap sort is not a Stable sort, and requires a constant space for sorting a list.
 * Heap Sort is very fast and is widely used for sorting.
 *
 * Worst Case Time Complexity : O(n log n)
 * Best Case Time Complexity : O(n log n)
 * Average Time Complexity : O(n log n)
 * Space Complexity : O(n)
 *
 */
public class HeapSort {

    public int[] heapSort(int a[]){
        buildHeap(a);
        int heapSize = a.length - 1, tmp;

        for(int i = heapSize;i>=0; i--){
            tmp = a[0];
            a[0] = a[heapSize];
            a[heapSize] = tmp;
            heapSize--;
            satisfyHeap(a,0,heapSize);
        }

        return a;
    }

    private void buildHeap(int[] a) {

        int heapsize = a.length - 1;

        for(int i=a.length/2;i>=0;i--){
            satisfyHeap(a,i,heapsize);
        }
    }

    private void satisfyHeap(int[] a, int i, int heapsize) {

        int l = 2*i, r = 2*i+1, largest, tmp;

        if(l <= heapsize && a[l] > a[i]){
            largest = l;
        }
        else{
            largest = i;
        }

        if(r <= heapsize && a[r] > a[largest]){
            largest = r;
        }

        if(largest != i){
            tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;

            satisfyHeap(a,largest,heapsize);
        }
    }
}
