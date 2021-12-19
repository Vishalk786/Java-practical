import java.io.*;
class RelationOperators
 {
  public static void main(String arg[])
  {
   int num1,num2;
   boolean res;
   DataInputStream r=new DataInputStream(System.in);
   try
   {
   System.out.println("Enter number1:");
   num1=Integer.parseInt(r.readLine());
   System.out.println("Enter number2:");
   num2=Integer.parseInt(r.readLine());
   res=(num1<num2);
   System.out.println("Result "+num1+"<"+num2+" is:"+res);
   res=(num1>num2);
   System.out.println("Result "+num1+">"+num2+" is:"+res);
   res=(num1<=num2);
   System.out.println("Result "+num1+"<="+num2+" is:"+res);
   res=(num1>=num2);
   System.out.println("Result "+num1+">="+num2+" is:"+res);
   res=(num1==num2);
   System.out.println("Result "+num1+"=="+num2+" is:"+res);
   res=(num1!=num2);
   System.out.println("Result "+num1+"!="+num2+" is:"+res);
   }
   catch(Exception ie)
   {
   System.out.println("You have entered a wrong value:");
   }
  }
  }