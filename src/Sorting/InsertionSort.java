package Sorting;

public class InsertionSort {

    public static void insertionSort(int [] arr)
    {
      int key=0;
      int j=0;
        for(int i=1;i<arr.length;i++)
        {
           key=arr[i];
           j=i-1;
          while(j>=0&&arr[j]>key)
          {
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;
        }




    }
    public static void main(String[] args) {




int [] arr={34,56,67,78,45,34,2,34,5,1,2};


insertionSort(arr);
for(int kl:arr){

    System.out.print(kl+" ");
}








    }
}
