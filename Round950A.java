import java.util.*;
public class Round950A {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String bank=sc.next();
            HashMap<Character,Integer> charFreq=new HashMap<>();
            for(int j=0;j<n;j++)
            {
                char c=bank.charAt(j);
                if(charFreq.containsKey(c))
                {
                    int f=charFreq.get(c)+1;
                    charFreq.put(c,f);
                }
                else
                {
                    charFreq.put(c,1);
                }
            }
            int ans=0;
            for(char j='A';j<='G';j++)
            {
                if(charFreq.containsKey(j))
                {
                    int f=charFreq.get(j);
                    if(f<m)
                    {
                        ans+=m-charFreq.get(j);
                    }
                }
                else
                {
                    ans+=m;
                }
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
