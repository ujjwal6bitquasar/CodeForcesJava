import java.util.*;
public class Round990 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] pieces=new int[n];
            for(int j=0;j<n;j++)
            {
                pieces[j]=sc.nextInt();
            }
            int index=0;
            int sum=0;
            int layerCount=1;
            int countIncrement=8;
            int currLayer=1;
            int happyCount=0;
            while(index<n)
            {
                if(sum<layerCount)
                {
                    sum+=pieces[index];
                    index++;
                }
                else if(sum>layerCount)
                {
                    layerCount+=countIncrement;
                    currLayer++;
                    countIncrement=8*currLayer;
                }
                else
                {
                    happyCount++;
                    sum+=pieces[index];
                    index++;
                }
            }
            if(sum==layerCount)
            {
                happyCount++;
            }
            else if(sum>layerCount)
            {
                layerCount+=countIncrement;
                currLayer++;
                countIncrement=8*currLayer;
                if(sum==layerCount)
                {
                    happyCount++;
                }
            }
            System.out.println(happyCount);
        }
        sc.close();
        
    }
    // private static boolean isHappy(int sum, int layer)
    // {
    //     for(int i=0)
    // }
}
