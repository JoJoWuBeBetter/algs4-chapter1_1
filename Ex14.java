/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class Ex14 {

    private static int lg(int N) {
        int i = 0;
        while (N >= 2) {
            i++;
            N /= 2;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.print(lg(9));
    }
}
