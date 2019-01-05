/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class Ex22 {
    public static void main(String[] args) {
        int[] numArray = new int[100];
        for (int i = 0; i < 100; i++) {
            numArray[i] = i + 1;
        }
        System.out.println(rank(numArray));
    }

    private static int rank(int[] a) {
        return rank(10, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int lo, int hi,
                            int times) {  //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        StringBuilder f = new StringBuilder("  ");
        for (int i = 0; i < times; i++) {
            f.append("  ");
        }
        System.out.printf(f + "lo:%d hi:%d\n", lo, hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, times + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, times + 1);
        else return mid;
    }
}
