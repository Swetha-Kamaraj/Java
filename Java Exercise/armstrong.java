import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be checked ");
        int num=sc.nextInt();
        int rem,temp,arm=0;
        temp=num;
        while (num>0) {
            rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10;

        }
        if(arm==temp){
            System.out.println(temp +" is a armstrong");
        }
        else{
            System.out.println(temp +" is not a armstrong");
        }
        sc.close();
    }
}
//https://www.naukri.com/code360/guided-paths/aptitude-preparation/content/118505/offering/1380865
