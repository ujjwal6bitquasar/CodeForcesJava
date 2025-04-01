/**
 * 1971D
 */
import java.util.*;
public class CF1971D {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            char prev='n';
            int cut=0;
            boolean used=false;
            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                if(prev=='n')
                {
                    cut++;
                }
                else if(c=='0' && prev=='1')
                {
                    cut++;
                }
                else if(c=='1' && prev=='0')
                {
                    if(used)
                    {
                        cut++;
                    }
                    else
                    {
                        used=true;
                    }
                }
                prev=c;
            }
            System.out.println(cut);
        }
        sc.close();
    }
}