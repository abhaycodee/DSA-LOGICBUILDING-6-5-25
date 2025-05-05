package Sorting;

public class BubbleSort {
    public static void main(String[] args) {


        int [] arr={45,67,8,23,5,12,39,90,57,23,543,2,6,8};
        int temp=0;


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }



// for printing the soreted array we use enhanced for loop

        for(int hj:arr)
        {
            System.out.print(hj+" ");
        }













    }
}
