package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play()
	{
		String str1, str2;
		int i0, j0, i1, j1;
		CheckInput check = new CheckInput();
		Console con = System.console();	
		
		while (!gameEnd)
		{
			System.out.println();	
			System.out.println("------ White moves ------");
			System.out.println("> Enter origin:");
			str1 = con.readLine();
			if(str1.equals("END"))
			{
				System.out.println("Game aborted!");
				gameEnd = true;
				break;
			}
			
			if(check.checkCoordinateValidity(str1)==true)
			{
				i0 = Character.getNumericValue(str1.charAt(0))-1;	
				j0 = str1.charAt(1)-97;

				if(Board.hasPiece(i0,j0)==true)
				{
					if(Board.getPiece(i0,j0).getColour().name().equals("WHITE"))
					{
						System.out.println("> Enter destination:");
						str2 = con.readLine();
						if(str2.equals("END"))
						{
							System.out.println("Game aborted!");
							gameEnd = true;
							break;
						}

						if(check.checkCoordinateValidity(str2)==true)
						{
							i1 = Character.getNumericValue(str2.charAt(0))-1;
							j1 = str2.charAt(1)-97;

							Piece p = Board.getPiece(i0,j0);
							System.out.println(p.isLegitMove(i0,j0,i1,j1));

							if(p.isLegitMove(i0,j0,i1,j1)==true)
							{
								gameEnd = Board.movePiece(i0,j0,i1,j1,p);
								// System.out.println(gameEnd);
								if(gameEnd==true)
									{
										System.out.println("White won!");
									}

								Board.printBoard();	
							}
							else System.out.println("Invalid move! Try again.");

						}
						else System.out.println("The destination you entered is not valid. Please try again!");

					}
					else System.out.println("Not a white piece. Try again!");

				}

			}
			else System.out.println("The origin you entered is not valid. Please try again!");

		}

	}
	
	//This method should not be edited
	public static void main (String args[])
	{
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	
	}
}

