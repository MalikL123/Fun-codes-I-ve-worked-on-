import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);
    int q = 1;
    int r = 0;
    int c = 0;
    int player = 0;
    boolean validMove = false;
      String[][] board = new String[3][3];
      int m=0;


      TTTB (board);

      TTTBD (board);

    while (true)
      {
	q++;
	if (q % 2 == 0)
	  {
	    player = 2;
	  }
	else
	  {
	    player = 1;
	  }


	System.out.print ("Enter row number: ");
	r = input.nextInt ();
	System.out.print ("Enter column number: ");
	c = input.nextInt ();
	
	if (r < 0 || r > 2 || c < 0 || c > 2) {
        System.out.println("Invalid move. Please enter valid row and column (0 to 2)");
        continue; //lerned about the (continue) function online.
    }
m++;

	if (player == 2 && board[r][c].equals ("-"))
	  {
	    board[r][c] = "x";

	  }
	else if (player == 1 && board[r][c].equals ("-"))
	  {
	    board[r][c] = "o";

	  }
	else
	  {
	    q++;
	    System.out.print ("\n Invalid move \n");

	  }

	WOL (board, m);

	TTTBD (board);
      }


  }
  public static void TTTB (String[][]board)
  {

    for (int r = 0; r < 3; r++)
      {
	for (int c = 0; c < 3; c++)
	  {

	    board[r][c] = "-";
	  }
      }
  }

  public static void TTTBD (String[][]board)
  {

    for (int r = 0; r < 3; r++)
      {
	for (int c = 0; c < 3; c++)
	  {
	    System.out.print (board[r][c]);
	  }
	System.out.println ();
      }


  }
  public static void WOL (String[][]board, int m)
  {
      
    if (m == 9){
        	TTTBD (board);
        System.out.print("Tie game");
        System.exit(0);
    }
    
    if (board[0][0].equals ("x") && board[0][1].equals ("x")
	&& board[0][2].equals ("x"))
      {
	TTTBD (board);
	System.out.print ("\n X Wins \n ");
	System.exit (0);
      }

    if (board[0][0].equals ("o") && board[0][1].equals ("o")
	&& board[0][2].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[1][0].equals ("x") && board[1][1].equals ("x")
	&& board[1][2].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[1][0].equals ("o") && board[1][1].equals ("o")
	&& board[1][2].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[2][0].equals ("x") && board[2][1].equals ("x")
	&& board[2][2].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[2][0].equals ("o") && board[2][1].equals ("o")
	&& board[2][2].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[0][0].equals ("x") && board[1][1].equals ("x")
	&& board[2][2].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[0][0].equals ("o") && board[1][1].equals ("o")
	&& board[2][2].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[0][2].equals ("x") && board[1][1].equals ("x")
	&& board[2][0].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[0][2].equals ("o") && board[1][1].equals ("o")
	&& board[2][0].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[0][0].equals ("x") && board[1][0].equals ("x")
	&& board[2][0].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[0][0].equals ("o") && board[1][0].equals ("o")
	&& board[2][0].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[0][1].equals ("x") && board[1][1].equals ("x")
	&& board[2][1].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[0][1].equals ("o") && board[1][1].equals ("o")
	&& board[2][1].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }

    if (board[0][2].equals ("x") && board[1][2].equals ("x")
	&& board[2][2].equals ("x"))
      {
	TTTBD (board);
	System.out.print (" X Wins");
	System.exit (0);
      }

    if (board[0][2].equals ("o") && board[1][2].equals ("o")
	&& board[2][2].equals ("o"))
      {
	TTTBD (board);
	System.out.print (" O Wins");
	System.exit (0);
      }
  }
}
