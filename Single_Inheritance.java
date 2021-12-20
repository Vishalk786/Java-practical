
class Base
{
 int num1;
 void baseshow()
 {
  System.out.println("num1="+num1);
 }
}
class derived extends Base
{
 int num2;
void product()
 {
  System.out.println("Product="+(num1*num2));
 }
 void derivedshow()
 {
 System.out.println("num2="+num2);
 }
}
class InheritanceDemo
 {
  public static void main(String[] args)
  {
   derived d=new derived();
   d.num1=20;
   d.baseshow();
   d.num2=10;
   d.derivedshow();
   d.product();
  }
 }