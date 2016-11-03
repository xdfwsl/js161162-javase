package cn.edu.xpc.sk20160926;

public class DaYu20 {

	public static void main(String[] args) {

		int sum=0;//和
		int i;
		for (i = 0; i <= 10; i++) {
			sum=sum+i;
			if(sum>20){
				break;
			}
		}
		System.out.println(i);
		
	}

}
