/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex24 {
    public static void main(String[] args) {
        StdOut.print("请输入第一个数字:");
        int num1 = StdIn.readInt();
        StdOut.print("请输入第二个数字:");
        int num2 = StdIn.readInt();
        StdOut.println(gcd(num1, num2));
    }

    public static int gcd(int p, int q) {
        StdOut.println(p);
        StdOut.println(q);
        StdOut.println(' ');
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
