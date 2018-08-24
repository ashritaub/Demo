import java.util.Scanner;
 
class AddTwoMatrix
{
   public static void main(String args[])
   {
      int i,j,m,n;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the size of a matrix");
      m = in.nextInt();
      n  = in.nextInt();
 
      int mat1[][] = new int[m][n];
      int mat2[][] = new int[m][n];
      int mat3[][] = new int[m][n];
 
      System.out.println("Enter the first matrix elements");
 
      for (  i = 0 ; i < m ; i++ )
         for ( j = 0 ; j < n ; j++ )
            mat1[i][j] = in.nextInt();
 
      System.out.println("Enter the second matrix elements");
 
      for ( i = 0 ; i < m ; i++ )                                                  
         for ( j = 0 ; j < n ; j++ )
            mat2[i][j] = in.nextInt();
 
      for ( i = 0 ; i< m ; i++ )
         for ( j = 0 ; j < n ; j++ )
             mat3[i][j] = mat1[i][j] + mat2[i][j];  //replace '+' with '-' to subtract matrices
 
      System.out.println("Sum of entered matrices:-");
 
      for ( i = 0 ; i < m ; i++ )
      {
         for ( j = 0 ; j < n ; j++ )
            System.out.print(mat3[i][j]+"\t");
 
         System.out.println();
      }
   }
}