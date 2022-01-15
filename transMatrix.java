import java.util.*;
public class transMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the cols: ");
        int col = sc.nextInt();
        // 2D Array
        int num[][] = new int[row][col];
        
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                num[i][j]= sc.nextInt();
            }
        }System.out.println("After the transponse the matrix:-");
        for (int j=0; j<col; j++){
            for (int i=0; i<row; i++){
                System.out.print(num[i][j]+" ");
            }
        System.out.println();
        }
    }
}