package cn.edu.xpc.sk20160926;

public class DoWhile3 {

	public static void main(String[] args) {

		int i=1;
		int sum=0;
		do {
			if(i%3==0){
				sum+=i;//sum=sum+i;
				
			}
			i++;
		} while (i<=100);
		System.out.println("sum="+sum);
	}

}
