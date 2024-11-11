// public class enhancefor {
//     public static void main(String[] args) {
//         int primes[]={2,3,7,11};
//         for(int t:primes){
//             System.out.println(t);
//         }
//     }
// }
//for strings
// public class enhancefor {
//     public static void main(String[] args) {
//         String primes[]={"swetha","preetha","Vennila","Kamaraj"};
//         for(String name:primes){
//             System.out.println(name);
//         }
//     }
// }
//Multipy
import java.util.Scanner;
public class enhancefor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the multiplicaion table");
        int n=sc.nextInt();
        sc.close();
        for(int c=1;c<=10;c++){
            System.out.println(n+"*"+c+"="+c*n);
        }
    }
}