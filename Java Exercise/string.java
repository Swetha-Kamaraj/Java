// import java.util.Scanner;
// public class stringcompare {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 1 string");
//         String str1=sc.nextLine();
//         System.out.println("Enter 2 string");
//         String str2=sc.nextLine();
//         sc.close();
//         if(str1.compareTo(str2)>0){
//             System.out.println(str1+"is bigger");

//         }
//         else{
//             System.out.println(str2+"is bigger");
//         }
//     }
   
//endswith
// }
// import java.util.Scanner;
// public class stringcompare{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string to find the endswith");
//         String str=sc.nextLine();

//         System.out.println("Enter the endswith string");
//         String end=sc.nextLine();
//         sc.close();
//         System.out.println(str.endsWith(end)+":"+end);
//     }
// }

//indexOf
// import java.util.Scanner;
// public class stringcompare{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string to find the index");
//         String str=sc.nextLine();
//         System.out.println("Enter the str index which is to be found");
//         String index=sc.nextLine();
//         sc.close();
//         int inde=str.indexOf(index);
//         System.out.println(inde);
//     }
// }

//replace string

//import java.util.Scanner;
// public class string{
//     public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         // System.out.println("Enter the string");
//         // String str=sc.nextLine();
//         // System.out.println("Enter the string to be replaced");
//         // String strReplace=sc.nextLine();
//         // String replaceString=str.replace(str,strReplace);
//         // System.out.println(replaceString);
//         // sc.close();
//         String s1="Swetha is a good girl";
//         String replaString=s1.replaceAll("girl","angel");
//         System.out.println(replaString);

//     }
// }
// public class string{
//     public static void main(String[] args) {
//         String str="java string split method by Technolamror";
//         //split is used to remove the letter or word from the string
//         String[] word=str.split("swetha");
//         for(String w:word){
//             System.out.print(w);
//         }
//         // trim is used to cut gap in front and in end
//         System.out.print(str.trim()+"Swetha");
//         System.out.println(str.toLowerCase());
//     }
// }
public class string{
    public static void main(String[] args) {
        String str="Swetha kamaraj studied at Anna university";
        int n;
        String replace,con;
        n=str.length();
        System.out.println(str+" length is:"+n);
        replace=str.replace("at", "in");
        System.out.println(str+":"+replace);
        con=str.concat(" BIT Campus");
        System.out.println(con);
    }
}