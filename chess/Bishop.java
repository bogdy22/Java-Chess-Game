package chess;

public class Bishop extends Piece{

	public Bishop(PieceColour p)
	{
		if(p.name().equals("WHITE"))
			{
				this.setSymbol("♗");
				this.colour=PieceColour.WHITE;
			}
		else
			{
				this.setSymbol("♝");
				this.colour=PieceColour.BLACK;
			}
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		if(i1+j1==i0+j0)
		{	
			if(i1<i0&&j1>j0)  // move up right
			{
				for(int k=1; k<=(j1-j0)-1; k++)
					if(Board.hasPiece(i0-k,j0+k))
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
			if(i1>i0&&j1>j0)  // move down right
			{
				for(int k=1; k<=(j1-j0)-1; k++)
					if(Board.hasPiece(i0+k,j0+k))
						return false;

				int column_advance=j1-j0;
				if(column_advance>0)
				{
					if(i0+j0==i1+j1-2*column_advance)
					{
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
			}

			if(i1<i0&&j1<j0)  // move up left
			{
				for(int k=1; k<=(j0-j1)-1; k++)
					if(Board.hasPiece(i0-k,j0-k))
						return false;

				int column_advance=j0-j1;
				if(column_advance>0)
				{
					if(i0+j0==i1+j1+2*column_advance)
						{
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

			}
		

		}

		return false;
	}

}
