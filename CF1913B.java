import java.util.*;
public class CF1913B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            HashMap<Integer,Integer> frequency=new HashMap<>();
            for(int j=0;j<s.length();j++)
            {
                int c=s.charAt(j)-48;
                //System.out.println(c);
                if(frequency.containsKey(c))
                {
                    int f=frequency.get(c);
                    frequency.put(c,f+1);
                }
                else
                {
                    frequency.put(c,1);
                }
            }
            int j;
            for(j=0;j<s.length();j++)
            {
                int c=s.charAt(j)-48;
                if(c==0)
                {
                    if(frequency.containsKey(c+1))
                    {
                        int f=frequency.get(c+1);
                        if(f-1==0)
                        {
                            frequency.remove(c+1);
                        }
                        else
                        {
                            frequency.put(c+1,f-1);
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    if(frequency.containsKey(c-1))
                    {
                        int f=frequency.get(c-1);
                        if(f-1==0)
                        {
                            frequency.remove(c-1);
                        }
                        else
                        {
                            frequency.put(c-1,f-1);
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
            System.out.println(s.length()-j);
         }
         sc.close();
    }
}
