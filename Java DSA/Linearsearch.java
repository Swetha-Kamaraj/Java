
// public class Linearsearch{
//     public static void main(String[] args) {
//         int nums[]={2,3,5,6,8,1};
//         int target=6;

    //     int result=lS(nums,target);

    //     if(result!=-1){
    //         System.out.println("Element found at the index of:"+result);
    //     }
    //     else{
    //         System.out.println("Element not Found");
    //     }
    // }

    // public static int lS(int[] nums, int target) {
    //     for(int i=0;i<=nums.length;i++){
    //         if(nums[i]==target){
    //             return i;
    //         }

    //     }
    //     return -1;
//     }
    
// }
import java.util.Scanner;
public class Linearsearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
       
        System.out.println("Enter the arrSize");
        int arrSize=sc.nextInt();
        int[] arr=new int[arrSize];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arrSize;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Elements of the array are:");
        for(int i=0;i<arrSize;i++){
            
            System.out.print("\t"+arr[i]);
        }
        
        System.out.println("\nEnter the elements to be found:");
        int target=sc.nextInt();
        sc.close();

        int result=lS(arr,target);
        

        if(result!=-1){
            System.out.println("Element found at the index of:"+result);
        }
        else{
            System.out.println("Element not Found");
        }
    }

    public static int lS(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
        

    }
}