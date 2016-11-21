package cn.edu.xpc.xxx.js1612.zhou13;

import java.util.Scanner;

public class Wang {

	public static void main(String[] args) {
		String[] z3;
		z3 = new String[6];
		/*
		 * z3[0]="王沛杰"; z3[1]="张硕康"; z3[2]="田则成";
		 */
		String z="";

		for (int i = 0; i < 6; i++) {
			System.out.print("请输入同学的名字:");
			Scanner input = new Scanner(System.in);
			String name = input.next();
			if (name.equals("n")) {
				break;
			} else {
				z3[i] = name;
				z=z+z3[i];
			}

		
		}
		System.out.println(z);
	
	}
}
