import java.util.Scanner;
public class Chart 
	{
	static String chart [][] = new String [3][3];
	public static void array()
		{
		for(int row = 0; row < chart.length; row++ )
			{
			for( int col = 0;col < chart[0].length; col++ )
				{
				chart[row][col] = "  ";
				}
			System.out.println();
			}
		}
	public static void chart()
		{
		System.out.println("    1    2     3");
		System.out.println("  ...............");
		System.out.println("A | " + chart[0][0] + " | " + chart[0][1] + " | " + chart[0][2]);
		System.out.println("  ...............");
		System.out.println("B | " + chart[1][0] + " | " + chart[1][1] + " | " + chart[1][2]);
		System.out.println("  ...............");
		System.out.println("C | " + chart[2][0] + " | " + chart[2][1] + " | " + chart[2][2]);
		System.out.println("  ...............");
		System.out.println();
		}
	}
	