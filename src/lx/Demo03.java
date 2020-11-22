package lx;

//类中默认为共有

/*
class Person{
	public int age;//年龄 
	private String name;//姓名
	public void setname()
	{
		name="韩某某";
	}
	public void getname()
	{
		System.out.println(name);
	}
	public void eat()
	{
		System.out.println(name+"的年龄是"+age);
	}
	public void eat(String s)
	{
		System.out.println(s+"的年龄是"+age);
	}
	public Person()
	{
		name="李某某";
		age=22;
	}
	public Person(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
}
public class Demo03 {
	public static void main(String[] args) { 
		Person A=new Person();
		Person B=new Person(33,"郑某某");
		A.eat();
		A.eat("王某某");
		B.getname();
		B.setname();
		B.getname();
	}
}
**/

/*class StaticDemo{
	static int a;//静态变量
	int b;//普通变量
	public static void seta(int i)//静态方法访问静态变量
	{//this 在静态方法中无法使用
		a=i;
	}
	public static void geta()//静态方法访问静态变量
	{//this 在静态方法中无法使用
		System.out.println("静态变量a="+a);
	}
	public  void setb(int i)//普通方法访问普通变量
	{
		this.b=i;
	}
	public  void getb()//普通方法访问普通变量
	{
		System.out.println("普通变量b="+this.b);
	}
}
public class Demo03 {
	public static void main(String[] args) { 
		StaticDemo a=new StaticDemo();
		StaticDemo.seta(10);
		StaticDemo.geta();
		a.setb(5);
		a.getb();
	}
}**/
/*
import java.util.Scanner;
class A{
	int V;
	void setV(int i)
	{
		V=i;
	}
	A()
	{
		V=100;
	}
}
class B{
	public void f(int i)
	{
		System.out.println("----请输入您猜测的数字------");
		Scanner a =new Scanner(System.in);
		int enterNumber=a.nextInt();
		while(enterNumber!=i) {
			if(enterNumber>i) {
				System.out.println("sorry,您猜大了！");
			}else {
				System.out.println("sorry,您猜小了！");
			}
		System.out.println("----请输入您猜测的数字------");
		enterNumber=a.nextInt();
		}
		System.out.println("恭喜您，猜对了！");
		a.close();		
	}
}
public class Demo03 {
	public static void main(String[] args) { 
		A s=new A();
		B f=new B();
		//f.f(s.V);
		//s.setV(67);
		f.f(s.V);
	}
}
**/

/*
class Animals{
	public String Features;//动物特征
	public String Cry;//动物叫声
	public String shape;//动物体型分为、小
	Animals(String i,String j,String k){
		this.Features=i;
		this.Cry=j;
		this.shape=k;
	}
}
class Test{
	public void test(Animals a) {
		if(a.shape=="小"&&a.Features=="额头有“王”字标识"&&a.Cry=="喵喵")
			System.out.print("这个动物是只猫");
		else
			System.out.print("这个动物是只老虎");
	}
}
public class Demo03{
	public static void main(String[] args) { 
		Animals a=new Animals("额头没有“王”字标识","喵喵","小");
		Test b=new Test();
		b.test(a);
	}
}
//纯虚函数 virtual void f()=0;  有纯虚函数的类为抽象类  
**/

/*
class MyTime{
	private int hour;//时
	private int minute;//分
	private int second;//秒
	MyTime(){}
	MyTime(int i,int j,int k){
		this.hour=i;
		this.minute=j;
		this.second=k;
	}
	public void display()
	{
		System.out.println("时间："+hour+":"+minute+":"+second);
	}
	public void addSecond(int sec) {
		this.second=this.second+sec;
	}
	public void addMinute(int min) {
		this.minute=this.minute+min;
	}
	public void addHour(int hou) {
		this.hour=this.hour+hou;
	}
	public void subSecond(int sec) {
		this.second=this.second-sec;
	}
	public void subMinute(int min) {
		this.minute=this.minute-min;
	}
	public void subHour(int hou) {
		this.hour=this.hour-hou;
	}
}
public class Demo03{
	public static void main(String[] args) { 
		MyTime time=new MyTime(2,5,45);
		time.display();
		time.addHour(2);
		time.addMinute(30);
		time.addSecond(10);
		time.display();
		time.subHour(1);
		time.subMinute(2);
		time.subSecond(15);
		time.display();
	}
}

**/
/*
class Number{
	private int n1;
	private int n2;
	Number(){}
	Number(int i,int j){
		this.n1=i;
		this.n2=j;
	}
	public void addition() {
		System.out.println(n1+"+"+n2+"="+(n1+n2));
	}
	public void subition() {
		System.out.println(n1+"-"+n2+"="+(n1-n2));
	}
	public void multiplication() {
		System.out.println(n1+"*"+n2+"="+(n1*n2));
	}
	public void division() {
		System.out.println(n1+"/"+n2+"="+(n1/n2));
	}
}
public class Demo03{
	public static void main(String[] args) { 
	Number num=new Number(6,3);
	num.addition();
	num.subition();
	num.multiplication();
	num.division();
	}
}
**/
/*
class Person{
	private String name;
	private int age;
	Person(){}
	Person(String i,int j){
		this.name=i;
		this.age=j;
	}
	public void display() {
		System.out.println(this.name+"的年龄是："+this.age);
	}
}
public class Demo03{
	public static void main(String[] args) { 
	Person person =new Person("张三",23);
	person.display();
	}
}

**/

/*
class WuMingFen{
	private String theMa;//面码
	private int quantity;//分量
	private boolean likeSoup;//是否带汤
	WuMingFen(String i,int j,boolean k)
	{
		theMa=i;
		quantity=j;
		likeSoup=k;
	}
	void display()
	{
		if(likeSoup==true)
		{
			System.out.println(theMa+"号"+quantity+"带汤");
		}
		else 
		{
			System.out.println(theMa+"号"+quantity+"不带汤");
		}
	}
}
public class Demo03{
	public static void main(String[] args) { 
		WuMingFen noubles =new WuMingFen("001",2,true);
		noubles.display();
		WuMingFen noubles1=new WuMingFen("002",1,false);
		noubles1.display();
	}
}

**/

/*
class WuMingFen{
	private String theMa;//面码
	private int quantity;//分量
	private boolean likeSoup;//是否带汤
	WuMingFen(){
		theMa="酸辣";
		quantity=2;
		likeSoup=true;
	}
	WuMingFen(String i,int j,boolean k)
	{
		theMa=i;
		quantity=j;
		likeSoup=k;
	}
	WuMingFen(String i,int j){
		theMa=i;
		quantity=j;
	}
	void check()
	{
		if(likeSoup==true)
		{
			System.out.println(theMa+" "+quantity+"两"+" "+"带汤");
		}
		else 
		{
			System.out.println(theMa+" "+quantity+"两"+" "+"不带汤");
		}
	}
}
public class Demo03{
	public static void main(String[] args) { 
		WuMingFen f1 = new WuMingFen("牛肉",3,true);
		f1.check();
		WuMingFen f2 = new WuMingFen("牛肉",2);
		f2.check();
		WuMingFen f3 = new WuMingFen();
		f3.check();
	}
}

**/

