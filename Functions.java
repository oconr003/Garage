import java.util.Random;

public class Functions {
  public boolean gameOver;
  public Coordinate player;
  public Coordinate treasure;

  public Functions() {
    this.gameOver = false;
  }

  public void startGame() {
    Random random = new Random();
    this.player = new Coordinate(random.nextInt(10), random.nextInt(10));
    this.treasure = new Coordinate(random.nextInt(10), random.nextInt(10));
  }

  public void movePlayer(String userInput) {
    switch (userInput) {
      case "i":
        System.out.println("You are moving UP");
        if (this.player.x==0) {
          this.player.x=9;
        } else {
          this.player.x = this.player.x - 1;
        }
        break;
      case "j":
        System.out.println("You are Moving LEFT");
        if (this.player.y==0) {
          this.player.y=9;
        } else {
          this.player.y = this.player.y - 1;
        }
        break;
      case "l":
        System.out.println("You are Moving RIGHT");
        if (this.player.y==9) {
          this.player.y=0;
        } else {
          this.player.y = this.player.y + 1;
        }
        break;
      case "m":
        System.out.println("You are Moving DOWN");
        if (this.player.x==9) {
          this.player.x=0;
        } else {
          this.player.x = this.player.x + 1;
        }
        break;
      default:
        System.out.println("Incorrect command!");
        break;
    }

  }

  public void compass() {
		double treasureDifference;
		double xSquared;
		double ySquared;
		
		xSquared = Math.pow((this.player.x - this.treasure.x), 2);
		ySquared = Math.pow((this.player.y - this.treasure.y), 2);
		treasureDifference = Math.sqrt(xSquared + ySquared);

		System.out.println("You are: "+ treasureDifference + " away from the treasure!");
	}

  public void showBoard() {
  	System.out.println();
    char[][] board = new char[10][10];
    board[this.player.x][this.player.y] = 'P';

    for (int i=0; i<10; i++) {
      for (int j=0; j<10; j++) {
    	  if (board[i][j]!='P' ) {
        System.out.print(board[i][j] + "*\t");
    	  } else {
    		  System.out.print(board[i][j] + "\t");
    	  }
      } System.out.println();
    }
  }
  
  public boolean isGameOver() {
	    if (this.player.x == this.treasure.x && this.player.y == this.treasure.y) {
	      System.out.println("Congrats! You found the treasure and made it out The Barrens alive!");
	      return true;
	    }
	    return false;
	  }
}
 
  

