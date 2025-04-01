import java.util.*;
public class Round947A {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int flag=0;
            int j;
            for(j=0;j<n-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    if(flag==1 || a[j+1]>a[0])
                    {
                        System.out.println("No");
                        break;
                    }
                    else
                    {
                        flag=1;
                    }
                }
                else if(flag==1)
                {
                    if(a[j+1]>a[0])
                    {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(j==n-1)
            {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
