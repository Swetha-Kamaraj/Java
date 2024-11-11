//implicit conversion in this small int is converted into big double it is possible
// public class typeconversion {
//     public static void main(String[] args) {
//         int number1=9;
//         double number2=number1;
//         System.out.println(number2);
//     }
    
// }
// now we are going to convert double to int but it is impossible 
// public class typeconversion{
//     public static void main(String[] args) {
//         double number1=9.8;
//         int number2=number1;//literal string
//         System.out.println(number2);
//     }
// }
//Now we are going to do explicit conversion to let know the compiler that we want to convert
public class typeconversion{
    public static void main(String args[]){
        double number1=9.8;
        int number2=(int) number1;
        System.out.println(number2);

    }
}