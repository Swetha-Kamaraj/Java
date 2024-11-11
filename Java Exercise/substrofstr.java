import java.util.Scanner;
class substrofstr
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
    String str=sc.nextLine();
    sc.close();

    for(int i=0;i<str.length();i++)//left (1,2)
    {
        for(int j=1;j<=str.length()-i;j++)//right(1,4) hello
        {
            System.out.println(str.substring(i, i+j));
        }
    }


}
}


