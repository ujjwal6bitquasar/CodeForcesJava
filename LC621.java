import java.util.ArrayList;
import java.util.HashMap;

public class LC621 {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> freq=new HashMap<>();
        ArrayList<Character> unique=new ArrayList<>();
        for(int i=0;i<tasks.length;i++)
        {
            if(freq.containsKey(tasks[i]))
            {
                int f=freq.get(tasks[i]);
                freq.put(tasks[i],f+1);
            }
            else
            {
                freq.put(tasks[i],1);
                unique.add(tasks[i]);
            }
        }
        int ans=0;
        while(unique.size()>0)
        {
            if(unique.size()>n)
            {
                ans+=unique.size();
            }
            else
            {
                ans+=n+1;
            }
            for(int i=0;i<unique.size();i++)
            {
                char c=unique.get(i);
                int f=freq.get(c);
                if(f==1)
                {
                    freq.remove(c);
                    unique.remove(i);
                }
                else
                {
                    freq.put(c,f-1);
                }
            }
        }
        return ans;
        
    }
}
