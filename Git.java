import java.util.*;
class Git
{
	static Scanner sc=new Scanner(System.in);
	char m1(int a)
	{
		System.out.println(a);
		return sc.next().charAt(0);
	}
}
class B extends Git
{
	int m2(float b)
	{
		System.out.println(b);
		return sc.nextInt();
	}
}
class C extends B
{
	double m3(String c)
	{
		System.out.println(c);
		return sc.nextDouble();
	}
}
class D extends C
{
	short m4(long d)
	{
		System.out.println(d);
		return sc.nextShort();
	}
}
class E extends C
{
	int m5(int e)
	{
		System.out.println(e);
		return sc.nextInt();
	}
}
class F extends C
{
	char m6(float f)
	{
		System.out.println(f);
		return sc.next().charAt(0);
	}
}
class G
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		C obj=new C();
		System.out.println(obj.m3(sc.next()));
		System.out.println(obj.m2(sc.nextFloat()));
		System.out.println(obj.m1(sc.nextInt()));
		D obj1=new D();
		System.out.println(obj1.m4(sc.nextLong()));
		E obj2=new E();
		System.out.println(obj2.m5(sc.nextInt()));
		F obj3 =new F();
		System.out.println(obj3.m6(sc.nextFloat()));
	}
}
	