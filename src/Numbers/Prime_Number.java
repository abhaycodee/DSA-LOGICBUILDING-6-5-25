package Numbers;

public class Prime_Number {
    public static void main(String[] args) {


     int i,j,temp=0;

     for( i=1;i<100;i++)
     {
         for(j=2;j<i;j++) {
             if (i % j == 0) {
                 temp = temp + 1;
             }
         }

         if(temp==0)
         {
             System.out.print(j+" ");
         }
         else{
             temp=0;
         }



     }












    }
}
