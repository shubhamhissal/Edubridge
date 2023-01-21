import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		System.out.println("Enter the Number:");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();		
		if(num%2==0)
			System.out.println("The Number is Even-->"+num);
		else
			System.out.println("The Number is Odd-->"+num);
		
	}

}
