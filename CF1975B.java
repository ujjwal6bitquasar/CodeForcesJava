import java.util.ArrayList;
import java.util.Scanner;

public class CF1975B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                if(a[j]<min)
                {
                    min=a[j];
                }
            }
            int minRem=Integer.MAX_VALUE;
            ArrayList<Integer> remaining=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(a[j]%min!=0)
                {
                    remaining.add(a[j]);
                    if(a[j]<minRem)
                    {
                        minRem=a[j];
                    }
                }
            }
            if(remaining.size()!=0)
            {
                int j;
                for(j=0;j<remaining.size();j++)
                {
                    if(remaining.get(j)%minRem!=0)
                    {
                        System.out.println("NO");
                        break;
                    }
                }
                if(j==remaining.size())
                System.out.println("YES");
            }
            else
            {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
