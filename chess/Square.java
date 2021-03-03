package chess;

//This class requires your input
public class Square {
	private boolean hasPiece;
	private Piece p;
	
	public Piece getPiece()
	{
		return p;
	}

	public void setPiece(Piece pIn)
	{
		p=pIn;
	}

	public void removePiece()
	{
		
	}

	public boolean hasPiece(){
		return hasPiece;
	}	
}
