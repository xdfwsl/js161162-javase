package cn.edu.xpc.sk20160926;

public class OuShuHe {

	public static void main(String[] args) {

		int i=2;//自增数
		int sum=0;//和
		
		while (i<102) {
			sum+=i;
			i+=2;
		}
		System.out.println("sum="+sum);
	}

}
