import java.util.Scanner;

public class GameRunner {

  public static void main (String[] args)
  {
    Functions currentGame = new Functions();
    currentGame.startGame();
    Scanner scanner = new Scanner(System.in);

    do {

      System.out.print("Enter 'i' for up, 'm' for down, 'j' for left, 'l' for right: ");
	  currentGame.showBoard();
    	  currentGame.compass();
      String userInput = scanner.next();
      currentGame.movePlayer(userInput);
      
      
    } while (!currentGame.isGameOver());
  }

}