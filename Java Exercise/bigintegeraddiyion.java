import java.util.Scanner;
import java.math.BigInteger;
public class bigintegeraddiyion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer 1 and 2");
        String num1=sc.nextLine();
        String num2=sc.nextLine();
        sc.close();
        BigInteger first=new BigInteger(num1);
        BigInteger sec=new BigInteger(num2);
        BigInteger sum;
        sum=first.add(sec);
        System.out.println("The after addition number is"+sum);
    }    
}
