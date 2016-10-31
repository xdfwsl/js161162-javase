package cn.edu.xpc.sk20160926;

public class YiDaoWu {

	public static void main(String[] args) {

		int x = 12345;

		do {

			System.out.println(x % 10);
			x = x / 10;
		} while (x > 0);

	}

}
