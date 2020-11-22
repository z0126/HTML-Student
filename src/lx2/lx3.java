package lx2;
//import java.util.Random;

/*public class lx3 {
	private static String name;
	static {
		name="World";
		System.out.print(name);
	}
	public static void main(String[] args){
		System.out.print("Hello");
		lx3 test=new lx3();
	}
}*/



/*public class lx3 {
	private static String name1;
	static {
		name1="World34";
		System.out.print(name1);
	}
	public static void main(String[] args){
	
		System.out.print("Hello");
		Test test=new Test();
	}
}

class Test{
	private static String name;
	static {
		name="World";
		System.out.print(name);
	}
}*/

/*
public class lx3 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.add("asd");
		list.add("asffd");
		list.add("asfssd");
		list.add("asasdd");
		list.addFirst("123");
		list.addLast("000");
		list.add(2,"rr");
		
		//foreach循环中类型可以实基本类型，或封装类型，或者使用通用的Object类
		for(Object i:list){
			System.out.println(i);
		}
		System.out.println(list);
		System.out.println(list.toString()+" fsfs ");
		int a[]={1,3,12,3,23};
		for(Integer i:a){
			System.out.print(i+"  ");
		}
		System.out.print("\n");
		for(int i:a){
			System.out.print(i+"  ");
		}
		System.out.print("\n");
		for(Object i:a){
			System.out.print(i+"  ");
		}
	}
}*/


 /*abstract class a{
	static int num2=3;//static只可以修饰类中的成员变量
	abstract void f1();
	
}

public class lx3 {
	private int num5=50;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		
			//System.out.print("Hello"+9+1+'a');
		
		final int uum1=10;
		
		//abstract int num3；//abstract修饰抽象类中抽象方法
		
		int num4=50;
	}
}*/


/*public class lx3 {
	
	public static void main(String[] args){
		float a=1.23f;
		double c=1.5E4;
		float d='a';
		float w='1';
		//float型数据的尾部加上F或f
		//double型数据的尾部加上D或d
	}
}*/

/*public class lx3 {
	
	public static void main(String[] args){
		char c='3';//
		int a=c;//经byte变量c传换成int
		int b='c';
		char v=97;
		
		System.out.println((int)c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c+a+b);//运算时将char型转化成了int型
		System.out.print(c+" "+a+" "+b);
		
	}
}*/




public class lx3 {
	public static void sum(int a,int b){
		System.out.print("int:"+(a+b));
		
	}
	public static void sum(int a,float b){
		System.out.print("float:"+(a+b));
		
	}
	public static void sum(int a,double b){
		System.out.print("double:"+(a+b));
		
	}
	public static void main(String[] args){
		int a=10;
		long b=20;
		sum(a,b);
	}
}