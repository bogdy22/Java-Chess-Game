package chess;

public class Queen extends Piece{

 	public Queen(PieceColour p)
 	{
 		if(p.name().equals("WHITE"))
 			{
 				this.setSymbol("♕");
 				this.colour=PieceColour.WHITE;
 			}
 		else 
 			{
 				this.setSymbol("♛");
 				this.colour=PieceColour.BLACK;
 			}
 	}

 	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		// move like rook
		if(i1==i0&&j1!=j0)  // move on the same line
			{
				if(j1>j0) // move right
				{
					for(int k=j0+1; k<j1; k++)
					{
						if(Board.hasPiece(i0,k))
							return false;
					}
					if(Board.hasPiece(i1,j1))
						{
							if(Board.getPiece(i0,j0).getColour().name()!=Board.getPiece(i1,j1).getColour().name())
								return true;
							else
								return false;
						}
					else return true;
				}

				if(j1<j0) // move left
				{
					for(int k=j0-1; k>j1; k--)
					{
						if(Board.hasPiece(i0,k))
							return false;
					}
					if(Board.hasPiece(i1,j1))
						{
							if(Board.getPiece(i0,j0).getColour().name()!=Board.getPiece(i1,j1).getColour().name())
								return true;
							else
								return false;
						}
					else return true;
				}
			}

		if(j1==j0&&i1!=i0)  // move on the same column
			{
				if(i1>i0)  // move down
				{
					for(int k=i0+1; k<i1; k++)
					{
						if(Board.hasPiece(k,j0))
							return false;
					}
					if(Board.hasPiece(i1,j0))
						{
							if(Board.getPiece(i0,j0).getColour().name()!=Board.getPiece(i1,j0).getColour().name())
								return true;
							else
								return false;
						}
					else return true;
				}

				else if(i1<i0) // move up
				{
					for(int k=i0-1; k>i1; k--)
					{
						if(Board.hasPiece(k,j0))
							return false;
					}
					if(Board.hasPiece(i1,j0))
					{
						if(Board.getPiece(i1,j0).getColour().name()!=Board.getPiece(i0,j0).getColour().name())
							return true;
						else
							return false;
					}
					else return true;

				}
			}


		// move like bishop
		if(i1+j1==i0+j0)
		{	
			if(i1<i0&&j1>j0)  // move up right
			{
				for(int k=1; k<=(j1-j0)-1; k++)
					if(Board.hasPiece(i0-k,j0+k))
						return false;
				System.out.println("pass");

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j1).getColour().name())
							return false;
						else
							return true;
					}
				else return true;

			}

			if(i1>i0&&j1<j0)  // move down left
			{
				for(int k=1; k<=(j0-j1)-1; k++)
					if(Board.hasPiece(i0+k,j0-k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j1).getColour().name())
							return false;
						else
							return true;
					}
				else return true;

			}
		}

		if(i1+j1<i0+j0||i1+j1>i0+j0)
		{
			if((i1>i0&&j1>j0)&&(j0<8&&i0<8))  // move down right
			{
				for(int k=1; k<=(j1-j0)-1; k++)
					if(Board.hasPiece(i0+k,j0+k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j1).getColour().name())
							return false;
						else
							return true;
					}
				else return true;
			}

			if(i1<i0&&j1<j0)  // move up left
			{
				for(int k=1; k<=(j0-j1)-1; k++)
					if(Board.hasPiece(i0-k,j0-k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour().name()!=Board.getPiece(i1,j1).getColour().name())
							return true;
						else
							return false;
					}
				else return true;

			}
		

		}

		return false;
	}
}
