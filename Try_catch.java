class DempArithmeticException
{
 public static void main(String arg[])
 {
 int a,b,x;
 a=10;
 b=0;
 x=0;
 try
 {
  x=a/b;
 }
 catch (ArithmeticException e)
 {
  System.out.println("You are trying to dividing by zero:");
  }
 System.out.println("value of x is:"+x);
 System.out.println("End of the program!"); 
}
}
