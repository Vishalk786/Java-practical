import java.util.*;
public class TwoArrrys{
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] num = new int[row][col];
         
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                num[i][j]=sc.nextInt();

            }
        }
        int x = sc.nextInt();
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                //compare with x
                if (num[i][j]==x){
                System.out.print("X is found at "+i+" "+j+" ");
                }
            } 
        System.out.println();   
        }
    }

}