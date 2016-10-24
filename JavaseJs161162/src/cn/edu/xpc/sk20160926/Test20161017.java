package cn.edu.xpc.sk20160926;

import java.util.Scanner;



public class Test20161017 {

	public static void main(String[] args) {

		/*
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的成绩:");
		int fenShu = input.nextInt();
		if (fenShu > 90) {//小括号里是条件
			System.out.println("优秀!");
		} else if (fenShu > 80) {

			System.out.println("良!");
		} else if (fenShu > 70) {

			System.out.println("中!");
		} else if (fenShu > 60) {

			System.out.println("及格!");
		} else {
			System.out.println("不及格了!");
		}*/
		//小红帽和狼外婆的故事
		/*Scanner input=new Scanner(System.in);
		System.out.println("小红帽说:谁呀?");
		String huiDa=input.next();//接收应答
		
		if(huiDa.equals("外婆")){//字符串内容的比较用equals
			System.out.println("进来吧!");
		}else if(huiDa.equals("大灰狼")){
			System.out.println("走开!!");
		}
		else if(huiDa.equals("天龙盖地虎")){
			System.out.println("小鸡炖蘑菇!");
		}
		else{
			System.out.println("外婆说不给陌生人开门");
		}
*/
		
		//登录
		/*
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的账号:");
		String yongHu=input.next();//接收应答
		System.out.println("请输入你的密码:");
		String miMa=input.next();//接收应答
		System.out.println("你的验证码是:D3i8");
		System.out.println("请输入屏幕上的验证码:");
		String yanZhengMa=input.next();//接收应答
		if(!yongHu.equals("xinxi")){
			System.out.println("用户不存在!");
		}
		else if(miMa.equals("123")){
			System.out.println("登录成功!");
		}
		else{
			System.out.println("密码错误!");	
		}*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("请选择您的服务类型:");
		System.out.println("1.查询话费\n2.业务办理\n3.停复机\n0人工");
		int x=input.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("你的话费余额为0,请尽快充值!");
			break;
		case 2:
			System.out.println("最新业务介绍:......");
			break;
		case 3:
			System.out.println("停机请.....");
			break;
		default:		
			System.out.println("工号:10001为您服务,你的通话将被录音!");
		
		}
		

		
		
		
	/*	if(x==1){
			System.out.println("你的话费余额为0,请尽快充值!");
		}
		else if(x==2){
			System.out.println("最新业务介绍:......");
		}
		else if(x==3){
			System.out.println("停机请.....");
		}
		else if(x==0){
			System.out.println("工号:10001为您服务,你的通话将被录音!");
		}*/
		
		
		
	}

}
