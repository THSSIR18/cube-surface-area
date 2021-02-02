import java.util.Scanner;
public class Project3_1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the edge of the cube: ");
		int edge = sc.nextInt();
		int total= edge * edge * 6;
		System.out.println("The surface area is: "+ total);
		
		
		
	}
}