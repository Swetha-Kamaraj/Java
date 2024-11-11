import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the tempature in Faherenheit:");
        float tem=sc.nextFloat();
        sc.close();

        tem=((tem-32)*5)/9;
        //if celsius to faherheit conversion use below line
        //tem=(tem*9/5)+32;
        System.out.println("In celesius is"+tem);
        
    }
    
}
