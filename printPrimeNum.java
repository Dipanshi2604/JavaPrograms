import java.util.Scanner;

public class printPrimeNum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //checks prime number upto n
        for(int i=1;i<=num;i++)
        {
            int prime=1;//assume it is a prime
            for(int j=2;j<=Math.sqrt((double)i);j++)
            {
                if(i%j==0)
                {
                    prime=0;//fails the contradiction
                    break;
                }
            }
            if(prime==1)
                System.out.println(i);
        }

    }
}
