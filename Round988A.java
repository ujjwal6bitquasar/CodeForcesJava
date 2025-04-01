import java.util.*;
public class Round988A {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            HashMap<Integer,Integer> freq=new HashMap<>();
            for(int j=0;j<n;j++)
            {
                if(freq.containsKey(arr[j]))
                {
                    int f=freq.get(arr[j]);
                    freq.put(arr[j],f+1);
                }
                else
                {
                    freq.put(arr[j],1);
                }
            }
            int score=0;
            for(int j=0;j<n;j++)
            {
                score+=(freq.get(arr[j])/2);
                freq.put(arr[j],0);
            }
            System.out.println(score);
        }
        sc.close();
    }
}
