package day07;

public class OddOrEvenBulk {
	public static void main(String[] args) {

	
	int[] a= {0,34,56,78,35,76};
	int count1 =0;
	int count2=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]+" is Even number");
			count1++;
		}
		else {
			System.out.println(a[i]+" is odd number");
			count2++;
		}
	}
System.out.println(count1+"\n"+count2);
}
}