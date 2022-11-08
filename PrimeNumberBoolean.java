package day07;

public class PrimeNumberBoolean {
	public static void main(String[] args) {
		
		int num=11;
		boolean isPrime=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
			if(isPrime==true) {
				System.out.println("The given number is prime number");
			}
			else {
				System.out.println("The Given number is not prime number");
			}
		}
	}


