/**
 * 
 */
package cn.edu.xpc.sk20160926;

import java.util.Scanner;



/**
 * @author Administrator
 *
 */
public class Test20161010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int days=46; //存下天数
		int weeks;//准备存周数
		weeks=days/7;
		int leftDays=days%7;
		System.out.println(days+"天等于"+weeks+"周零"+leftDays+"天");
*/
		
/*		//求圆的面积
		double r=1.5;//圆的半径
		double mianJi;//声明变量来存面积
		double pai=3.14;
		mianJi=pai*r*r;
		System.out.println(mianJi);*/
//		int age=19;
//		char sex='A';
//		int wangle=sex;
//		System.out.println(wangle);
/*		int a=110;
		double b=10.9234567;
		int c=(int)b;
		
		System.out.println(c);*/
		int liSi=78;
		int zhangSan;
		Scanner input =new Scanner(System.in);
	
		System.out.print("请输入张三的成绩:");
	
		zhangSan=input.nextInt();
		System.out.println(zhangSan>liSi);
		
	}

}
