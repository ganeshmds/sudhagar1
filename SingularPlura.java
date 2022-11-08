package day07;

public class SingularPlura {
	public static void main(String[] args) {
		String []a= new String[4];
		int count=0;
		a[1]="birds";
		a[0]="people";
		a[2]="boy";
		a[3]="womens";
		
		for(int i=0;i<a.length;i++) {
			if(a[i].endsWith("s")) {
				System.out.println(a[i]);
			}
			else {
				count++;
				
			}
		}
		
		System.out.println(count);
		
	}

}
