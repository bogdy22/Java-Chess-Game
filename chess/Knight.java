package chess;

public class Knight extends Piece{

	public Knight(PieceColour p)
	{
		if(p.name().equals("WHITE"))
			{
				this.setSymbol("♘");
				this.colour=PieceColour.WHITE;
			}
		else
			{
				this.setSymbol("♞");
				this.colour=PieceColour.BLACK;
			}
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{
		if(i1==i0-1&&j1==j0+2) // move up
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

		if(i1==i0-1&&j1==j0-2) // move up
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

		if(i1==i0-2&&j1==j0+1) // move up
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

		if(i1==i0-2&&j1==j0-1) // move up
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

		if(i1==i0+1&&j1==j0+2) // move down
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

		if(i1==i0+1&&j1==j0-2) // move up
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

		if(i1==i0+2&&j1==j0+1) // move up
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

		if(i1==i0+2&&j1==j0-1) // move up
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

		return false;
	}

}
