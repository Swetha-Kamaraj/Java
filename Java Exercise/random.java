import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random obj=new Random();
        for(int i=1;i<=5;i++){
        int a=obj.nextInt(1000);
        System.out.println("The random number  " + i +" is "+ a);
        }
    }
    
}
