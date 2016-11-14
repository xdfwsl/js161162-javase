package cn.edu.xpc.sk20160926;

/**
 * 这是一个计算成绩的类
 * 
 * @author 李
 * 
 *
 */
public class JiSuanChengJi {

	int java;// java成绩
	int wy;// 网页成绩
	int sjk;// 数据库成绩

	public int zongFen() {
		return java + wy + sjk;
	}

	public void xianZongFen() {

		System.out.println(this.zongFen());

	}
	public int pingJun() {
		return this.zongFen() / 3;
	}

	public void xianShiPingJun() {
		System.out.println(this.pingJun());
	}

}
