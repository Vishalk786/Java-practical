package overloading.java;
class SumTwoNum
{
  void sum(int x,int y)
  {
   System.out.println("Sum of two integer numbers="+(x+y));
  }
  void sum(double x,double y)
  {
   System.out.println("Sum of the double numbers="+(x+y));
  }
  void sum(char x,char y)
  {
   System.out.println("Sum of two char numbers="+(x+y));
  }
}
public class MethodoverloadingDemo
{ 
 public static void main(String[] args)
  {
   SumTwoNum obj=new SumTwoNum();
   obj.sum(10,20);
   obj.sum(7.52,8.14);
   obj.sum('A','B');
   }
 }