import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args) {
        int a=0,b=0,c=1,num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Fibonaci series is: ");
        for (int i=0;i<num;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
        }
    }
}
