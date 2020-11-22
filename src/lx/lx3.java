package lx;
import java.util.Scanner;
public class lx3 {
	 public static void main(String[] args) {  
		 /*输入输出时Scanner in = new Scanner(System.in);只出现一次**/
		 Scanner in = new Scanner(System.in);//定义scanner，等待输入
		 System.out.println("请输入你的姓名:");
		 String name = in.nextLine();//字符类型的输入方式
		 System.out.println(name);
		 System.out.println("请输入你的年龄：");
		 int age = in.nextInt();//整数类型的输入方式
		 System.out.println(age);
		 System.out.println("请输入你的身高：");
		 double height = in.nextDouble();//小数类型的输入方式
		 System.out.println(height);
		 char c = in.next().charAt(0);//输入单个字符
		 System.out.println(c);
		 in.close();
	 }
}
