package day07;

public class Stringminium {
	public static void main(String[] args) {
		
		String [] a= {"ganz","bharath","karthi"};
		int min=a[0].length();
		String b="";

		for(int i=0;i<a.length;i++) {
			if(a[i].length()<= min) {
				min=a[i].length();
				b=a[i];
			}
		}
		System.out.println(b);

}
}