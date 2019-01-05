/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex26 {
    public static void main(String[] args) {
        StdOut.print("请输入数字a:");
        int a = StdIn.readInt();
        StdOut.print("请输入数字b:");
        int b = StdIn.readInt();
        StdOut.print("请输入数字c:");
        int c = StdIn.readInt();
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        if (a < b && b < c) {
            StdOut.println("排序成功");

        }
        else {
            StdOut.println("排序失败");
        }
        StdOut.printf("结果为a:%d,b:%d,c:%d", a, b, c);
    }
}
