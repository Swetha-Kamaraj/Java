public class Insertionsort {
    public static void main(String[] args) {
        int arr[]={3,6,2,1,5};
        
        
        System.out.println("Before sorting");
        for(int ar:arr){
            System.out.print(ar+" ");
        }

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
        
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
    System.out.println();
    System.out.println("After sorting");
        for(int ar:arr){
            System.out.print(ar+" ");
        }

        
    }
    
}
