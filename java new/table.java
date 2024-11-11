
/*to print user choice of table upto 10 */
import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        int i, n;
        System.out.println("Enter table to be calculated");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }
}
