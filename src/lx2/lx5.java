package lx2;

/*import java.util.Scanner;
//闰年判断
public class lx5{
	 public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if((year%400==0)||(year%4==0&&year/100!=0)){
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
	}
}*/

/*进制转换
 *public class lx5{
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			String str=Integer.toBinaryString(i);
			for (int j = 0; j <5- str.length(); j++) {
				System.out.print(0);
			}
			System.out.println(Integer.toBinaryString(i));
		}
	}
}*/
/**
 * 十进制转换为十六进制
 */
/*import java.util.Scanner;
public class lx5 {
	public static char f(long a){
		char temp = ' ';
		if(a<=9){
			temp = (char)(a+48);
			}else {
				switch ((int) a) { 
				case 10:   
					temp = 'A'; 
					break;    
				case 11:        
					temp = 'B';  
					break;
				case 12:
					temp = 'C';
					break;
				case 13:
					temp = 'D';
					break;
				case 14:
					temp = 'E';
					break;
				case 15:
					temp = 'F';
					break;
				}
			}//        System.out.println(temp);
		return temp;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		StringBuilder ss = new StringBuilder(); 
		if(a == 0){
			ss.append(0);
			}else {
				while (a != 0) {
					long number = a % 16;
					char s = f(number);
					ss.append(s);
					a = a / 16;
				}
			}
		System.out.println(ss.reverse().toString());
		
	}
}*/
/**
 * 大小写转换
 */
/*import java.util.Scanner;
public class lx5{
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char strs[]=new char[str.length()];
		strs=str.toCharArray();
		for (int i = 0; i < strs.length; i++) {
			if(strs[i]>='a'&&strs[i]<='z'){
				strs[i]=(char) (strs[i]-32);
			}else if(strs[i]>='A'&&strs[i]<='Z'){
				strs[i]=(char) (strs[i]+32);
			}
		}
		System.out.print(strs);
	}
}*/
/**
 * 字符串拼接 
 */
/*import java.util.Scanner;
public class lx5{
	@SuppressWarnings("resource")
	public static void main(String[] args){
		int j=0;
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		int temp=str1.length()+str2.length();
		char str1s[]=new char[str1.length()];
		char str2s[]=new char[str2.length()];
		char str[]=new char[temp];
		str1s=str1.toCharArray();
		str2s=str2.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			str[i]=str1s[j];
			j++;
		}
		j=0;
		for (int i = str1.length(); i < temp; i++) {
			str[i]=str2s[j];
			j++;
		}
		System.out.print(str);
	}
}*/