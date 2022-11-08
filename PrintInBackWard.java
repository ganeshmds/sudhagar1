package day07;

public class PrintInBackWard {
	public static void main(String[] args) {
		
		int[] num= {12,23,45,67};
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
