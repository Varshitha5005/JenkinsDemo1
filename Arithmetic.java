import java.util.Scanner;
class Arithmetic
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		int b=ob.nextInt();
		System.out.println("Addition:"+(a+b));
		System.out.println("Difference:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Divsion:"+(a/b));
	}
}
