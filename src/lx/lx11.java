package lx;

//import java.util.*;
/**
 * String类构造方法的使用
 */
/*public class lx13 {
	public static void main(String[] args) throws Exception {
		// 创建一个空的字符串
		String str1 = new String();
		// 创建一个内容为abcd的字符串
		String str2 = new String("abcd");
		// 创建一个内容为字符数组的字符串
		char[] charArray = new char[] { 'D', 'E', 'F' };
		String str3 = new String(charArray);
		System.out.println("a" + str1 + "b");
		System.out.println(str2);
		System.out.println(str3);
	}
}

**/

/*
 * StringBuffer的常用方法
 */

/*
public class lx13 {
	public static void main(String[] args) {
		System.out.println("1、添加------------------------");
		add();
		System.out.println("2、删除------------------------");
		remove();
		System.out.println("3、修改------------------------");
		alter();
	}
	public static void add() {
		StringBuffer sb = new StringBuffer(); // 定义一个字符串缓冲区
		sb.append("abcdefg"); // 在末尾添加字符串
		System.out.println("append添加结果：" + sb);
		sb.insert(2, "123"); // 在指定位置插入字符串
		System.out.println("insert添加结果：" + sb);
	}
	public static void remove() {
		StringBuffer sb = new StringBuffer("abcdefg");
		sb.delete(1, 5); // 指定范围删除
		System.out.println("删除指定位置结果：" + sb);
		sb.deleteCharAt(2); // 指定位置删除
		System.out.println("删除指定位置结果：" + sb);
		sb.delete(0, sb.length()); // 清空缓冲区
		System.out.println("清空缓冲区结果：" + sb);
	}
	public static void alter() {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.setCharAt(1, 'p'); // 修改指定位置字符
		System.out.println("修改指定位置字符结果：" + sb);
		sb.replace(1, 3, "qq"); // 替换指定位置字符串或字符
		System.out.println("替换指定位置字符（串）结果：" + sb);
		System.out.println("字符串翻转结果：" + sb.reverse());
	}
}
**/

/*
public class lx13{
	public static void main(String[] args) {
		String s1="a";
		String s2="b";
		String s3=s1+s2;
		System.out.println(s3);
		StringBuffer sb1=new StringBuffer("c");
		StringBuffer sb2=new StringBuffer("d");
		//StringBuffer sb3=sb1+sb2;//无法使用连接符
		System.out.println(sb1.equals(sb2));//无法使用equals判断是否相等,永远是false,不能copy
		
	}
}
**/

/*
public class lx13 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();// 循环开始时的当前时间
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();// 循环结束后的当前时间
		System.out.println(sum);
		System.out.println("程序运行的时间为：" + (endTime - startTime) + "毫秒");
	}
}

**/


/**
 * 数组元素的拷贝
 */

/*
public class lx13 {
	public static void main(String[] args) {
		int[] fromArray = { 101, 102, 103, 104, 105, 106 }; // 源数组
		int[] toArray = {201, 202, 203, 204, 205, 206, 207 }; // 目标数组
		System.arraycopy(fromArray, 2, toArray, 3, 4); // 拷贝数组元素
		// 打印目标数组中的元素(从原数组的第2个位置copy到目标数组的第三个位置copy4个编号从0开始，串长不变)
		for (int i = 0; i < toArray.length; i++) {
			System.out.println(i + ": " + toArray[i]);
		}
	}
}
**/

/**
 * Runtime类的使用
 */
/*
public class lx13 {
	public static void main(String[] args) {
		String[] s= {("231412"),("1231")};
		System.out.println(s[1]);
		Runtime rt = Runtime.getRuntime(); // 获取
		System.out.println("处理器的个数: " + rt.availableProcessors() + "个");
		System.out.println("空闲内存数量: " + rt.freeMemory() / 1024 / 1024 + "M");
		System.out.println("最大可用内存数量: " + rt.maxMemory() / 1024 / 1024 + "M");
	}
}

**/

//import java.io.*;
/**
 * 使用exec()方法打开记事本
 */

/*
public class lx13 {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime(); // 创建Runtime实例对象
		rt.exec("mspaint.exe"); // 调用exec()方法打开电脑应用
	}
}
**/


/**
 * 打开的记事本并在3秒后自动关闭
 */
public class lx11 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime(); // 创建一个Runtime实例对象
		Process process = rt.exec("notepad.exe");// 得到表示进程的Process对象
		Thread.sleep(3000); // 程序休眠3秒
		process.destroy(); // 杀掉进程
	}
}