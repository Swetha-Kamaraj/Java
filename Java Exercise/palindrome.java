import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be checked:");
        int number=sc.nextInt();

        int temp=number;
        int rem,sum=0;

        while(number>0){
            rem=number%10;
            sum=(sum*10)+rem;
            number=number/10;
        }
        if(sum==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
