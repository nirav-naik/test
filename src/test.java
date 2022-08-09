import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        int a[]={5,10,15,20,25,30,35};
        System.out.println("Enter the number to be search: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int last=a.length-1;
        int mid=(first+last)/2;
        while (first<=last)
        {
            if(a[mid]<n)
            {
                first=mid+1;
            }
            else if (a[mid]==n)
            {
                System.out.println("Element is found at index: "+mid);
                break;
            }
            else
            {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println("The element is not found");
        }
    }
}
