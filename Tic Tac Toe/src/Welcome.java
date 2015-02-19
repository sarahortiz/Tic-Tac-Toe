import java.util.Scanner;
public class Welcome
	{
	public static void welcome()
		{
		Scanner userlnput=new Scanner(System.in);
		System.out.println("Hello, welcome to the game of Tic Tac Toe! What is your name?");
		String name=userlnput.nextLine();
		System.out.println("Welcome, " + name + "! You look lovely today! You will be X and I will be O. ");
		}
	}
