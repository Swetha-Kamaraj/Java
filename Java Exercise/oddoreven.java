import java.util.Scanner;
public class oddoreven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Integer:");
        int number=sc.nextInt();
        
        if(number%2==0){
            System.out.printf("%d is an even number",number);
        }
        else{
            System.out.printf("%d is a odd number",number);
        }

        sc.close();
    }
}