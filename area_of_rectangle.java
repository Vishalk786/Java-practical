class Rectangle
{ 
 int length,breath;
 void setdata(int l,int b)
  {
    length=l;
    breath=b;
  }
 int area()
  {
   int rectarea;
   rectarea=length*breath;
   return rectarea;
   }
}
class Rectanglejava
  {
   public static void main(String arg[])
  {
  Rectangle firstrect=new Rectangle();
  firstrect.setdata(5,6);
  int result=firstrect.area();
  System.out.println("Area of Rectangle="+result);
  }
}