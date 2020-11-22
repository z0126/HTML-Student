package lx;


/*
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			int i=a.nextInt();
			int f[]=new int [i];
			f[0]=1;
			f[1]=1;
			for(int j=2;j<i;j++){
				f[j]=(f[j-1]+f[j-2])%10007;
			}
			System.out.println(f[i-1]);
			a.close();
		}
	}
/*
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			double r=a.nextDouble();
			final double PI=3.14159265358979323;
			if(r>=1&&r<=10000) {
				double S=0;
				S=PI*r*r;
				System.out.printf("%.7f",S);
			}
			a.close();
		}
	}
//输出结果限制小数点位数
/*System.out.printf("面积是：%-20.7f",S);
System.out.printf("safasf");
**/
/*
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			int i=a.nextInt();
			long s=0;
			if(i>=1&&i<=1000000000) {
			for(;i>0;i--) {
				s=s+i;
			}
			System.out.print(s);
			}
			a.close();
		}
	}


import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        System.out.println(a + b);
    }
}
**/
/*
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		i=sc.nextInt();
		int a[]=new int[i];
		for(int j=0;j<a.length;j++){
			a[j]=sc.nextInt();
		}
		for(int k =1;k<a.length;k++) { 
			for(int j=0;j<a.length-k;j++) {
				 if(a[j]>a[j+1]) {
					 int temp = a[j+1];
					 a[j+1]=a[j];
					 a[j]=temp;
				 }
			}
		}
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
	}
} 
**/
/*
import java.util.Scanner;
public class Main
{//特殊回文数——指定数
	@SuppressWarnings("resource")
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1&&n<=54){
		for(int a=1;a<10;a++) {
			for(int b=0;b<10;b++) {
				for(int c=0;c<10;c++) {
					if(n==2*a+2*b+2*c) {
						System.out.printf("%d%d%d%d%d%d\n",a,b,c,c,b,a);
					}
				}
			}
		}
		}
    }
}
**/

/*
public class Main
{//回文数
	public static void main(String args[])
    {
		for(int a=1;a<10;a++) {
			for(int b=0;b<10;b++) {
				for(int c=0;c<10;c++) {
					for(int d=1;d<10;d++) {
						if((a*1000+b*100+c*10+d)==(d*1000+c*100+b*10+a)) {
							System.out.println(a*1000+b*100+c*10+d);
						}
					}
				}
			}
		}
    }
}
**/
/*
public class Main
{
	public static void main(String args[])
    {
		for(int a=1;a<10;a++) {
			for(int b=0;b<10;b++) {
				for(int c=0;c<10;c++) {
					if((a*100+b*10+c)==(a*a*a+b*b*b+c*c*c)) {
							System.out.println(a*100+b*10+c);
					}
				}
			}
		}
    }
}
**/
/*
 * 杨辉三角
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n>=1&&n<=34) {
			int a[][]=new int [n][n];
			for(int i=0;i<n;i++)
			{
				a[i][0]=1;
				a[i][i]=1;
			}
			for(int i=2;i<n;i++)
			{
				for(int j=1;j<n;j++)
					a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<=i;j++) {
				System.out.printf(a[i][j]+" ");	
				}
				System.out.println();
			}
		}
    }
}
**/
/*
import java.util.Scanner;
public class Main
{
	@SuppressWarnings("resource")
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		if(n>=1&&n<=10000) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				int k=sc.nextInt();
				if(k>=-10000&&k<=10000)
				a[i]=k;
			}
			for(int k =1;k<a.length;k++) { 
				for(int j=0;j<a.length-k;j++) {//将最大的数移动至最后，每次循环选出最大的
					//a.length-k表示第k个比较的次数
					 if(a[j]>a[j+1]) {
						 int temp1 = a[j+1];
						 a[j+1]=a[j];
						 a[j]=temp1;
					 }
				}
			}
			for(int i=0;i<n;i++)
				sum=sum+a[i];
			System.out.println(a[n-1]);
			System.out.println(a[0]);
			System.out.println(sum);
	    }
    }
    }
    **/

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		scanner.close();
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[0]);
		System.out.println(sum);
	}
}
**/

/*
public class Main
{
	//ascii码与数字间的转化
	public static void main(String args[])
    {
		//Scanner sc =new Scanner(System.in);
		int d = 100; 
		char e = (char)d;//如果是一串ascii码的话,最好存在byte[]中,强制转换
		if(e>'c') {
		System.out.println("  "+e);
		}
		byte[] b ={97, 98, 99};
		System.out.println(new String(b));//字符串转化只能如此
    }
}
**/


/*
public class Main {
	private static int asnum;
	private static char stchar;

	public static void main(String[] args) {
		System.out.println(getAsc("A"));
		System.out.println(backchar(99));
	}

	/**
	 * 字符转ASC
	 * 
	 * @param st
	 * @return
	 */
/*
	public static int getAsc(String st) {
		byte[] gc = st.getBytes();
		asnum = (int) gc[0];
		return asnum;
	}

	/**
	 * ASC转字符
	 * 
	 * @param backnum
	 * @return
	 */
/*
	public static char backchar(int backnum) {
		stchar = (char) backnum;
		return stchar;
	}
}
**/
/*
public class Main
{
	public static void main(String args[])
    {
		//Scanner sc =new Scanner(System.in);
		char b='A';
		System.out.println((int) b);
		int d=99;
		System.out.println((char)d);
		int c=(int) b+1;
		System.out.println((char)(c));
		System.out.println((char)('c'+3));//输出括号内无法字符自动下移
		System.out.println((char)(65+3));
    }
}
**/
/*
import java.util.Scanner;
public class Main
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char z='A';
		if(n>=1&&m<=26) {
			for(int i=0;i<n;i++) {
				for(int k=i;k>0;k--) {
					int temp=(int)z+k;
					System.out.print((char)temp);
				}
				for(int j=0;j<m-i;j++) {
					int temp=(int)z+j;
					System.out.print((char)temp);
				}
				System.out.println();
			}
		}
		else System.out.println("error");
    }
}
**/
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char c = (char)(Math.abs(i-j)+'A');//绝对值
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
**/
/*
import java.util.Scanner;
public class Main
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char z='A';
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					switch(Math.abs(i-j)) {
					case 0:System.out.print("A");break;
					case 1:System.out.print("B");break;
					case 2:System.out.print("C");break;
					case 3:System.out.print("D");break;
					case 4:System.out.print("E");break;
					case 5:System.out.print("F");break;
					case 6:System.out.print("G");break;
					case 7:System.out.print("H");break;
					case 8:System.out.print("I");break;
					case 9:System.out.print("J");break;
					case 10:System.out.print("K");break;
					case 11:System.out.print("L");break;
					case 12:System.out.print("M");break;
					case 13:System.out.print("N");break;
					case 14:System.out.print("O");break;
					case 15:System.out.print("P");break;
					case 16:System.out.print("Q");break;
					case 17:System.out.print("R");break;
					case 18:System.out.print("S");break;
					case 19:System.out.print("T");break;
					case 20:System.out.print("U");break;
					case 21:System.out.print("V");break;
					case 22:System.out.print("W");break;
					case 23:System.out.print("X");break;
					case 24:System.out.print("Y");break;
					case 25:System.out.print("Z");break;
					}
				}
				System.out.println();
			}
    }
}**/

/*
import java.util.Scanner;
public class Main
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.print(a+" ");
				if(b>c) {
					System.out.print(b+" ");
					System.out.print(c+" ");
				}
				else
				{
					System.out.print(c+" ");
					System.out.print(b+" ");
				}
			}
				else {
					System.out.print(c+" ");
					System.out.print(a+" ");
					System.out.print(b+" ");
				}
		}
		else
		{
			if(b>c) {
				System.out.print(b+" ");
				if(a>c) {
					System.out.print(a+" ");
					System.out.print(c+" ");
				}
				else
				{
					System.out.print(c+" ");
					System.out.print(a+" ");
				}
			}
			else {
				System.out.print(c+" ");
				System.out.print(b+" ");
				System.out.print(a+" ");
			}
		}
    }
}

**/

/*
import java.util.Scanner;
public class Main
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[])
    {
		int sum=0;
		for(int i=1;i<=4;i++)
			for(int j=1;j<=4;j++)
				if(i!=j) {
					for(int k=1;k<=4;k++) {
						if(i!=k&&j!=k) {
						System.out.println(i*100+j*10+k*1);
						sum++;
						}
					}
				}
		System.out.println(sum);
    }
}
**/
/*
public class Main
{
	public static void main(String[] args) { 
		for(int i=0;i<=36/4;i++){
			   for(int j=0;j<=36/3;j++){
			    for(int k=0;k<=36*2;k++){
			     if(i*4+j*3+k/2==36 && i+j+k==36){    
			       System.out.println("男="+i+";女="+j+";孩="+k);
			     }
			    }
			   }
			  }
		}
}
**/
/*
public class Main
{
	public static void main(String args[])
    {
		int sum=0;
		int num=1;
		for(int i=1;i<=20;i++) {
			int temp=1;
			for(int j=i;j>0;j--) {
				temp=temp*j;
			}
			sum=temp+sum;
		}
		System.out.println(sum);
		sum=0;
		for (int i = 0; i < 20; i++)
	    {
	        num = num * (i + 1);
	        sum = sum + num;
	    }
		System.out.println(sum);
    }
}
**/
/*
public class Main

{
	 public static void main(String[] args) { 
		 //a=1,b=2,c=3  
		/* char b='A';
			System.out.println((int) b);
		 for(int x=1;x<=3;x++){  
			 for(int y=1;y<=3;y++){      
				 for(int z=1;z<=3;z++){    
					 if(x!=1&&x!=3&&z!=3&&x!=y&&x!=z&&y!=z)     
						 System.out.println("X-"+((char)(x+64))+" "+"Y-"+(char)(y+64)+" "+"Z-"+(char)(z+64));       
					 }  
				 }    
			 }  
		 }
	 }
	 **/
/*
import java.util.Scanner;
public class Main
{
	 @SuppressWarnings("resource")
	public static void main(String[] args) { 
		 Scanner sc=new Scanner(System.in);
		 int m=sc.nextInt();
		 int n=sc.nextInt();
		 int a[][]=new int[m][n];
		 int b[][]=new int[n][m];
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print(a[i][j]);
			 }
			 System.out.println();
		 }
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 b[i][j]=a[j][i];
				 System.out.print(b[i][j]);
			 }
			 System.out.println();
		 }
	 }
}
**/
/*
import java.util.Scanner;
public class Main
{
	 @SuppressWarnings("resource")
	public static void main(String[] args) { 
		 Scanner sc=new Scanner(System.in);
		 int m=sc.nextInt();
		 int n=sc.nextInt();
		 int a[][]=new int[m][n];
		 int b[][]=new int[n][m];
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print(a[i][j]);
			 }
			 System.out.println();
		 }
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 b[i][j]=a[j][i];
				 System.out.print(b[i][j]);
			 }
			 System.out.println();
		 }
	 }
}
**/
/*
import java.util.Scanner;
public class Main
{
	@SuppressWarnings({  "resource" })
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		 int a[][]=new int[m][m];
		 int sum=0;
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<m;j++) {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<m;j++) {
				if(i==j) {
					sum=a[i][j]+sum;
				}
				else if(i+j==m-1) {
					sum=a[i][j]+sum;
				}
			 }
		 }
		 System.out.println(sum);
	 }
}
**/
//import java.util.Scanner;
/*
class Student{
	String name;
	String no;
	double deg1;
	double deg2;
	double deg3;
	static double sum1;
	static double sum2;
	static double sum3;
	static int count;
	public Student(String i,String j,double k,double m,double n) {
		this.name=i;
		this.no=j;
		this.deg1=k;
		this.deg2=m;
		this.deg3=n;
		sum1=sum1+deg1;
		sum2=sum2+deg2;
		sum3=sum3+deg3;
		count++;
	}
	public double f1() {
		return sum1/count;
	}
	public double f2() {
		return sum2/count;
	}
	public double f3() {
		return sum3/count;
	}
	public void disp() {
		System.out.println("姓              名:"+name);
		System.out.println("学              号:"+no);
		System.out.println("语   文  成  绩:"+deg1);
		System.out.println("数   学  成  绩:"+deg2);
		System.out.println("英   语  成  绩:"+deg3);
		System.out.println("语文平均成绩:"+f1());
		System.out.println("数学平均成绩:"+f2());
		System.out.println("英语平均成绩:"+f3());
	}
}
public class Main
{
	//@SuppressWarnings({  "resource" })
	public static void main(String[] args) { 
		//Scanner sc=new Scanner(System.in);
		Student student=new Student("er","123",77,88,88);
		student.disp();
		Student student1=new Student("e3r","123435",77.8,88.9,88.8);
		student1.disp();
	}
}**/
import java.util.Scanner;
public class Main
{//矩阵转置
	@SuppressWarnings({  "resource" })
	public static void main(String[] args) { 
		 Scanner sc=new Scanner(System.in);
		 int m=sc.nextInt();
		 int n=sc.nextInt();
		 int a[][]=new int[m][n];
		 int b[]=new int[m*n+1];
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print(a[i][j]);
			 }
		 }
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 if(i==0&&j==0) {
					 b[0]=a[i][j];
				 }
				 else { 
				 b[2*i+j-2]=a[i][j];
				 break;
				 }
			 }
		 }
		 for(int i=0;i<m*n;i++)  {
				System.out.print(b[i]);
			 }
	 }
}