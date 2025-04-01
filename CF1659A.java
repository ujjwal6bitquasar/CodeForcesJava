import java.util.Scanner;

public class CF1659A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            int div=r/(b+1);
            int rem=r%(b+1);
            int parts=0;
            String ans="";
            while(parts<b+1)
            {
                if(parts<rem)
                {
                    for(int j=0;j<(div+1);j++)
                    {
                        ans+="R";
                    }
                    parts++;
                }
                else
                {
                    for(int j=0;j<div;j++)
                    {
                        ans+="R";
                    }
                    parts++;
                }
                if(parts!=b+1)
                {
                    ans+="B";
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
