// import java.util.Scanner;
// public class swap {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter x");
//         int x=sc.nextInt();
//         System.out.print("Enter y");
//         int y=sc.nextInt();
//         sc.close();
//         int temp;
//         System.out.println("Before swapping\n x="+x+",y="+y);

//         temp=x;
//         x=y;
//         y=temp;
//         System.out.println("After swaping\n x="+x+",y="+y);
        
//     }
// }
// now we are going to swap two number without using a temporary variable
import java.util.Scanner;
class swap
{
public static void main(String args[])
{
int x, y;
System.out.println("Enter x and y");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
in.close();
System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
//x=9,y=8
x = x + y;//x=9+8=17
y = x - y;//y=17-8=9
x = x - y;//x=17-9=8 so swaped.
System.out.println("After Swapping\nx = "+x+"\ny = "+y);
}
}
