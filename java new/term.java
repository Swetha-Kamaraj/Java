
/*to print user choice of n natural number and to print the sum */
import java.util.Scanner;

public class term {

    public static void main(String args[]) {

        int i, n, sum = 0;
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter any natural number");
            n = in.nextInt();
            in.close();
        }
        System.out.println("the n natural numbers are");
        for (i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;

        }
        System.out.println("The number is" + n + "the sum" + sum);

    }
}
