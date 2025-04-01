import java.util.*;
public class MockvitaB {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String binNum=sc.next();
            int A=sc.nextInt();
            int B=sc.nextInt();
            if(A<B)
            {
                int checkLength=countZero(binNum);
                if(checkLength==-1)
                {
                    System.out.println("INVALID");
                }
                else
                {
                    int halfHamming=0;
                    for(int j=0;j<checkLength;j++)
                    {
                        char c=binNum.charAt(j);
                        if(c==49)
                        halfHamming++;
                    }
                    System.out.println(halfHamming*2);
                }
            }
            else
            {
                int checkLength=countZero(binNum);
                if(checkLength==-1)
                {
                    System.out.println("INVALID");
                }
                else
                {
                    int halfHamming=0;
                    for(int j=0;j<binNum.length()-checkLength;j++)
                    {
                        char c=binNum.charAt(j);
                        if(c==48)
                        halfHamming++;
                    }
                    System.out.println(halfHamming*2);
                }
            }
        }
        sc.close();
    }
    public static int countZero (String binaryNum)
    {
        int count=0;
        int flag=0;
        int len=binaryNum.length();
        for(int i=0;i<len;i++)
        {
            char c=binaryNum.charAt(i);
            if(c==48)
            {
                count++;
            }
            else if(c==49)
            {
                continue;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        return count;
        else 
        return -1;
    }
}
