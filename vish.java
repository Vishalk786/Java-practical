import java.util.Scanner;
class demoscanner
{
 public static void main (String args[])
  {
   Scanner scan=new Scanner(System.in);
   String firstname;
   int value;
   long longvalue;
   float f;
   double d;
   System.out.println("Enter first name:");
   firstname=scan.next();
   System.out.println("Enter an integer:"); 
   value=scan.nextInt();
   System.out.println("Enter a long value:");
   long Longvalue=scan.nextLong();
   System.out.println("Enter float value:");
   f=scan.nextFloat();
   System.out.println("Enter double value:");
   d=scan.nextDouble();
   System.out.println("***user input Are***");
   System.out.println("string is"+firstname);
   System.out.println("integer value is:"+ value);
   System.out.println("long value is:"+ Longvalue);
   System.out.println("float value is:"+ f);
   System.out.println("double value is:"+ d);
  }
}
