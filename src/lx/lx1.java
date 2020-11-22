package lx;
	//import java.util.Random;
	import java.util.Scanner;
	/*public class lx1 {
			public static void main(String args[]) {
			int randomNumber=new Random ().nextInt();
			System.out.println("随机数已生成");
			System.out.println("----请输入您猜测的数字------");
			Scanner a =new Scanner(System.in);
			int enterNumber=a.nextInt();
			while(enterNumber!=randomNumber) {
				if(enterNumber>randomNumber) {
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
**/	
	
	/*
	                                 /*随机字母由小写转成大写**/	
	/*public class lx1 {
		public static void main(String args[]) {
			 Scanner in = new Scanner(System.in);
			 String s=in.nextLine();
			 char c = in.next().charAt(0);
			 System.out.println(s);
			 System.out.println((int)c);
			 System.out.println(c);
			 in.close();
		}
		}
	**/
	
	                        /*矩形打印**/	
	public class lx1 {
		public static void main(String args[]) {
			 Scanner in = new Scanner(System.in);//输入操作必须有的一句话
			 System.out.print("请输入矩形的长：\n");
			 int l=in.nextInt();
			 System.out.print("请输入矩形的宽：\n");
			 int d=in.nextInt();
			 f(l,d);
			 in.close();
		}	
	public static void f(int i,int j)
	{	 
		for(int k=0;k<j;k++) {
			for(int n=0;n<i;n++)
			{
		    System.out.print("*");
			}
			System.out.print("\n");
		      }
			}
	}
	
	/*如何获得枚举类型的数据**/