import java.util.Scanner;
public class matrixadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mat1,mat2;
        System.out.println("Enter number of row and colums");
        mat1=sc.nextInt();
        mat2=sc.nextInt();

        int first[][]=new int[mat1][mat2];
        int second[][]=new int[mat1][mat2];
        int sum[][]=new int[mat1][mat2];
        System.out.println("Enter first matrix");

        for(int i=0;i<mat1;i++){
            for(int j=0;j<mat2;j++){
                first[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter second matrix");

        for(int i=0;i<mat1;i++){
            for(int j=0;j<mat2;j++){
                second[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<mat1;i++){
            for(int j=0;j<mat2;j++){
                sum[i][j]=first[i][j]+second[i][j];
            }
        }
        System.out.println("Sum of matrix:");
        for(int i=0;i<mat1;i++){
            for(int j=0;j<mat2;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
        


    }
    
}
// import java.util.Scanner;
// class matrixadd
// {
// public static void main(String args[])
// {
// int m, n, c, d;
// Scanner in = new Scanner(System.in);
// System.out.println("Enter the number of rows and columns of matrix");
// m = in.nextInt();
// n = in.nextInt();
// int first[][] = new int[m][n];
// int second[][] = new int[m][n];
// int sum[][] = new int[m][n];
// System.out.println("Enter the elements of first matrix");
// for ( c = 0 ; c < m ; c++ )
// for ( d = 0 ; d < n ; d++ )
// first[c][d] = in.nextInt();
// System.out.println("Enter the elements of second matrix");
// for ( c = 0 ; c < m ; c++ )
// for ( d = 0 ; d < n ; d++ )
// second[c][d] = in.nextInt();
// for ( c = 0 ; c < m ; c++ )
// for ( d = 0 ; d < n ; d++ )
// sum[c][d] = first[c][d] + second[c][d]; //replace '+' with '-'to subtract matrices
// System.out.println("Sum of entered matrices:-");
// for ( c = 0 ; c < m ; c++ )
// {
// for ( d = 0 ; d < n ; d++ )
// System.out.print(sum[c][d]+"\t");
// System.out.println();
// }
// }
// }
