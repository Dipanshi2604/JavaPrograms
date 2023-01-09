import java.util.Scanner;

public class printTableOfNum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<10;i++)
        {
            System.out.println(i*num);
        }

        // for(; ;)
        // {
        //     System.out.println("Dipanshi is the best");
        // }
        //it will run infinite times
    }
}
