import java.util.*;
public class rev {
   public static void main (String arg[]){
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter the number that you want to invert: ");
       int x = sc.nextInt(); 
       int j = x;
       int[] reverse = new int[x];
       for (int i=0; i<x; i++){
           reverse[i]=sc.nextInt();

       }
       System.out.println("After reverse the number:-");
       for (int i=0; i<x; i++){
           
           System.out.print(j+" ");
           j=j-1;
       }
   }
}