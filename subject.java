import java.util.*;
public class subject{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] =new int[5];
        for (int i=0; i<5; i++){
        System.out.print("Enter the no. ");
        num[i]=sc.nextInt();
        }
        System.out.print("Enter the value when you search in array list: ");
        int x=sc.nextInt();

        for(int i=0; i<num.length; i++){
        if (num[i]==x){
         System.out.println(x+ " found at index: "+i);
            }  
        else{    
         System.out.println("Invalid Number");
        }
        }
    }
}