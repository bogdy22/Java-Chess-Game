package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play()
	{
		String str1, str2, next_turn="white";
		int i0, j0, i1, j1;
		boolean try_again=false;
		CheckInput check = new CheckInput();
		Console con = System.console();	
		
		while (!gameEnd)
		{
			System.out.println();
			if(next_turn=="white")	
				System.out.println("------ White moves ------");
			else
				System.out.println("------ Black moves ------");
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
					if(next_turn=="white")
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
								if(p.isLegitMove(i0,j0,i1,j1)==true)
								{
									gameEnd = Board.movePiece(i0,j0,i1,j1,p);
									//System.out.println(gameEnd);
									if(gameEnd==true)
									{
										System.out.println("White won!");
									}

									Board.printBoard();	
									try_again=false;
								}
								else 
								{	Board.printBoard();
									System.out.println();
									System.out.println("Invalid move! Try again.");
									try_again=true;
								}

							}
							else 
							{
								Board.printBoard();
								System.out.println();
								System.out.println("The destination you entered is not valid. Please try again!");
								try_again=true;
								
							}

						}
						else 
						{ 	Board.printBoard();
							System.out.println();
							System.out.println("Not a white piece. Try again!");
							try_again=true;
							
						}
					}

					else if(next_turn=="black")
					{
						if(Board.getPiece(i0,j0).getColour().name().equals("BLACK"))
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
								if(p.isLegitMove(i0,j0,i1,j1)==true)
								{
									gameEnd = Board.movePiece(i0,j0,i1,j1,p);
									//System.out.println(gameEnd);
									if(gameEnd==true)
									{
										System.out.println("Black won!");
									}

								Board.printBoard();
								try_again=false;	
							}
							else 
							{	Board.printBoard();
								System.out.println();
								System.out.println("Invalid move! Try again.");
								try_again=true;
								
							}

						}
						else 
						{	Board.printBoard();
							System.out.println();
							System.out.println("The destination you entered is not valid. Please try again!");
							try_again=true;
							
						}

					}
					else 
					{ 	Board.printBoard();
						System.out.println();
						System.out.println("Not a black piece. Try again!");
						try_again=true;
						
					}
					}

				}
				else
				{
					Board.printBoard();
					System.out.println();
					System.out.println("There is no piece on the selected square. Try again!");
					try_again=true;
					
				}

			}
			else 
			{
				Board.printBoard();
				System.out.println();
				System.out.println("The origin you entered is not valid. Please try again!");
				try_again=true;
			
			}

			if(try_again==false)
				{	
					if(next_turn=="white")
						next_turn="black";
					else
						next_turn="white";
				}
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

