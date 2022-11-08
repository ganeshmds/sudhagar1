package day07;

public class IndividualIntialization {
	public static void main(String[] args) {
		
		String [] a = new String[3];
		a[0] = "moon";
		a[1]="sun";
		a[2]="earth";
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].charAt(a.length-1));
		}
	}

}
