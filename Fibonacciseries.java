package Week1.day1Assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<5;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			
			System.out.println(sum);
			
		}
		
		

	}


	}


