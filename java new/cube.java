
/*to find cube of user choice */
import java.util.Scanner;

public class cube {
    public static void main(String args[]) {
        int i, n;
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("the cube of" + i + "cube" + (i * i * i));
        }

    }
}
