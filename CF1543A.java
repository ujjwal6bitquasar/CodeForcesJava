import java.util.Scanner;

public class CF1543A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b)
            {
                
                System.out.println(0+" "+0);
            }
            else
            {
                long diff=Math.abs(a-b);
                long moves1;
                if(a!=0)
                {
                    moves1=a%diff;
                }
                else
                {
                    moves1=b%diff;
                }
                long moves2=diff-moves1;
                long moves=Math.min(moves1,moves2);
                System.out.println(diff+" "+moves);
            }
            
        }
        sc.close();
    }
}
