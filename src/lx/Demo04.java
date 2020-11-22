package lx;


/*
class Vehicles{
	String brand;//商标
	String color;//颜色
	Vehicles(){}
	Vehicles(String i,String j){
		this.brand=i;
		this.color=j;
	}
	void run() {
		System.out.println("我已经开动了！\n");
	}
	void showInfo() {
		System.out.println("商标："+brand);
		System.out.println("颜色："+color);
	}
}
class Car extends Vehicles{
	int seats;//车轮数
	Car(){}
	Car (String i,String j,int z){
		super(i,j);
		this.seats=z;
	}
	void showCar() {
		super.showInfo();
		System.out.println("车轮数是："+seats);
	} 
}
class Truck extends Vehicles{
	float load;//载重
	Truck(String i,String j,float z){
		super(i,j);
		this.load=z;
	}
	void showTruck() {
		super.showInfo();
		System.out.println("载重是："+load+"吨");
	} 
}
public class Demo04 {
	public static void main(String [] args) {
		Car car=new Car("S","red",4);
		car.showCar();
		car.run();
		Truck truck=new Truck("sd","yellow",12);
		truck.showTruck();
		truck.run();
	}
}
**/
/*
class Auto{
	int seats;//车轮数
	String color;//颜色
	String  load;//车重
	int  v;//速度
	Auto(){
		seats=4;
		color="black";
		load="2吨";
		v=60;
	}
	Auto(int i,String j,String z,int m){
	    this.seats=i;
		this.color=j;
		this.load=z;
		this.v=m;
	}
	void addv() {
		System.out.println("已经加速 ！");
		}
	void cutv() {
		System.out.println("已经减速 ！");
	}
	void stop() {
		System.out.println("已经停车 ！");
	}
	void showInfo() {
		System.out.println(color+"车的车轮数、车重、车速分别是"+seats+"  "+load+"  "+v+"  ");
	}
}
class Car extends Auto{
	String k;//空调
	String CD;
	Car(){}
	Car (int i,String j,String z,int m,String n,String p){
		super(i,j,z,m);
		k=n;
		CD=p;
	}
	void addv() {
		System.out.println("已经加速至顶 ！");
		}
	void cutv() {
		System.out.println("已经减速到10km/h ！");
	}
	void show() {
		System.out.println();
		this.showInfo();
		System.out.println("空调、CD是："+k+"  "+CD);
	} 
}
public class Demo04 {
	public static void main(String [] args) {
		Auto auto1=new Auto();
		auto1.showInfo();
		Auto auto=new Auto(8,"red","2吨",4);
		auto.showInfo();
		auto.addv();
		auto.cutv();
		Car car=new Car(8,"White","1.5吨",4,"格力","&&");
		car.show();
		car.addv();
		car.cutv();
	}
}
**/

/*
abstract class Graphical {
	double S;//面积
	abstract void display();//
}
class rectangle extends Graphical{
	double longs;//长
	double wide;//宽
	rectangle(double i,double j){
		super.S=0;
		longs=i;
		wide=j;
	}
	void display() {
		System.out.println("矩形的长宽分别是："+longs+"  "+wide);
		System.out.println("矩形的面积S是："+longs*wide+"\n");
	}
}
class triangle extends Graphical{
	double longs;//底
	double h;//高
	triangle(double i,double j){
		super.S=0;
		longs=i;
		h=j;
	}
	void display() {
		System.out.println("三角形的底和高分别是："+longs+"  "+h);
		System.out.println("三角形的面积S是："+0.5*longs*h+"\n");
	}
}															
class circular extends Graphical{
	double r;//半径
	circular(double i){
		super.S=0;
		r=i;
	}
	void display() {
		System.out.println("圆的半径是："+r);
		System.out.println("圆的面积S是："+3.14*r*r+"\n");
	}
}
class Ellipse extends circular{
	double longs;//长半轴
	double wide;//短半轴
	Ellipse(double i,double j,double k){
		super(k);
		longs=i;
		wide=j;
	}
	void display() {
		System.out.println("椭圆的长半轴、短半轴分别是："+longs+"  "+wide);
		System.out.println("椭圆的面积S是："+longs*wide*3.14+"   ");
	}
}
public class Demo04 {
	public static void main(String [] args) {
		rectangle a=new rectangle(3,5);
		a.display();
		triangle b=new triangle(3,5);
		b.display();
		circular c=new circular(5);
		c.display();
		Ellipse d=new Ellipse(3,5,0);q
		d.display();
	}
}
**/

/*
abstract class Vehicle{
	abstract String NoOfWheels();
}
class Car extends Vehicle{
	String NoOfWheels(){
		return "四轮车车重 100kg";
	}
	void display() {
		System.out.print(this.NoOfWheels());
	}
}
class Motorbike extends Vehicle{
	void display() {
		System.out.print(this.NoOfWheels());
	}
	String NoOfWheels(){
		System.out.print("\n");
		return "双轮车车重 500kg";
	}
}
public class Demo04{
	public static void main(String[] args) {
		Car car=new Car();
		car.display();
		Motorbike a=new Motorbike();
		a.display();
	}
}
**/
/*
interface Vehicle{
	void start(int i);
	void stop(int r);
}
class Bike implements Vehicle{
	public void start(int i) {
		if(i==1)
		System.out.print("Bike已经启动！\n");
		else this.stop(i);
	}
	public void stop(int i) {
		if(i==0)
		System.out.print("Bike已经停止！\n");
		else this.start(i);
	}
}
class Bus implements Vehicle{
	public void start(int i) {
		if(i==1)
		System.out.print("Bus已经启动！\n");
		else this.stop(i);
	}
	public void stop(int i) {
		if(i==0)
		System.out.print("Bus已经停止！\n");
		else this.start(i);
	}
}
public class Demo04{
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.start(1);
		bike.stop(0);
		Bus bus=new Bus();
		bus.start(1);
		bus.stop(0);
	}
}

**/

/*
class Student{
	String name;
	int age;
	Student(String i,int j){
		name=i;
		age=j;
	}
	void show() {
		System.out.print(name+"  "+age+"岁！\n");
	}
}
class Undergraduate extends Student{
	String Academic;//学位
	Undergraduate(String i,int j,String k){
		super(i,j);
		Academic=k;
	}
	void show() {
		super.show();
		System.out.print("学位:"+Academic);
	}
}
public class Demo04{
	public static void main(String[] args) {
		Student a1=new Student("李四",24);
	    a1.show();
		Undergraduate a2=new Undergraduate("张三",22,"本科");
		a2.show();
	}
}
**/
/*
interface Shape{
	double area(double i);
}
class Square implements Shape{
	public double area(double i) {
		System.out.println("正方形的面积是："+i*i);
		return i;
	}
}
class Circle implements Shape{
	public double area(double i) {
		System.out.printf("圆形的面积是：%.2f",3.14*i*i);
		return i;
	}
}
public class Demo04{
	public static void main(String[] args) {
		Shape a1=new Square();//创建Square对象，使用Shape类型引用
		Shape a2=new Circle();//创建Circle对象，使用Shape类型引用
		Demo04.shout(a1,2);          //调用shout()方法，a1作为参数传入
		Demo04.shout(a2,3);         //调用shout()方法，a21作为参数传入
	}
	public static void shout(Shape a,double i) {
		a.area(i);
	}
}
**/

/*
interface innerclass{  
    public void print(); 
}  
public class Demo04{  
	public static void main(String[] args)  {  
       innerclass i = new innerclass() {  
    	   //对print的重新书写
    	@Override  
	            public void print() {  
	                System.out.println("匿名内部类");  
	                // TODO Auto-generated method stub      
            }  
	        };
	        i.print();  
            innerclass aInnerclass = new innerclass() {  
	          // @Override  
	           public void print() {  
	           // TODO Auto-generated method stub  
	         System.out.println("匿名内部类2");  
	        }  
	       }; 
	       aInnerclass.print();  
	       i.print();  
	       }  
	     }

**/
/** 
 * Checked异常测试方法 
 * @author xy 
 * 
 */

//import java.io.IOException;  
   
class CheckedExceptionMethods{
	 // 总异常类，既有checkedException又有RuntimeException，所以其中的checkedException必须处理
	public void method1() throws Exception {
		 System.out.println("我是抛出异常总类的方法");
	}
	 // 捕获并处理这个异常
	 public void testMethod1_01() {
		 try 
		 {
			 method1();
		 }
		 catch (Exception e) 
		 {
			 e.printStackTrace();  
		 }
	 }
	 // 把异常传递下去
	 public void testMethod1_02() throws Exception{
		 method1(); 
	 }
	 public void testMethod1_03() throws Exception{
		 throw new Exception();
	 }
	 public void testMethod1_04() throws Exception{
		 try 
		 {
			 throw new Exception();
		 }
		 catch (Exception e) 
		 {
			 e.printStackTrace();
		 }
	 }
	 // checkedException典型代表IOException
	 public void method2() throws Exception {
		 System.out.println("我是抛出IO异常的方法");
	}
	 public void testMethod2_01() {
		 try 
		 {
			 method2();
		 }
		 catch (Exception e) 
		 {
			 e.printStackTrace();  
		 }
	 }
	 public void testMethod2_02() throws Exception {
		 method2(); 
	 }
}
public class Demo04{
	public static void main(String [] args) {
		CheckedExceptionMethods a=new CheckedExceptionMethods();
		a.testMethod1_01();
		a.testMethod2_01();
	}
}
