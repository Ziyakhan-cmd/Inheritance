import java.util.*;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int M1(int a)
  {
    System.out.println(a);
    System.out.println(this.a);
    return sc.nextInt();


  }
  void M1()
  {
   System.out.println("this is second m1");
   System.out.println(this.M1(sc.nextInt()));

  }
  A()
  {
   System.out.println("this is default");


  }
  A(int a,int b)
  {
   this();
   System.out.println(this.a);
   System.out.println(a);
   System.out.println(b);


  }
  public static void main(String[]args)
  {
   A x =new A(sc.nextInt(),sc.nextInt());
   x.M1();

  }



}