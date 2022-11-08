package day07;

public class StudentsName {
public static void main(String[] args) {
	
	String[] a= {"ganesh","Suthagar","amani","dinesh","suresh","naresh","deva","hari"};
	int count1=0;
	int count2=0;
/*/for(int i=0;i<a.length;i++) {
		if(a[i].startsWith("a")||a[i].startsWith("s")) {
		count1++;
		}
	}
//	System.out.println(count1+" names are starts with a & s");/*/
	/*/for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i].charAt(a[i].length()-1));/*/
//		}
	
	for(int i=0;i<a.length;i++) {
		if(a[i].contains("a")||a[i].contains("e")||a[i].contains("i")||a[i].contains("o")||a[i].contains("u")) {
			System.out.println(a[i]);
		}
		if(a[i].length()%2==0) {
			count1++;
		}
		else {
			count2++;
		}
	}
	System.out.println(count1+" is count of even numbers"+"\n"+count2+" is count of odd numbers");
	}
	
}


