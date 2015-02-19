import java.util.Scanner;
public class GameRunner
	{
	public static void main(String[] args)
		{
		Chart.array();
		Chart.chart();
		Welcome.welcome();
		MidTerm.player();
		Chart.chart();
		MidTerm.computer();
		Chart.chart();
		
		Chart.chart();
		GameRunner.checkWin();
		}
	public static boolean checkWin()
		{
		String player = null;
		{	
			if (Chart.chart[0][0] == player && Chart.chart[0][1] == player && Chart.chart[0][2] == player || 
					 Chart.chart[1][0] == player && Chart.chart[1][1] == player && Chart.chart[1][2] == player ||
					 Chart.chart[2][0] == player && Chart.chart[2][1] == player && Chart.chart[2][2] == player || 
					 Chart.chart[0][0] == player && Chart.chart[1][0] == player && Chart.chart[2][0] == player || 
					 Chart.chart[0][1] == player && Chart.chart[1][1] == player && Chart.chart[2][1] == player || 
				     Chart.chart[0][2] == player && Chart.chart[1][2] == player && Chart.chart[2][2] == player || 
				     Chart.chart[0][0] == player && Chart.chart[1][1] == player && Chart.chart[2][2] == player ||            
				     Chart.chart[2][0] == player && Chart.chart[1][1] == player && Chart.chart[0][2] == player) 
					 return true;
			  else
			     {
				  return false;
			     }
			}
		}
	}
	