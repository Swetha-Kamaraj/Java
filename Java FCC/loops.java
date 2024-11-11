// public class loops {
//     public static void main(String[] args) {
//         for(int num=1;num<=10;num++){
//             System.out.print(num);
//         }
//     }
// }
// public class loops{
//     public static void main(String[] args) {
//         int num[]={1,2,3,4,5};
//         int sum=0;
//         for(int index=0;index<num.length;index++){
//             sum+=num[index];
//         }
//         System.out.println(sum);
//     }
// }
//program to write the multiplication table
// public class loops{
//     public static void main(String[] args) {
//         int num=10;
//         for(int multi=1;multi<=10;multi++){
//             System.out.printf("%d * %d = %d \n",num,multi,num*multi);
//         }
//     }
// }
//program for nested for loop to print all multiplication table

// public class loops{
//     public static void main(String[] args) {
//         for(int num=1;num<=10;num++){

//             for(int multi=1;multi<=5;multi++){

//                 System.out.printf("%d * %d = %d \n",multi,num,num*multi);
//             }

//         }
//     }
// }
//program to find the odd numbers 
// public class loops{
//     public static void main(String[] args) {
//         for (int num=1; num<=20;num++){
//             if(num%2==1){
//                 System.out.println(num);
//             }

//         }
//     }
// }
//while loops
// public class loops{
//     public static void main(String[] args) {
//         int num=5;
//         int multi=1;
//         while (multi<=10) {
//             System.out.printf("%d * %d = %d \n",num,multi,num*multi);
//             multi++;
//         }
//     }
// }
//do-while loops
public class loops{
    public static void main(String[] args) {
        int num=4;
        int multi=1;
        do{
            System.out.printf("%d * %d = %d \n",num,multi,num*multi);
            multi++; 
        }
        while(multi<=10);

    }
}