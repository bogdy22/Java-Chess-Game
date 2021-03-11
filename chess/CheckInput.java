package chess;

public class CheckInput 
{
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input)
	{
		if(input.length()!=2)
			return false;
		if((input.charAt(0)=='1'||input.charAt(0)=='2'||input.charAt(0)=='3'||input.charAt(0)=='4'||input.charAt(0)=='5'||input.charAt(0)=='6'||input.charAt(0)=='7'||input.charAt(0)=='8')&&(input.charAt(1)=='a'||input.charAt(1)=='b'||input.charAt(1)=='c'||input.charAt(1)=='d'||input.charAt(1)=='e'||input.charAt(1)=='f'||input.charAt(1)=='g'||input.charAt(1)=='h'))
			return true;
		return false;
	}
}
