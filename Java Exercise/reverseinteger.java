import java.util.Scanner;
public class reverseinteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n=sc.nextInt();
        int rev=0;
        sc.close();
        while (n>0) {
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;

            
        }
        System.out.println("reverse of the number is"+rev);
        
    }
}
