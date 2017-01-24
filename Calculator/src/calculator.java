import java.util.Scanner;
public class calculator
	{
		static Scanner userInput;
		
		public static void main(String[] args)
			{
				userIn();
				add();
				sub();
				mult();
				div();
			}
		
		public static void userIn()
		{
			
		}

		public static double add(double addnum1, double addnum2)
			{
				System.out.println(add(2, 3));
				return addnum1 + addnum2;
			}
			
		public static double sub(double subnum1, double subnum2)
			{
				System.out.println(add(2, 3));
				return subnum1 - subnum2; 
			}
			
		public static double mult(double multnum1, double multnum2)
			{
				System.out.println(add(2, 3));
				return multnum1 * multnum2;
			}
			
		public static double div(double divnum1, double divnum2)
			{
				System.out.println(add(2, 3));
				return divnum1 / divnum2;
			}
//	hello	
	}