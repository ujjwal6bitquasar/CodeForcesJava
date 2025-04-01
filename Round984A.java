import java.util.*;
public class Round984A {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if(n>1)
            {
                int flag=0;
                int a=sc.nextInt();
                for(int j=1;j<n;j++)
                {
                    int b=sc.nextInt();
                    int melody=Math.abs(a-b);
                    if(melody!=5 && melody!=7)
                    {
                        flag=1;
                    }
                    a=b;
                }
                if(flag==0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else
            {
                System.out.println("NO");
            }
            
        }
        sc.close();
    }
}
