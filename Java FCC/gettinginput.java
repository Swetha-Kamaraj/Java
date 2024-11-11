// import java.util.Scanner;
// public class gettinginput {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("What is your name?");
//         String name=sc.nextLine();
//         System.out.printf("hello %s how are you .What is your age",name);
//         int age=sc.nextInt();
//         //cleans up input buffer
//         sc.nextLine();
//         System.out.printf("%d is an excellent age to code.which language do you prefer",age);    
//         String lan=sc.nextLine();
//         System.out.printf("%s is easy language",lan);
//         sc.close();
//     }
// }
import java.util.Scanner;
public class gettinginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is your name?");
        String name=sc.nextLine();
        System.out.printf("hello %s how are you .What is your age",name);
        //below line is used to parse the interger by using nextLine
        int age=Integer.parseInt(sc.nextLine());
        
        System.out.printf("%d is an excellent age to code.which language do you prefer",age);    
        String lan=sc.nextLine();
        System.out.printf("%s is easy language .Tell us your gpa",lan);
        double gpa=Double.parseDouble(sc.nextLine());
        System.out.printf("%f is good gpa",gpa);
       
        sc.close();

    }
}
