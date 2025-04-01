import java.util.*;
public class Round947B {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                if(a[j]<min)
                {
                    min=a[j];
                }
            }
            int divisor2=0;
            int j=0;
            for(j=0;j<n;j++)
            {
                if(a[j]%min!=0)
                {
                    if(divisor2==0)
                    {
                        divisor2=a[j];
                    }
                    else if(a[j]<divisor2)
                    {
                        if(divisor2%a[j]==0)
                        {
                            divisor2=a[j];
                        }
                        else
                        {
                            System.out.println("NO");
                            break;
                        }
                    }
                    else if(a[j]%divisor2!=0)
                    {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(j==n)
            {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
