import java.util.Scanner;
public class matrixmul {
    public static void main(String[] args) {
        int row1,col1,row2,col2,i,j,k,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row and col of 1st matrix");
        row1=sc.nextInt();
        col1=sc.nextInt();

        int first[][]=new int[row1][col1];
        System.out.println("Enter elements of first matrix");
        for(i=0;i<row1;i++)
            for(j=0;j<col1;j++)
                first[i][j]=sc.nextInt();
            
        
        System.out.println("Enter number of row and col of 2nd matrix");
        row2=sc.nextInt();
        col2=sc.nextInt();

        

        if(col1!=row2){
            System.out.println("This matrix can not be multiplied");
        }
        else{
            int second[][]=new int[row2][col2];
            int multiply[][]=new int[row1][col2];
            System.out.println("Enter elements of second matrix");
            for(i=0;i<row2;i++)
                for(j=0;j<col2;j++)
                    second[i][j]=sc.nextInt();
                    for(i=0;i<row1;i++){
                      for(j=0;j<col2;j++){
                        for(k=0;k<=row2;k++){
                            sum=sum+first[i][k]*second[k][j];
                        }
                        multiply[i][j]=sum;
                        sum=0;
                      }
                    }
            System.out.println("The product of given matrix is");
            for ( i= 0 ; i < row1 ; i++ ){
                for ( j = 0 ; j < col2 ; j++)
                System.out.print(multiply[i][j]+"\t");
                System.out.print("\n");
                
                }
            }    
}
}
// import java.util.Scanner;
// class matrixmul
// {
// public static void main(String args[])
// {
// int m, n, p, q, sum = 0, c, d, k;
// Scanner in = new Scanner(System.in);
// System.out.println("Enter the number of rows and columns of first matrix");
// m = in.nextInt();
// n = in.nextInt();
// int first[][] = new int[m][n];
// System.out.println("Enter the elements of first matrix");
// for ( c = 0 ; c < m ; c++ )
// for ( d = 0 ; d < n ; d++ )
// first[c][d] = in.nextInt();
// System.out.println("Enter the number of rows and columns of second matrix");
// p = in.nextInt();
// q = in.nextInt();
// if ( n != p )
// System.out.println("Matrices with entered orders can't be multiplied with each other.");
// else
// {
// int second[][] = new int[p][q];
// int multiply[][] = new int[m][q];
// System.out.println("Enter the elements of second matrix");
// for ( c = 0 ; c < p ; c++ )
// for ( d = 0 ; d < q ; d++ )
// second[c][d] = in.nextInt();
// for ( c = 0 ; c < m ; c++ )
// {
// for ( d = 0 ; d < q ; d++ )
// {
// for ( k = 0 ; k < p ; k++ )
// {
// sum = sum + first[c][k]*second[k][d];
// }
// multiply[c][d] = sum;
// sum = 0;
// }
// }
// System.out.println("Product of entered matrices:-");
// for ( c = 0 ; c < m ; c++ )
// {
// for ( d = 0 ; d < q ; d++ )
// System.out.print(multiply[c][d]+"\t");
// System.out.print("\n");
// }
// }
// }
// }


