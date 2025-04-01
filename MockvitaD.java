import java.util.*;
public class MockvitaD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] tableGraph=new int[m][n];
        int[][] scores=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                tableGraph[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i-1>=0 && i-1<m && tableGraph[i-1][j]<=tableGraph[i][j])
                {
                    scores[i][j]+=scores[i-1][j]+1;
                }
                if(j-1>=0 && j-1<m && tableGraph[i][j-1]<=tableGraph[i][j])
                {
                    scores[i][j]+=scores[i][j-1]+1;
                }
                if(scores[i][j]==k)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
        sc.close();
    }
}
