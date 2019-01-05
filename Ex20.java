/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class Ex20 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        System.out.println(ln(N));
    }

    /**
     * 递归计算ln(N!) N! = 1 x 2 x 3 x...x (n-1) x n log(ab) = log(a) + log(b)
     *
     * @param N
     * @return ans
     */
    private static double ln(int N) {
        if (N == 1)
            return 0;
        return ln(N - 1) + Math.log(N);
    }
}
