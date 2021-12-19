public class throwmethod
{
 static double devide(double num,double den)
  { 
   if(den==0.0)
   throw new ArithmeticException("Demoninater cannot be zero");
  else
     return (num/den);
 }
 public static void main(String arg[])
 {
 double x,y,z;
 try 
 {
  x=12.5;
  y=0.0;
  z=devide(x,y);
  System.out.println(x+"/"+y+"="+z);
  }
  catch(ArithmeticException e)
   {
    System.out.println(e.getMessage());
  }
  }
}