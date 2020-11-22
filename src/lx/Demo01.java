package lx;

import java.util.Scanner;

/*public class Demo01 {
	public static void main(String[] args) {

		    //数列求和
			double sum=0;//和的表示
			double F[]=new double[10];//定义数组
			F[0]=1;
			for(int i=1;i<10;i++)
			{
				if(i-2<0)
				  F[i]=2;
				else
				F[i]=F[i-1]+F[i-2];
			}
			for(int k=0;k<10;k++)
			{
				sum=sum+F[k];
			}
			System.out.println(sum);
		}

}
**/

            /*杨辉三角01**/	
/*public class Demo01 {
		public static void main(String[] args)
		   {
		      final int NMAX = 10; 
		 
		      // allocate triangular array
		      int[][] odds = new int[NMAX + 1][];
		      for (int n = 0; n <= NMAX; n++)
		         odds[n] = new int[n + 1];  
		 
		      // fill triangular array
		      for (int n = 0; n < odds.length; n++)
		         for (int k = 0; k < odds[n].length; k++)
		      {
		            // * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		            int lotteryOdds = 1;
		            for (int i = 1; i <= k; i++)
		               lotteryOdds = lotteryOdds * (n - i + 1) / i;
		 
		            odds[n][k] = lotteryOdds;
		         }
		 
		      // print triangular array
		      for (int[] row : odds)
		      {
		         for (int odd : row)
		            System.out.printf("%4d", odd);
		         System.out.println();
		      }
		   }
	   }
	   **/


/*杨辉三角02**/	
/*import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i,j;
		System.out.printf("请输入要打印的行数：");
		int n=input.nextInt();
		System.out.println();
		int [][]a=new int [n][n];
		for(i=0;i<n;i++)//三角形的首尾赋值
		{
			a[i][0]=1;
			a[i][i]=1;
		}
		for(i=2;i<n;i++)//三角形的内部赋值
		{
			for(j=1;j<10;j++)
				a[i][j]=a[i-1][j-1]+a[i-1][j];
		}
		for(i=0;i<n;i++)//三角形的输出
		{
			for(j=0;j<=i;j++)
				System.out.printf("%4d", a[i][j]);
			System.out.println();	
		}
		input.close();
		}
				
}
**/
       /*水仙数**/
/*public class Demo01 {
	public static void main(String[] args)
	   {
		System.out.print("水仙数有：");
	     for(int i=100;i<=999;i++)
	     {
	    	 int m,n,s;//分别表示数的百位，十位，个位
	    	 m=i/100;
	    	 n=(i%100)/10;
	    	 s=i%100%10;
	    	 if((m*m*m+n*n*n+s*s*s)==i)
	    		 System.out.print(i+"\n");
	     }
	   }
   }
**/


    //输出菱形

public class Demo01 {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	   {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){//控制行数
			
			for(int k=n-1;k>=i;k--){//打印空格
			
			System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){//打印*
			
			System.out.print("*");
			}
			System.out.println();
		}
		/*for(int i=1;i<n;i--)
			
		{
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();//自带换行
   		}
		*/
		
				for(int i=n-1;i>=1;i--)
		
				{
					for(int k=i;k<=n-1;k++)
					{
					System.out.print(" ");
					}
					for(int j=1;j<=2*i-1;j++)
					{
					System.out.print("*");
				   }
					System.out.println();//自带换行
		   		}
	   }
}

  //求出其最大公约数和最小公倍数
/*import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args)
	   {
		Scanner input = new Scanner(System.in);
		System.out.print("正数a="); 
		int a = input.nextInt();
		System.out.print("正数b="); 
		int b = input.nextInt();
		int count = a>=b?b:a;
		  for(int i =count;i>=1;i--){
		   if(a%i==0 && b%i==0){
		    System.out.println(a+"和"+b+"的最大公约数是"+i);
		    break;
		   }
		  } 
		   if(a>b)
		   for(int d=1;d<a;d++)
		   {
			  if(((a*d)%b)==0) 
			  {
				  System.out.println(a+"和"+b+"的最小公倍数是"+d*a);  
				  break;
			  }
		   }
		   else
			   if(a==b)
				   System.out.println(a+"和"+b+"的最小公倍数是"+a); 
			   else 
				   for(int d=1;d<=b;d++)
				   {
					  if(((b*d)%a)==0) 
					  {
						  System.out.println(a+"和"+b+"的最小公倍数是"+d*b);
						  break;
					  }
				   }
		  input.close();
	   }
}
**/

        //输出素数方法01
//import java.util.Scanner;
/*public class Demo01 {
	public static boolean isPrime(int n) {
		 
        if (n < 2)
            return false;
 
        for (int i = 2; i < n; ++i)
            if (n % i == 0)
                return false;
 
        return true;
 
    }
 
    public static void main(String[] args) {
    	
        for(int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
 
    }
}
**/
//输出素数方法02
/*import java.util.Scanner;
public class Demo01 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("请输入上限值:");
	  int a=input.nextInt();
	  int count=1;
	  for(int i=2;i<=a;i++)
	  {
		  for(int j=2;j<i;j++)
		  {
			  if(i%j==0)
				 count++; 
		  }
		  if(count<2) {
			  System.out.print(i+"----\n");
			  count=1;
		  }
		  else count=1;
	  }
	  input.close();
  }
}
**/
             //自由组合

/*public class Demo01 {
	public static void main(String[] args){
		int count=0;
		int s=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){ 
				   //相互都不相等
					if(i!=j&&i!=k&&j!=k){
						System.out.print(100*i+10*j+k+"  ");
						count++;
						s++;
						}  
					if(s==5)
					{
						System.out.println();
						s=0;
					}
					} 
				}  
			}
		System.out.print("共有"+count+"种");
		}
				
}
**/
//  前20项之和
/*public class Demo01 {
	public static void main(String[] args){
		int []x=new int[20];
		int n=1;//分母
		int m;//分子
		m=n+1;
		int sum=0;
		for(int i=0;i<20;i++)
		{
			x[i]=m/n;
			n=m;
			m=n+1;
		}
		for(int j=0;j<20;j++)
		{
			sum=sum+x[j];
		}
		System.out.println("前20项和是:"+sum);
		}
				
}
**/
        //第100项
/*import java.util.Scanner;
public class Demo01 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("请输入要的第几位的位数:");
	  int n=input.nextInt();
	  double S=0;//表示要求的值
	  double m=1;//计数器
	  while(m<=n)
	  {
		  if(m%2==0)
		  {
			  S=S-(1/m);
			  m++;
		  }
		 else 
		 {
			  S=S+(1/m);
			  m++;
		  }
	  }
	  System.out.printf("%.4f",S);//限制输出位数
	  //System.out.println(String.format("%.4f",S)); 
	  input.close();
  }
}
**/
//完数
/*public class Demo01 {
	 public static void main(String[] args){
		 int i,j;
		 int num = 0;
		 for(i=1; i<=1000; i++){
			 num = 0;
			 for(j=1; j<i; j++){
				 //找出这个数的所有因子
				 if(i%j == 0){
					 num = num+j;   //将所有因子相加  
					 } 
				 }
			 if(i == num){
				 //判断这个数的所有因子之和与它本身是否相等  
				 System.out.print(i+" ");
				 }
			 }    
	 }
}
*/