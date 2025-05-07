package Sorting;

public class QuickSort {

    // Hoare-style partition with safer recursion
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }

            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                // Swap
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        return low;  // Return the next partition start index
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Use pi - 1 to avoid infinite loop if pi == high
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 56, 67, 45, 34, 35, 67, 2, 4, 5, 6, 1};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
