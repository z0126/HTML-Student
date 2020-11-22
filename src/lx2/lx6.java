package lx2;

import java.util.Scanner;

/*public class lx6 {
	public static void main(String[] args){
		int temp=0;
		for (int i = 1; i <= 2019; i++) {
			if (i%1000==9) {
				temp++;
				continue;
			}else {
				if (i%100==9) {
					temp++;
					continue;
				}else {
					if (i%10==9) {
						temp++;
						continue;
					}
					else{
						continue;
					}
				}
			}
		}
		System.out.print(temp);
	}

}*/

/*public class lx6 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int s[]=new int[5];
		int temp=0;
		for(int i=0;i<5;i++){
			s[i]=input.nextInt();
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = i; j < s.length; j++) {
				if(s[i]<s[j]){
					for (int h = j; h < s.length; h++) {
						if (s[j]<s[h]) {
							temp++;
							break;
						}
					}
				}
			}
		}
		System.out.print(temp);
	}

}*/


public class lx6 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for (int i = 1; i <=a; i++) {
			if(a==1){}
		}
	}

}