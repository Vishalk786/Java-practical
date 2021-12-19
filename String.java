class Demostring
{ 
 public static void main(String arg[])
 { 
  String str="We are going to work with string!";
  int less=str.length();
  System.out.println("Length of string is:"+less);
  str=str.toUpperCase();
  System.out.println("\n Upper case:"+str);
  str=str.toLowerCase();
  System.out.println("\n In lower case:"+str);
  char c=str.charAt(5);
  System.out.println("\n Character at 5th index is:"+c);
  int index=str.indexOf('G');
  System.out.println("\n Character 'G' is found at index:"+index);
  str=str.replace('w','i');
  System.out.println("\n After replacing 'W' with 'I':"+str);
  String str1="Vishal ";
  String str2="and suresh are brother!";
  str1=str1.concat(str2);
  System.out.println("\n Concatination of string:"+str1);
  }
}