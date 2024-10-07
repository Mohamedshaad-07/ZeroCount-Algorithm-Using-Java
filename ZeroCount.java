

import java.util.Scanner;

public class ZeroCount {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int L = scanner.nextInt();
        int K = scanner.nextInt();
        
        // Call the function to find the longest consecutive zeros
        System.out.println(longestConsecutiveZeros(L, K));
        
        scanner.close();
    }

    public static int longestConsecutiveZeros(int L, int K) {
        if (K == L) {
            return 0;  // All ones, no zeros
        } else if (K == 0) {
            return L;  // All zeros
        } else {
            int zeros = L - K;  // Total zeros
            int gaps = K + 1;   // Gaps between ones
            int q = zeros / gaps; // Base zeros in each gap
            int r = zeros % gaps; // Remainder zeros

            // The largest block of zeros will be q if no extra zero is added, or q + 1 if it is
            return (r > 0) ? (q + 1) : q;
        }
    }
}
