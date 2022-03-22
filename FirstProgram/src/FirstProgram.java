import java.util.Scanner;


public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Enter two Whole Numbers on a line:");
		
		int n1,n2,count=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		n1=keyboard.nextInt();
		n2=keyboard.nextInt();
		
		for(count=n1;count<=n2; count++)
		{
			
		}
		
		count=count-n1;
		
		System.out.println("the count of number between two number:"+count);
		
		keyboard.close();
		

	}

}
