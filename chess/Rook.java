package chess;

public class Rook extends Piece{
	public Rook(PieceColour p)
	{
		if(p.name().equals("WHITE"))
			{
				this.setSymbol("♖");
				this.colour=PieceColour.WHITE;
			}
		else
			{
				this.setSymbol("♜");
				this.colour=PieceColour.BLACK;
			}	
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
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
							if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j0).getColour().name())
								return false;
							else
								return true;
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
							if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j0).getColour().name())
								return false;
							else
								return true;
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
							if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j0).getColour().name())
								return false;
							else
								return true;
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
						if(Board.getPiece(i1,j0).getColour().name()==Board.getPiece(i0,j0).getColour().name())
							return false;
						else
							return true;
					}
					else return true;

				}
			}
			
		return false;
	}

}
