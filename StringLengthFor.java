package day07;

public class StringLengthFor {
	public static void main(String[] args) {
	
		String [] a= {"ganz","bharath","karthi"};
		int max=a[0].length();
		String b="";

		for(int i=0;i<a.length;i++) {
			if(a[i].length()>= max) {
				max=a[i].length();
				b=a[i];
			}
		}
		System.out.println(b+" length is "+max);
	}

}
