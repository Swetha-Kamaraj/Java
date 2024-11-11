/*To  print the  n  natural number and find the sum of  the number */
public class sum {
    public static void main(String args[]) {
        int i, sum = 0;
        System.out.println("the n numbers are");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("the sum is");
        System.out.println(sum);

    }
}
