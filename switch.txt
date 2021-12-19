import java.io.*;
class Day
 {
  public static void main(String arg[])
  {
   int day;
   DataInputStream r=new DataInputStream(System.in);
   try
   {
   System.out.println("Enter day number:");
   day=Integer.parseInt(r.readLine());
   switch(day)
  {
   case 1:System.out.println("Sunday");
   break;
   case 2:System.out.println("Monday");
   break;
   case 3:System.out.println("Tuesday");
   break;
   case 4:System.out.println("Wednesday");
   break;
   case 5:System.out.println("Thursday");
   break;
   case 6:System.out.println("Friday");
   break;
   case 7:System.out.println("Saturday");
   break;
   default:System.out.println("Invaild day number!");
   }
   System.out.println("End of the program!");
   }
   catch(Exception ie)
   {
   System.out.println("You have entered invaild value:");
   }
  }
  }