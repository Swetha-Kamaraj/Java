import java.util.Scanner;
public class matrixtranspose{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int matrix[][]=new int[r][c];
        System.out.println("Enter the Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int transpose[][]=new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=matrix[i][j];
                
            }
        }
        System.out.println("The transpose of entered matrix is");

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.print("\n");
        }
        sc.close();
        
    }
}