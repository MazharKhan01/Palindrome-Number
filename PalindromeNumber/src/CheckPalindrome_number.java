import java.util.Scanner;

public class CheckPalindrome_number {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int z=a;
		int result=0;
		
		while(a>0) {
			int rem=a%10;
			
			result=result*10+rem;
			a=a/10;
			
		}
		System.out.println(result);
		if(result==z) {
			System.out.println(result==z);
		}
		else{
			System.out.println(result==z);
		}
		
	}

}
