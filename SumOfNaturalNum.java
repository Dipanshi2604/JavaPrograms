public class SumOfNaturalNum {
    static int sumOfn(int num)
    {
        if(num==1)
            return 1;
        else
            return num+sumOfn(num-1);
    }
    public static void main(String[] args) {
        int n=10;
        int result=sumOfn(n);
        System.out.println("sum of n natural number is "+result);
    }
}
