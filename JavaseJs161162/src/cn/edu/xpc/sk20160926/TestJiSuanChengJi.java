package cn.edu.xpc.sk20160926;

public class TestJiSuanChengJi {

	public static void main(String[] args) {

		JiSuanChengJi jj = new JiSuanChengJi();
		jj.java = 80;
		jj.sjk = 90;
		jj.wy = 89;

		/*
		 * System.out.println("该同学的总分是"+jj.zongFen());
		 * System.out.println("该同学的平均分是"+jj.pingJun());
		 */
		jj.xianZongFen();
		jj.xianShiPingJun();

	}

}
