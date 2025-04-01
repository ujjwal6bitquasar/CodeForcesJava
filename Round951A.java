import java.util.Scanner;

public class Round951A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int end=2;
            int currMax=Math.max(a[0],a[1]);
            int min=currMax;
            while(end<n)
            {
                if(a[end]>currMax)
                {
                    if(a[end]<min)
                    {
                        min=a[end];
                    }
                    if(end+2<n)
                    {
                        currMax=Math.max(a[end+1],a[end+2]);
                    }
                    end=end+3;
                }
                else
                {
                    end+=1;
                }
            }
            System.out.println(min-1);  
        }
        sc.close();

    }
}
