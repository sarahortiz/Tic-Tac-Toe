import java.util.Scanner;
public class MidTerm
	{
	public static void player()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("At which place would you like to make your move?");
		String move = userInput.nextLine();
		System.out.println(move);
		if (move.equals("A1")) 
			Chart.chart [0][0] = "X";
		else if (move.equals("A2"))
			Chart.chart [0][1] = "X";
		else if (move.equals("A3"))
			Chart.chart [0][2] = "X";
		else if (move.equals("B1"))
			Chart.chart [1][0] = "X";
		else if (move.equals("B2"))
			Chart.chart [1][1] = "X";
		else if (move.equals("B3"))
			Chart.chart [1][2] = "X"; 
		else if (move.equals("C1"))
			Chart.chart [2][0] = "X";
		else if (move.equals("C2"))
			Chart.chart [2][1] = "X";
		else if (move.equals("C3"))
			Chart.chart [2][2] = "X";
		}
	
	public static void computer()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Good move, now I will go next.");
		String move = userInput.nextLine();
		int computer = (int) (Math.random()*9)+1;
		if (computer == 1)
			{
			if (Chart.chart[0][0].equals(" "))
				{
				Chart.chart[0][0] = "O";
				}
			else computer();
		if (computer == 2)
			if (Chart.chart[0][1].equals(" "))
				{
				Chart.chart[0][1] = "O";
				}
			else computer();
		if (computer == 3)
			if (Chart.chart[0][2].equals(" "))
				{
				Chart.chart[0][2] = "O";	
				}
			else computer();
		if (computer == 4)
			if (Chart.chart[1][0].equals(" "))
				{
				Chart.chart[1][0] = "O";
				}
			else computer();
		if (computer == 5)
			 if (Chart.chart[1][1].equals(" "))
				{
				Chart.chart[1][1] = "O";	
				}
			 else computer();
		if (computer == 6)
			 if (Chart.chart[1][1].equals(" "))
				{
				Chart.chart[1][1] = "O";	
				}
			 else computer();
		if (computer == 7)
			if (Chart.chart[2][0].equals(" "))
				{
				Chart.chart[2][0] = "O";	
				}
			else computer();
		if (computer == 8)
			if (Chart.chart[2][1].equals(" "))
				{
				Chart.chart[2][1] = "O";	
				}
			else computer();
		if (computer == 9)
			if (Chart.chart[2][2].equals(" "))
				{
				Chart.chart[2][2] = "O";	
				}
			else computer();
			}		
		}
	}
				

	

		
	
		
