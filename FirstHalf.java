package day07;

public class FirstHalf {
	public static void main(String[] args) {
		
		int[] a=new int[8];
		a[0]= 1;
		a[1]= 34;
		a[2]=43;
		a[3]=56;
		a[4]=67;
		a[5]=78;
		a[6]=87;
		a[7]=98;
		
		/*for(int i=0;i<a.length/2;i++) {
			System.out.println(a[i]);
		}*/
		
		for(int i=(a.length/2)-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
