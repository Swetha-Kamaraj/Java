import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime");
        }
        scanner.close();
    }
}

