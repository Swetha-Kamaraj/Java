// import java.util.Scanner;
// public class fact{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number");
//         int num=sc.nextInt();
//         sc.close();
//         int fact=1;

//         for(int i=1;i<=num;i++){
//             fact=fact*i;
//         }
//         System.out.println(fact);
//     }
// }
import java.util.Scanner;
import java.math.BigInteger;
class fact
{
public static void main(String args[])
{
int n, c;
BigInteger inc = new BigInteger("1");
BigInteger fact = new BigInteger("1");
Scanner input = new Scanner(System.in);
System.out.println("Input an integer");
n = input.nextInt();
input.close();
for (c = 1; c <= n; c++) {
fact = fact.multiply(inc);
inc = inc.add(BigInteger.ONE);
}
System.out.println(n + "! = " + fact);

}
}

