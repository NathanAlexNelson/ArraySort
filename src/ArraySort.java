import javax.swing.JOptionPane;
import java.util.Scanner;



public class ArraySort {
	public static void main(String[] args) {
		int Y = 0;
		int win = 0;
		int X = 0;
		int playedGames = 0;
		int evens = 0;
		int oddNum = 0;
		int OddWin = 0;
		int EvenWin = 0;
		int[] guess = new int[10];
	/*	float percentageWin;
		float percentageEven;
		float percentageOdd;
		float percentageOddWin;
		float percentageEvenWin;*/
		int[] match = new int[10];
		int[] winner = new int[10];
		int[] Computerrole = new int[10];
		int high = 0;
		
		
		JOptionPane
		.showMessageDialog(null,
				"You walk up to a table where a man rolls a die and you guess a number.");
		Scanner input = new Scanner(System.in);
		high = input.nextInt();
		RanNum Limit = new RanNum();		
		while (Y < 10) {
			
			RandomNumber diceRoll = new RandomNumber();
			
			/*JOptionPane                 This is a test Pane
			 .showMessageDialog(null, diceRoll);*/
			Computerrole[Y] = diceRoll.GetANumber();

			guess[Y] = Limit.GetANumber(high);

			
			
			if (guess[Y] == 1) {
				JOptionPane.showMessageDialog(null, "You have guessed odds!");
			} else if (guess[Y] == 2) {
				JOptionPane.showMessageDialog(null, "You have chosen the evens!");
			}

			if ((Computerrole[Y] == 1) || (Computerrole[Y] == 3) || (Computerrole[Y] == 5) || (Computerrole[Y] == 7) || (Computerrole[Y] == 9) && (guess[Y] == 1)) {
				JOptionPane
						.showMessageDialog(null,
								"You have guessed correctly lad!\nI hope to never see you again!");
				win++;
				winner[Y] = 1;
				playedGames++;
				oddNum++;
				OddWin++;
				}
			else if ((Computerrole[Y] == 2) || (Computerrole[Y] == 4) || (Computerrole[Y] == 6) || (Computerrole[Y] == 8) || (Computerrole[Y] == 10) && (guess[Y] == 1)) {
				JOptionPane
						.showMessageDialog(null,
								"I've stolen yer earnings!\nPerhaps you'd like to try again?");
				playedGames++;
				}
			else if ((Computerrole[Y] == 2) || (Computerrole[Y] == 4) || (Computerrole[Y] == 6) || (Computerrole[Y] == 8) || (Computerrole[Y] == 10) && (guess[Y] == 2)) {
				JOptionPane
						.showMessageDialog(null,
								"You have guessed correctly lad!\nI hope to never see you again!");
				win++;
				winner[Y] = 1;
				playedGames++;
				evens++;
				EvenWin++;
				} 
			else if ((Computerrole[Y] == 1) || (Computerrole[Y] == 3) || (Computerrole[Y] == 5) || (Computerrole[Y] == 7) || (Computerrole[Y] == 9) && (guess[Y] == 2)) {
				JOptionPane
						.showMessageDialog(null,
								"I've stolen yer earnings!\nPerhaps you'd like to try again?");
				playedGames++;
				oddNum++;
				evens++;
			}



/*		JOptionPane.showMessageDialog(null, "You have played " + playedGames + " and won " + win + " games!");

		percentageWin = (float) ((win*100)/playedGames);
		percentageEven = (float) ((evens*100)/playedGames);
		percentageOdd = (float) ((oddNum*100)/playedGames);
		percentageOddWin = (float) ((OddWin*100)/playedGames);
		percentageEvenWin = (float) ((EvenWin*100)/playedGames);
		JOptionPane.showMessageDialog(null, "You've won the game " + percentageWin + "% of the time now!");
		JOptionPane.showMessageDialog(null, "You've guessed even " + percentageEven + "% of the time lad!");
		JOptionPane.showMessageDialog(null, "You've cursed my dice!\n They've come up odd " + percentageOdd + "% of the time!");
		JOptionPane.showMessageDialog(null, "You've won on odd numbers " + percentageOddWin + "% of the time!");
		JOptionPane.showMessageDialog(null, "You've won on even numbers " + percentageEvenWin + "% of the time!");*/
		
		match[Y] = Y + 1;

		
		
		System.out.printf("\nRound: %d -- Guess: %d -- Computer: %d -- Won: %d", match[Y], guess[Y], Computerrole[Y], winner[Y]);
		Y++;
		while (Y == 10){
			int again = Integer.parseInt(JOptionPane.showInputDialog(null, "Play again for another shilling lad?\n1. Yes\n2. No"));
		if (again == 1)
		{
			Y = 0;
		}
		
		else if (again == 2)
		{
			Y = 11;
			
		}
		}
	}
}
	}