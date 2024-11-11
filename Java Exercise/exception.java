//try catch block
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numerator: ");
        a=sc.nextInt();
        System.out.print("Enter Denominator: ");
        b=sc.nextInt();
        int result;
        try{
            result=a/b;
            System.out.println("result="+result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero caught");
        }
        finally{
            System.out.println("Finally always executes");
        }

        sc.close();
    }
}

//throw error 
// import java.util.Scanner;
// public class exception{
//     public static void main(String[] args) {
//         int age;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your Age");
//         age=sc.nextInt();
//         sc.close();
//             if(age<18){
//                 throw new ArithmeticException("You are under age");
//             }
//             else{
//                 System.out.println("You are eligible for voting");
//             }
//     }
// }
