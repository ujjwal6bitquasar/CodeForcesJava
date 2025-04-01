import java.util.*;
public class Round949A {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int max=0;
            for(int j=l;j<=r;j++)
            {
                int score=calculateScore(j,0);
                if(score>max)
                max=score;
            }
            System.out.println(max);
        }
        sc.close();

    }

    private static int calculateScore (int x,int currScore) {
        if(x==1)
        return currScore;
        int p=2;
        for(p=2;p<=x;p++)
        {
            if(x%p==0)
            break;
        }
        return calculateScore(x/p,currScore+1);
    }
}
