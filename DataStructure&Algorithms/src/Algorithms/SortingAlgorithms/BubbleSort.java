package Algorithms.SortingAlgorithms;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int[] currentList = arr;
        int left = 0;
        int right = 0;
        boolean swap = false;
        do {
            swap = false;
            for (int i = 1; i <= currentList.length - 1; i++) {
                left = arr[i - 1];
                right = arr[i];
                if (left > right) {
                    int temp = right;
                    currentList[i] = left;
                    currentList[i - 1] = temp;
                    swap = true;
                }
            }
        } while (swap);

        return currentList;
    }

    public static int[] betterBubbleSort(int[] arr) {
        int[] currentList = arr;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = currentList.length; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    if (currentList[j] > currentList[j + 1]) {
                        int temp = currentList[j];
                        currentList[j] = currentList[j + 1];
                        currentList[j + 1] = temp;
                        swap = true;
                    }
                }
            }
        }
        return currentList;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        int[] result = betterBubbleSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
