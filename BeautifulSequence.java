import java.util.*;

public class BeautifulSequence {

    public static void longestBeautifulSequence(long N, long M) {
        List<Long> possibleNumbers = new ArrayList<>();
        
        // Collect numbers between N and M that when ANDed with N give N
        for (long x = N; x <= M; x++) {
            if ((x & N) == N) {
                possibleNumbers.add(x);
            }
        }
        
        if (possibleNumbers.size() < 2) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(possibleNumbers.size());
        for (long num : possibleNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            longestBeautifulSequence(N, M);
        }
        sc.close();
    }
}
