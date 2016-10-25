package cn.edu.xpc.sk20160926;
/*
 * 这是计算161班的抽奖程序
 * 作者:李
 * 2016-10-10
 * 
 * */
public class ChouJiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int renShu=42;//班级人数
		int i=0;
		while (i<5) {
			System.out.println((int)(Math.random()*renShu+1));
			i++;
		}
		
	}

}
