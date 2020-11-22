package lx;

import java.util.Scanner;
//<span style="font-family:FangSong_GB2312;">im</span>port java.util.Scanner;  
public class lx2{  
    public static void main(String[] args) {  
        //String s1,s2;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("请输入第一个字符串：");  
        String  s1=sc.nextLine();  
        System.out.print("请输入第二个字符串：");  
        String s2=sc.next();  
        System.out.println("输入的字符串是："+s1+" "+s2); 
        int de=sc.nextInt();
        sc.close();
        System.out.println(de);
    }  
} 