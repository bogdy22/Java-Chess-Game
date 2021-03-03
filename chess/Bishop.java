package chess;

public class Bishop extends Piece{

	public Bishop(PieceColour p)
	{
		setSymbol("♗");
		//♝
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		if(i1+j1==i0+j0)
		{	
			if((i1<i0&&j1>j0)&&(j0<8&&i0>1))  // move up right
			{
				for(int k=1; k<=(j1-j0)-1; k++)
					if(Board.hasPiece(i0-k,j0+k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
							return false;
						else
							return true;
					}

			}

			if((i1<i0&&j1<j0)&&(j0>1&&i0>1))  // move up left
			{
				for(int k=1; k<=(j0-j1)-1; k++)
					if(Board.hasPiece(i0-k,j0-k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
							return false;
						else
							return true;
					}

			}

			if((i1>i0&&j1>j0)&&(j0<8&&i0<8))  // move down right
			{
				for(int k=1; k<=(j1-j0)-1; k++)
					if(Board.hasPiece(i0+k,j0+k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
							return false;
						else
							return true;
					}

			}

			if((i1>i0&&j1<j0)&&(j0>1&&i0<8))  // move down left
			{
				for(int k=1; k<=(j0-j1)-1; k++)
					if(Board.hasPiece(i0+k,j0-k))
						return false;

				if(Board.hasPiece(i1,j1))
					{
						if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
							return false;
						else
							return true;
					}

			}

		}

		return false;
	}

}
