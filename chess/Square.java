package chess;

public class Square
{
	private boolean hasPiece;
	private Piece p;
	
	public Piece getPiece()
	{
		return this.p;
	}

	public void setPiece(Piece pIn)
	{
		this.p = pIn;
		this.hasPiece = true;
	}

	public void removePiece()
	{
		this.p = null;
		hasPiece = false;
	}

	public boolean hasPiece()
	{
		return hasPiece;
	}	
}
