import java.util.*;
public class Round945A {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            int p3=sc.nextInt();
            if((p1+p2+p3)%2==1)
            {
                System.out.println(-1);
            }
            else
            {
                int v1=(p1+p2+p3)/2;
                int v2=p1+p2;
                int ans=Math.min(v1,v2);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
