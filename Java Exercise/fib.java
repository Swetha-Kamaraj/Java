import java.util.Scanner;
public class fib{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the count");
        int count=sc.nextInt();

        int n1=0;
        int n2=1;
        int n3;

        System.out.print(n1+" "+n2);
        for(int i=2;i<=count;i++){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);

        }
        sc.close();
    }
}