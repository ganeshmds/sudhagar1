package day07;

public class PositiveNumber {
	public static void main(String[] args) {
		
		int[] a= {0,34,-56,78,-35,76};
		int count1 =0;
		int count2=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>0) {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println(count1+" is total even number"+"\n"+count2+" is total odd number");
	}

}
