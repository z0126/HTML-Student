package lx;
/*
import java.util.Scanner;
public class Demo05 {
@SuppressWarnings("resource")
public static void main(String[] args) {
int num=0;//判断数字
int blank = 0;//判断空格
int letter = 0;//判断英文
int qita = 0;//判断其他字符
Scanner scan = new Scanner(System.in);
String str=scan.nextLine();
char[] ar= str.toCharArray();
for(int i= 0;i < ar.length;i++) {
if(Character.isDigit(ar[i])) {
//isDigit判断数组中是否有数字
num++;
}else if(Character.isSpaceChar(ar[i])) {
//isSpaceChar判断是否有空格
blank++;
}else if(Character.isLetter(ar[i])) {
//isLetter判断是否有字母
letter++;
}else{
qita++;
}
}
System.out.println("字母个数："+letter);
System.out.println("数字个数："+num);
System.out.println("空格个数："+blank);
System.out.println("其他字符个数："+qita);
}
}
**/
/*
import java.util.Random;
public class Demo05 {
		public static void main(String[] args) {
			   Random rand = new Random();
		        int[] num = new int[5];
		        for (int i = 0; i < num.length; i++) {
		            num[i] = 20 + rand.nextInt(31);
		            System.out.println(num[i]);
		        }
		}
}
**/
/*
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class Demo05 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 100);
 
        Date date = calendar.getTime();
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
        String string = format.format(date);
        System.out.println(string);
    }
}
**/
/*
public class Demo05{
	public static void main(String[] arge){
		System.out.println(Math.abs(-5));
		System.out.println(Math.ceil(6.6));
		System.out.println(Math.floor(-7.8));
		System.out.println(Math.round(-4.9));
		System.out.println(Math.max(8.1,-8.1));
		System.out.println(Math.min(6.1,-6.1));
	}
}
**/
public class Demo05{
	public static void main(String[] arge){
		String s="dfferghuklmbdfd";
		System.out.println("atr.length():"+s.length());
		System.out.println("atr.charAt(0):"+s.charAt(0));
		System.out.println("lastIndexOf(m):"+s.lastIndexOf('m'));
		System.out.println("substring(2,4):"+s.substring(2,4));
		System.out.println("indexOf(g):"+s.indexOf('g'));
	}
}