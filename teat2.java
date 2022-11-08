package day07;

public class teat2 {
	public static void main(String[] args) {
		
		String []a= {"gangester","bunnys","cookies"};
		String max= a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i].length()!=max.length()) {
				max =a[i];
				System.out.println(max+" "+max.length());
			}
		
		}

	}

}
