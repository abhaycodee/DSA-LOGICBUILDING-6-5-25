package Numbers;

public class Find_Prime_Number {
    public static void main(String[] args) {



        // wap to find the prime number

        int temp=0;
        int number = 5;

        for(int i=2;i<number ;i++)
        {
            if(number%i==0)
            {
                temp=temp+1;
            }
        }


        if(temp==0)
        {
            System.out.println("number is prime ..");
        }
        else{
            System.out.println("number is not prime ...");
        }












    }
}
