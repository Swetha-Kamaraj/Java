import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integers");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        sc.close();
        if(x>y && x>z) System.out.println(x+"   is greater");
        if(y>x && y>z) System.out.println(y+"   is greater");
        if(z>y && x<z) System.out.println(z+"   is greater");
        

    
        
    }
}
