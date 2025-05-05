package Array;

public class Reverse_Array {
    public static void main(String[] args) {



        // you are given with the array

        int [] arr={23,45,56,56,67,2,1,4,4,5};

        for(int i=0;i<arr.length/2;i++)
        {
            int temp=0;
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }

        // now print the modified array

        System.out.println("The reverse of the array is ........ ");

        for(int hh:arr)
        {
            System.out.print(hh+" ");
        }








    }
}
