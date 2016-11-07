package cn.edu.xpc.sk20160926;
/**
 * 学生类
 * @author Administrator
 *
 */
public class XueSheng {

	//学生的属性 
	int xueHao;//这是学号
	String xingMing;
	
	//可以进行自我介绍
	private void jieShao() {
		System.out.println("我的名字叫"+this.xingMing+",我的学号是"+this.xueHao);
	}
	
	public static void main(String[] args) {
		XueSheng liuTao=new XueSheng();//刘涛造出来了
		liuTao.xueHao=39;
		liuTao.xingMing="刘涛";
		
		liuTao.jieShao();
		
	}
	

	
	
}
