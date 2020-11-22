package lx;



/*
import java.util.*;
/**
 * HashMap的用法
 */
/*
public class lx15 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map对象
		map.put("1", "Jack");     // 存储键和值
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("3", "Mary");
		map.put("3", "Tom");
		System.out.println("1：" + map.get("1"));  // 根据键获取值
		System.out.println("2：" + map.get("2"));
		System.out.println("3：" + map.get("3"));
	}
}
**/

//import java.util.*;
/**
 * HashMap的用法
 * 遍历集合中的元素，通过键值遍历
 */
/*
//集合中数据放入的时候集合知道其类型，取出时不知其类型
public class lx15 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Map map = new HashMap();            // 创建Map集合
		map.put("2", "Jack");               // 存储键和值
		map.put("1", "Rose");
		map.put("3", "Lucy");
		Set keySet = map.keySet();         // 获取键的集合
		Iterator it = keySet.iterator();  // 迭代键的集合
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);  // 获取每个键所对应的值
			System.out.println(key + ":" + value);
		}
	}
}
**/
//import java.util.*;
/**
 * HashMap的用法
 * 遍历集合中的元素，通过所有映射遍历
 */
/*
public class lx15 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map = new HashMap();    // 创建Map集合
		map.put("1", "Jack");       // 存储键和值
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set entrySet = map.entrySet();   //map中的键值对加入到entrySet对象
		Iterator it = entrySet.iterator();              // 获取Iterator对象
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) (it.next());// 获取集合中键值对映射关系
			Object key = entry.getKey();                // 获取Entry中的键
			Object value = entry.getValue();           // 获取Entry中的值
			System.out.println(key + ":" + value);
		}
	}
}
**/


//import java.util.*;
/**
 * Map的用法
 * values()方法的使用
 */
/*
public class lx15 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map集合
		map.put("3", "Jack");     // 存储键和值
		map.put("1", "Rose");
		map.put("2", "Lucy");
		Collection values = map.values();
		Iterator it = values.iterator();
		while (it.hasNext()) {
			Object value = it.next();
			System.out.println(value);
		}
	}
}
**/
//import java.util.*;
/**
 * Map的用法
 * LinkedHashMap的用法
 */
/*
public class lx15 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Map map = new LinkedHashMap();	  // 创建Map集合
		map.put("1", "Jack");              // 存储键和值
		map.put("3", "Lucy");
		map.put("2", "Rose");
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key); // 获取每个键所对应的值
			System.out.println(key + ":" + value);
		}
	}
}
**/

//import java.util.*;
/**
 * Prorperties集合的使用
 */

/*
public class lx15 {
   @SuppressWarnings("rawtypes")
public static void main(String[] args) {
	    Properties p=new Properties();             // 创建Properties对象
	    p.setProperty("Backgroup-color", "red");
	    p.setProperty("Font-size", "14px");
	    p.setProperty("Language", "chinese");
	    Enumeration names = p.propertyNames();     // 获取Enumeration对象所有键的枚举
	    while(names.hasMoreElements()){            // 循环遍历所有的键
	    	String key=(String) names.nextElement();
	    	String value=p.getProperty(key);       // 获取对应键的值
	    	System.out.println(key+" = "+value);
	    }
	}
}
**/

//import java.util.*;
/**
 * 强制类型转换出错
 */
/*
public class lx15 {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList(); // 创建ArrayList集合
		ArrayList<String> list = new ArrayList<String>();// 创建集合对象并指定泛型为String
		list.add("String"); // 添加字符串对象
		list.add("Collection");
		//list.add(1); // 添加Integer对象
		for (Object obj : list) { // 遍历集合
			System.out.println(obj);
		}
	}
}
**/

import java.awt.*;
public class lx13 {
	public static void main(String[] args) {
		// 建立新窗体对象
		Frame f = new Frame("我的窗体！");
		// 设置窗体的宽和高
		f.setSize(400, 300);
		// 设置窗体在屏幕中所处的位置(参数是左上角坐标)
		f.setLocation(300, 200);
		// 设置窗体可见
		f.setVisible(true);
	}
}
