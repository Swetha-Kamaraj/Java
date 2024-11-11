
/*to find the sum and avg*/
import java.util.Scanner;

public class avg {
    public static void main(String args[]) {
        int i, n = 0, sum = 0;
        float avg;
        {
            System.out.println("Enter numbers");
        }
        for (i = 1; i <= 10; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            sum += n;

        }
        avg = sum / 10;
        System.out.println(sum);
        System.out.println(avg);

    }
}
