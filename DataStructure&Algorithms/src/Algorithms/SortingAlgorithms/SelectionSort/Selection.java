package Algorithms.SortingAlgorithms.SelectionSort;

import java.util.stream.IntStream;

public class Selection {
    public static int[] selectionSort(int[] arr) {
        int currentIteration = 0;
        int minimum = 1000;
        while (currentIteration < arr.length) {
            for (int i = currentIteration; i < arr.length; i++) {
                boolean swap = false ;
                if (arr[i] < minimum) {
                    swap = true ;
                    minimum = arr[i];
                }
                if(swap){

                }
                int indexOfMinimum = findIndex(arr , minimum);
                // swap values
                int temp = arr[indexOfMinimum];
                arr[indexOfMinimum] = arr[currentIteration];
                arr[currentIteration] = temp ;
            }
            minimum = 100 ;
            currentIteration++;
        }
        return arr;
    }
    public static int[] betterSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowest = i ;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[lowest]){
                    lowest = j ;
                }
            }
            if( i != lowest) {
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp ;
            }
        }
        return arr;
    }

    // Function to find the index of an element
    public static int findIndex(int arr[], int t) {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t == arr[i])
                .findFirst() // first occurrence
                .orElse(-1); // No element found
    }

    public static void main(String[] args) {
        int[] list = new int[]{3, 2, 1};
        int [] result = betterSelectionSort(list);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
