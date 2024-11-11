// public class BinarySearch {
//     public static void main(String[] args) {
//         int nums[]={2,3,4,5,6};
//         int target=6 ;
       

//         int result=bs(nums,target);

//         if(result!=-1){
//             System.out.println("Element found at the index of : "+result);
//         }
//         else{
//             System.out.println("Element not found");
//         }
//     }
//     public static int bs(int[] nums,int target){

//         int left=0;
//         int right=nums.length-1;

//         while (left<=right) {
//             int mid=(left+right)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(nums[mid]<target){
//                 left=mid+1;
//             }
//             else {
//                 right=mid-1;
//             }
            
            
//         }
//         return -1;
//     }

    
// }

//Binary search using Recursion
public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={2,3,4,5,6};
        int target=2 ;
        int left=0;
        int right=nums.length-1;
       

        int result=bs(nums,target,left,right);

        if(result!=-1){
            System.out.println("Element found at the index of : "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int bs(int[] nums,int target,int left ,int right){

        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                    return mid;
            }
            else if(nums[mid]<target){
                return bs(nums, target, mid+1, right);
            }
            else {
                return bs(nums, target, left, mid-1);
            }
        }

        
        return -1;
    }

    
}
