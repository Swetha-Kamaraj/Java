// public class methods {
//     static void fun(String fname){
//         System.out.println(fname+"Nadar");
//     }
//     public static void main(String[] args) {
//         fun("Swetha ");
//         fun("Preetha ");
//     }
// }
//Method Overloading
class methods{
    static int myMethod(int x,int y){
        return x+y;
    }
    static double myMethod(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
        int num1=myMethod(9, 12);
        double num2=myMethod(9.7, 9.6);
        
        System.out.println(num1);
        System.out.println(num2);
    }
}