// public class multidimensional {
//     public static void main(String[] args) {
//         int num[][]=new int[4][4];
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4;j++){
//             num[i][j]=(int)(Math.random()*10);
//             }
//         }
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4;j++){
//             System.out.print(num[i][j]+" ");;
//             }
//             System.out.println();
//         }

//     }
// }
//Jaged Array
public class multidimensional{
    public static void main(String[] args) {
        int num[][]=new int[3][];
        // we have to mention the value
        num[0]=new int[3];
        num[1]=new int[2];
        num[2]=new int[4];
        for(int i=0;i<num.length;i++){
                        for(int j=0;j<num[i].length;j++){
                         num[i][j]=(int)(Math.random()*10);
                         }
                     }
                     for(int i=0;i<num.length;i++){
                         for(int j=0;j<num[i].length;j++){
                         System.out.print(num[i][j]+" ");;
                         }
                         System.out.println();
                     }
            
    }
}