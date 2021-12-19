import java.io.*;
class Division
 {
  public static void main(String arg[])
  {
   double percentage;
   DataInputStream r=new DataInputStream(System.in);
   try
   {
   System.out.println("Enter percentage marks:");
   percentage=Double.parseDouble(r.readLine());
   if (percentage>=60)
   {
   System.out.println("You have got first divisioin!");
   }
   else if (percentage>=50 && percentage<=60)
   {
   System.out.println("You have got second division!");
   }
   else if (percentage>=33 && percentage<=50)
   {
   System.out.println("You got third division!");
   } 
   else
   {
   System.out.println("You are got failled!");
   }
   }
   catch(Exception ie)
   {
   System.out.println("You have entered invailed value:");
   }
  }
  }