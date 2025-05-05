package Sorting;

public class Merge_Sort {

    public static void divide(int [] arr,int si,int ei)
    {
        if (si >= ei) return;

        {
            int mi=(si+ei)/2;
            divide(arr,si,mi);
            divide(arr,mi+1,ei);
            conquer(arr,si,mi,ei);
        }


    }
public static void conquer(int [] arr,int si , int mi, int ei)
{

    int[] temp = new int[ei - si + 1];

    int li=si;
    int ri=mi+1;
    int x=0;
    while(li<=mi&&ri<=ei)
    {
        if(arr[li]>arr[ri])
        {
            temp[x++]=arr[ri++];
        }
        else{
            temp[x++]=arr[li++];
        }
    }
while(li<=mi)
{
    temp[x++]=arr[li++];
}

    while(ri<=ei)
    {
        temp[x++]=arr[ri++];
    }


    for (int i = 0; i < temp.length; i++) {
        arr[si + i] = temp[i];
    }



}

    public static void main(String[] args) {

int [] arr={34,67,4,7,9,2,5,2,567,345,8345,781,234,5};
int size=arr.length;
int si=0;
int ei=size-1;



divide(arr,si,ei);

        System.out.println("the sorted array is .......");

        for(int jk:arr)
        {
            System.out.print(jk+" ");
        }



    }
}
