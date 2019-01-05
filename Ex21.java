import edu.princeton.cs.algs4.StdIn;

public class Ex21 {
    public static void main(String[] args) {
        System.out.print("请输入要统计的总人数:");
        int index = StdIn.readInt();
        String[] nameArray = new String[index];
        int[][] dataArray = new int[index][2];
        for (int i = 0; i < index; i++) {
            System.out.print("请输入球员姓名:");
            nameArray[i] = StdIn.readString();
            System.out.print("请输入命中数:");
            dataArray[i][0] = StdIn.readInt();
            System.out.print("请输入投篮总数:");
            dataArray[i][1] = StdIn.readInt();
        }
        System.out.println("------------------------");
        System.out.println("|name|hit |shoot| rate |");
        System.out.println("------------------------");
        for (int i = 0; i < nameArray.length; i++) {
            System.out
                    .printf("|%4s|%4d|%5d|%6.3f|\n", nameArray[i], dataArray[i][0], dataArray[i][1],
                            (float) dataArray[i][0] / dataArray[i][1]);
            if (i + 1 < nameArray.length) {
                System.out.println("------------------------");
            }
        }
        System.out.println("------------------------");
    }
}
