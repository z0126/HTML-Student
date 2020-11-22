package lx;

class A{
private int secret=5;
private int i,j;
//构造函数里面return不能返回值
public int get()
{
	return secret;
}
public void get1(int n,int m)
{
	this.i=m;
	this.j=m;
	System.out.println(i+j);
}
}
public class lx6 {
public static void main(String[] args){
	A a=new A();
	//int s=a.get();
	//System.out.println(a.get());
	a.get1(2,5);
}
}


/*public class lx6{
static int x=50;
static int y=200;
public static void method(){
//method 为静态故参与运算的变量都应为静态
System.out.println(x+y);
}
public static void main(String[] args){
new lx6().method();
}//静态与普通变量无法相加
}
**/
/*
public class lx6{
//通过外部类调用内部类
public String name="Outer";
private class Inner{
String name="inner";
void showName(){
	System.out.print(name);
}
}
public static void main(String[] args){
lx6.Inner inner=new lx6().new Inner();
System.out.println(inner.name);
}
}
**/
/*class person{
public person()
{
System.out.println("sdfgsfa");
}
}
public class lx6{
public static void main(String[] args) {
person p=new person();
}
}

**/

/*class person{
public person()
{//无参不能调用有参
System.out.println("sdfgsfa");
}
public person(String name)
{
this();//有参数中调用无参时只能this且必须处于第一句
System.out.print("esfasf");
}
}
public class lx6{
public static void main(String[] args) {
person p=new person();
}
}
**/
/*
class person{
//构造函数重载
String name;
int age;
public person(String i,int j)
{
this.name=i;
if(j<=100&&j>=0)
this.age=j;
}
public person(String i)
{
this.name=i;
}
public void speak()
{
System.out.println("大家好，我"+name+"我今年"+age+"岁");
}
}
public class lx6{
public static void main(String[] ages) {
person p1=new person("韩强",78);
person p2=new person("韩强");
p1.speak();
p2.speak();
}
}

**/
/*class person{
//构造函数重载
String name;
int age;
public person(String i,int j)
{
this.name=i;
if(j<=100&&j>=0)
this.age=j;
}
public person(String i)
{
this.name=i;
}
public void speak()
{
System.out.println("大家好，我"+name+"我今年"+age+"岁");
}
}
public class lx6{
public static void main(String[] ages) {
person p1=new person("韩强",78);
person p2=new person("韩强");
p1.speak();
p2.speak();
}
}

**/