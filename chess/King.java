package chess;

public class King extends Piece{

	public King(PieceColour p)
	{
		setSymbol("♔");
		//"♚"	
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		if(j1==j0&&i1!=i0)  // move the same column
		{
			if(i1==i0-1&&i0>1&&i0>1)  // move up
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}

			else if(i1==i0+1&&i0<8&&i0<8) // move down
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}
		}

		if(i1==i0&&j1!=j0) // move the same line
		{
			if(j1==j0+1&&j0<8&&j0<8) // move right
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}

			else if(j1==j0-1&&j0!=1&&j0>1) // move left
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}
		}

		if(i1<i0&&j1!=j0) // move diagonally
		{
			if(i1==i0-1&&j1==j0-1&&j0>1) // move up left
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}

			else if(i1==i0-1&&j1==j0+1&&j0<8) // move up right
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}
		}

		if(i1>i0&&j1!=j0) // move diagonally
		{
			if(i1==i0+1&&j1==j0-1&&j0>1)  // move down left
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
						return false;
					else
						return true;
				}
				else return true;
			}

			else if(i1==i0+1&&j1==j0+1&&j0<8)
			{
				if(Board.hasPiece(i1,j1))
				{
					if(Board.getPiece(i0,j0).getColour()==Board.getPiece(i1,j1).getColour())
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
