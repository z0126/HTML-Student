package lx;

/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Demo06 {
	@SuppressWarnings({ "unused", "resource", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList list=new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		list.add("stu5");
		list.add("stu6");
		list.add("stu7");
		list.add("stu8");
		list.add("stu9");
		list.add("stu10");
		//遍历方法（一）
		/*
		for(int i=0;i<10;i++) {
			System.out.println(list.get(i));
		}
		**/
		//遍历方法（二）
		/*
		System.out.println( list.toString());
		**/
		//遍历方法（三）
/*
		Iterator it=list.iterator();//获取Iterator对象
		while(it.hasNext()) {       //判断是否存在下一个元素
			Object obj=it.next();
			System.out.println(obj);
		}
		//遍历方法（四）
		/*
		 //foreach循环
		for(Object obj:list) {
			System.out.println(obj);
		}
		**/
/*
	}
}
**/
/*
class Person{
	String name;
	int age;
	Person(String i,int j){
		this.name=i;
		this.age=j;
	}
	public String toString() {
		return name+":"+age+"岁";
	}
	public int hashCode() {
		return name.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person per=(Person) obj;
		boolean b=this.name.equals(per.name);
		return b;
	}
}

public class Demo06 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Person per1=new Person("张三",32);
		Person per2=new Person("李四",16);
		Person per3=new Person("张三",32);
		hs.add(per1);
		hs.add(per2);
		hs.add(per3);
		System.out.println(hs.toString());
	}
}
**/

import java.util.*;
public class Demo06 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map = new HashMap();	  // 创建Map集合
		map.put("1", "Lucy");  // 存储键和值
		map.put("2", "John");
		map.put("3", "Smith");
		map.put("4", "Aimee");
		map.put("5", "Amanda");
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			  Object key = it.next(); 
			  Object value = map.get(key);
			  // 获取每个键所对应的值
			System.out.println(key + ":" + value);
		}
	}
}