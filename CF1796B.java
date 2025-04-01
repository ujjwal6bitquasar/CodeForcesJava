import java.util.*;
public class CF1796B {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String a=sc.next();
            String b=sc.next();
            if(a.charAt(0)==b.charAt(0))
            {
                System.out.println("YES");
                System.out.println(a.charAt(0)+"*");
            }
            else if(a.charAt(a.length()-1)==b.charAt(b.length()-1))
            {
                System.out.println("YES");
                System.out.println("*"+a.charAt(a.length()-1));
            }
            else
            {
                if(a.length()>=2 && b.length()>=2)
                {
                    String consecutiveChar="";
                    int j;
                    for(j=0;j<a.length()-1;j++)
                    {
                       consecutiveChar+=a.charAt(j);
                       consecutiveChar+=a.charAt(j+1);
                       if(b.contains(consecutiveChar))
                       {
                        System.out.println("YES");
                        System.out.println("*"+consecutiveChar+"*");
                        break;
                       }
                    }    
                    if(j==a.length()-1)
                    {
                        System.out.println("NO");
                    }
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
