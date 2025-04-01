import java.util.*;
public class Round991 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int sum=0;
            int count=0;
            int j;
            for(j=0;j<n;j++)
            {
                String s=sc.next();
                sum+=s.length();
                if(sum<=m)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
