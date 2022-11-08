package day07;

public class SecondHalf {
public static void main(String[] args) {
		
		String[] a= {"ad","gh","pc","fd","vp","hm"};
	
//		for(int i=0;i<a.length/2;i++) {
//			System.out.println(a[i]);
//		}
		for(int i=a.length/2;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=a.length-1;i>=a.length/2;i--) {
			System.out.println(a[i]);
		}


}
}
