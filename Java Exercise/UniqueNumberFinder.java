// public class alphabet {
//     public static void main(String[] args) {
//         char ch;
//         for(ch='a';ch<='z';ch++){
//             System.out.print(ch+" ");
//         }
//     }
// }
//fb pass:password@2003
public class UniqueNumberFinder {
    public static void main(String[] args) {
        int arr[] = {1, 4,5,5,4,3};
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            boolean isUnique = true;
            for (int j = 0; j < size; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);
            }
        }
    }
}
