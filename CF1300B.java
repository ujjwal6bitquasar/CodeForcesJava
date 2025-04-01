import java.util.*;
public class CF1300B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] students=new int[2*n];
            for(int j=0;j<2*n;j++)
            {
                students[j]=sc.nextInt();
            }
            Arrays.sort(students);
            int medianIndex=n/2;
            int medianIndex1=1+2*medianIndex;
            int medianIndex2=2*(medianIndex+1);
            int difference=Math.abs(students[medianIndex1-1]-students[medianIndex2-1]);
            System.out.println(difference);
        }
        sc.close();
    }
}
