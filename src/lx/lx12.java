package lx;


/*
public class lx14 {
	public static void main(String[] args) {
		System.out.println("计算绝对值的结果: " + Math.abs(-1));
		System.out.println("求大于参数的最小整数: " + Math.ceil(5.6));
		System.out.println("求小于参数的最大整数: " + Math.floor(-4.2));
		System.out.println("对小数进行四舍五入后的结果: " + Math.round(-4.6));
		System.out.println("求两个数的较大值: " + Math.max(2.1, -2.1));
		System.out.println("求两个数的较小值: " + Math.min(2.1, -2.1));
		System.out.println("生成一个大于等于0.0小于1.0随机值: " + Math.random());
	}
}

**/
/*
public class lx14 {
	public static void main(String args[]) {
		Random r = new Random(10); // 不传入种子
		// 随机产生10个[0,100)之间的整数
		for (int x = 0; x < 10; x++) {
			System.out.println(r.nextInt(5));
		}
	}
}

**/
/*
public class lx14 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList link = new LinkedList(); // 创建LinkedList集合
		ArrayList list = new ArrayList(); // 创建ArrayList集合
		list.add("stu1"); // 向集合中添加元素
		list.add("stu2");
		list.add("stu3");
		list.add(79);
		link.add("stu1"); // 向集合中添加元素
		link.add("stu2");
		link.add("stu3");
		link.add(79);
		System.out.println("集合的长度：" + list.size()); // 获取集合中元素的个数
		try {
			/*
			for(int j=0;j<=list.size();j++) {
				System.out.println("第"+j+"个元素是：" + list.get(j)); // 取出并打印指定位置的元素
			}
			
			System.out.println( link.toString());
		}
		catch(Exception e) {
			System.out.println("出现越界.....");
		}
	}
}

**/

import java.util.*;
/**
 * LinkedList集合的使用
 */
/*
public class lx14 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList link = new LinkedList(); // 创建LinkedList集合
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");
		link.add("stu4");
		System.out.println(link.toString()); // 取出并打印该集合中的元素
		link.add(3, "Student"); // 向该集合中指定位置插入元素
		link.addFirst("yui"); // 向该集合第一个位置插入元素
		System.out.println(link);
		System.out.println(link.getFirst()); // 取出该集合中第一个元素
		link.remove(3); // 移除该集合中指定位置的元素
		link.removeFirst(); // 移除该集合中第一个元素
		System.out.println(link);
	}
}
**/

/*
public class lx14 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 创建ArrayList集合
		list.add("data_1"); // 向该集合中添加字符串
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator it = list.iterator(); // 获取Iterator对象
		while (it.hasNext()) { // 判断ArrayList集合中是否存在下一个元素
			Object obj = it.next(); // 取出ArrayList集合中的元素
			System.out.println(obj);
		}
	}
}
**/

/**
 * foreach循环
 */
public class lx12 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 创建ArrayList集合
		list.add("Jack"); // 向ArrayList集合中添加字符串元素
		list.add("Rose");
		list.add("Tom");
		for (Object obj : list) { // 使用foreach循环遍历ArrayList对象
			System.out.println(obj); // 取出并打印ArrayList集合中的元素
		}
	}
}