package cn.edu.xpc.xxx.js1612.zhou13;

import java.util.Scanner;

/**
 * 数组的演示
 * 2016-11-21 11:14:00
 * @author Administrator 
 */
public class Wang {

	public static void main(String[] args) {
		String[] z3;// 声明一个字符串数组
		z3 = new String[6];// 分配数组的空间
		/*
		 * z3[0]="王沛杰"; z3[1]="张硕康"; z3[2]="田则成";
		 */
		String z = "";

		for (int i = 0; i < 6; i++) {
			System.out.print("请输入同学的名字:");
			Scanner input = new Scanner(System.in);
			String name = input.next();// 接收键盘输入
			if (name.equals("n")) {
				break;// 如果名字输入的是n的话就退出循环
			} else {
				z3[i] = name;
				z = z + z3[i];// 放所有同学名字,字符串的相连,想显示什么就在这里改
			}

		}
		System.out.println(z);

	}
}
