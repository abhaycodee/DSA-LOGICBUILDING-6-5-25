package Sorting;

public class QuickSort {

    public static int partition(int [] arr,int low , int high)
    {
      int pivot=arr[(low+high)/2];

      while(low<=high) {
          while (arr[low] < pivot) {
              low++;
          }
          while (arr[high] > pivot) {
              high--;
          }

          if (low <= high) {
              int temp = arr[low];
              arr[low] = arr[high];
              arr[high] = temp;
              low++;
              high--;
          }


      }
        return low;
    }



    public static void quickSort(int [] arr,int low,int high) {
        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            quickSort(arr, low, pi - 1);
        }

        if (pi < high) {


            quickSort(arr, pi, high);
        }
    }
    public static void main(String[] args) {






int [] arr={34,56,67,45,34,35,67,2,4,5,6,1};



quickSort(arr,0,11);

        System.out.println("the sorted array is ....");

for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}


    }
}
