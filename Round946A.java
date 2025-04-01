import java.util.*;
public class Round946A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int screens=0;
            if(y%2==0)
            {
                screens+=y/2;
                int available=(screens)*7;
                int need=x-available;
                if(need>0)
                {
                    if(need%15==0)
                    {
                        screens+=need/15;
                    }
                    else
                    {
                        screens+=(need/15)+1;
                    }
                }
            }
            else
            {
                screens+=(y+1)/2;
                int available=((screens)*7)+4;
                int need=x-available;
                if(need>0)
                {
                    if(need%15==0)
                    {
                        screens+=need/15;
                    }
                    else
                    {
                        screens+=(need/15)+1;
                    }
                }
            }
            System.out.println(screens);
        }
        sc.close();
    }
}
