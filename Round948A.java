import java.util.*;
public class Round948A {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m>n || (n-m)%2!=0)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
        sc.close();
    }
}
