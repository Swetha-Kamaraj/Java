// public class pattern1 {
//     public static void main(String[] args) {
        
//         for(int row=1;row<=5;row++){
//             for(int col=1;col<=row;col++){
//                 //System.out.print(row);
//                 //System.out.print("*");
//                 System.out.print(col);
//             }
//             System.out.println();
//         }
//     }
// }
// public class pattern1 {
//     public static void main(String[] args) {
        
//         for(int row=5;row>=1;row--){
//             for(int col=1;col<=row;col++){
//                 //System.out.print(row);
//                 System.out.print("*");
//                 //System.out.print(col);
//             }
//             System.out.println();
//         }
//     }
// }
public class pattern1 {
    public static void main(String[] args) {
        
        for(int row=3;row>=1;row--){
            for(int col=3;col>=row;col--){
                //System.out.print(row);
                //System.out.print("*");
                System.out.print(col);
            }
            System.out.println();
        }
    }
}