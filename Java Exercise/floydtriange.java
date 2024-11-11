import java.util.Scanner;
class floydtriange{
public static void main(String args[])
{
int row,num=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of rows you want:");
row=sc.nextInt();
sc.close();
for(int i=1;i<=row;i++){
    for(int j=1;j<=i;j++){
        System.out.print(num+" ");
        num++;
    }
    System.out.println();

}

}
}

