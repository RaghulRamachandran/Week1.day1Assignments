package Week1.day1Assignments;

public class Week1day1Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		boolean isPrime =true;
		for (int i=2;i<a;i++) {
			
		if(a%i==0) {
			isPrime =false;
		}
		}
		if(isPrime) {
			System.out.println(a+"Its a Prime Number");
		}
	}
}