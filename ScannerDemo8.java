import java.util.Scanner;
class ScannerDemo8
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("PLEASE ENTER YOUR AGE");
	int age=sc1.nextInt();

	if(age>=18)
	{
	System.out.println("ELLIGIBLE FOR VACCINATION");
	}
	else
	{
	System.out.println("NOT ELLIGIBLE FOR VACCINATION");
	}
}
}