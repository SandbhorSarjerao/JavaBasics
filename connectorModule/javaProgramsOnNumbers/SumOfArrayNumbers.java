package javaProgramsOnNumbers;

public class SumOfArrayNumbers {

	public static void main(String[] args) {
	
		int sum = 0;
		int a[] = {1,2,3,4,5,6,7,8,9} ;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum of Array Numbers is => "+sum);
	}
}
