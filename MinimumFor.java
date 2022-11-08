package day07;

public class MinimumFor {
public static void main(String[] args) {
		
		int[] num= {23,45,56,78,98};
		int max =num[0];
		for (int i=0;i<num.length;i++) {
			if(num[i] <= max) {
				max=num[i];
			}
				
		}
		System.out.println(max);
}
}
