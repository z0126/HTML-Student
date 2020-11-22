package lx;

import java.util.Scanner;

public class lx4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double s[][]=new double [10][6];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<6;j++)
			  s[i][j] = input.nextDouble();
		}
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<6;j++)
			{
				double count=0;
				count=s[i][j]+count;
				if(count>=550)
					System.out.print(i);
			}
		}
		input.close();
	}
}
