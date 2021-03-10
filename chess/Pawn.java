package chess;

public class Pawn extends Piece
{
	
	public Pawn(PieceColour p)
	{
		if(p.name().equals("WHITE"))
		{
			this.setSymbol("♙");
			this.colour=PieceColour.WHITE;
		}
			
		else
		{
			this.setSymbol("♟︎");
			this.colour=PieceColour.BLACK;
		}
		
	}	

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		if(j0==j1) // move normal
		{
			if(Board.getPiece(i0,j0).getColour().name().equals("WHITE"))
			{
				if(i1==i0-1) // move up
				{
					if(Board.hasPiece(i1,j1))
						return false;
					else 
						return true;
				}

				if(i0==6)
				{
					if(i1==5||i1==4)
					{
						if(Board.hasPiece(i1,j1)||Board.hasPiece(i0-1,j0))
							return false;
						else 
							return true;
					}
				}
			}

			else
			{
				if(i1==i0+1) // move down
				{
					if(Board.hasPiece(i1,j1))
						return false;
					else 
						return true;	
				}

				if(i0==1)
				{
					if(i1==2||i1==3)
					{
						if(Board.hasPiece(i1,j1)||Board.hasPiece(i0+1,j0))
							return false;
						else 
							return true;
					}
				}
			}
		}

		if(Board.getPiece(i0,j0).getColour().name().equals("WHITE"))
		{
			if((j1==j0+1||j1==j0-1)&&i1==i0-1) // attack piece up
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j1).getColour().name())
						return false;
					else
						return true;
				}
				else 
					return false;
			} 
		}

		else
		{
			if((j1==j0+1||j1==j0-1)&&i1==i0+1) // attack piece down
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour().name()==Board.getPiece(i1,j1).getColour().name())
						return false;
					else
						return true;
				}
				else 
					return false;
		} 

		}

		return false;
	}
	
}
