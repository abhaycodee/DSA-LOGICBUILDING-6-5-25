package Sorting;

public class SelectionSort {
    public static void main(String[] args) {


        int [] arr={45,67,8,23,5,12,39,90,57,23,543,2,6,8};
        int temp=0;
        int min=0;

        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }

            temp=arr[min];
            arr[min]=arr[i];  // arr[min] is the element which is found to be smaller than arr[i] on comparison
            arr[i]=temp;

        }



        // sorted array will be

        for(int jk:arr)
        {
            System.out.print(jk+" ,");
        }












    }
}
