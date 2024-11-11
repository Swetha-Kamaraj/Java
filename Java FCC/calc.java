import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number:");
        double number1=Double.parseDouble(sc.nextLine());

        System.out.print("Enter Second number:");
        double number2=Double.parseDouble(sc.nextLine());

        System.out.print("what operation do you need to do:");
        String op=sc.nextLine();
        switch (op) {
            case "sum":
                System.out.println(number1+number2);
                break;
            case "sub":
                 System.out.printf("%f-%f=%f",number1,number2,number1-number2);
                 break;
            default:
                System.out.println("wrong operation");
                break;
        }

        // if(op.equals("sum")){
        //     System.out.println(number1+number2);
        // }
        // else if(op.equals("sub")){
        //     System.out.printf("%f-%f=%f",number1,number2,number1-number2);
        // }
        // else if(op.equals("div")){
        //     if(number2==0){
        //         System.out.println("Cannot Divide by Zero");
        //     }
        //     else{
        //     System.out.println(number1/number2);
        //     }
        // }
        // else if(op.equals("mul")){
        //     System.out.println(number1*number2);
        // }
        // else{
        //     System.out.println("Wrong Calculation");
        // }
        sc.close();

    }
}
