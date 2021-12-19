public class Extendingthread extends Thread
{
 public void run()
 {
  System.out.println("Child thread!");
  System.out.println("Extended thread!");
 }
 public static void main(String arg[])
 {
  Extendingthread t1=new Extendingthread();
  Thread thread1= new Thread(t1);
  thread1.start();
  System.out.println("Main thread");
 }
}