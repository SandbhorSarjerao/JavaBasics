
public class PrintArrayElementLocation {

	public static void main(String[] args) {
		

		int location = 0;
		int a[] = {1,2,3,4,5,6,7,8,9} ;
		
		for(int i=0; i<a.length; i++)
		{
			// System.out.println(a[i]);
			if(a[i]==6)
			{
				location = a[i];
				break;
			}
		}
		System.out.println("Location of 6 Array Numbers is => "+location);
	}

}
