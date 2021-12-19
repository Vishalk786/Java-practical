 interface circle
{  
 double pi=3.14;
 double area(double r);
 }
 class derived implements circle
 {
  public double area (double r)
  {
    return pi*r*r;
   }
  }
  class ImplementsInterface
  {
  public static void main (String are[])
  {
   derived obj=new derived();
   double circlearea=obj.area(2.5);
   System.out.println("Area of circle is:"+circlearea);
  }
}