package cn.edu.xpc.sk20160926;

import java.util.Scanner;

public class QTuiChu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name="";
		do {
			System.out.println("唱歌,跳舞,打麻将");

			System.out.println("可以了吗?q退出");

			name=input.next();//注意变量的作用域
		} while (!name.equals("q"));

		System.out.println("完成了");
	}

}
