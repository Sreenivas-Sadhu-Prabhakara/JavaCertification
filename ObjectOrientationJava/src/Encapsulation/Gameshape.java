package Encapsulation;

public class Gameshape {
	
	public void displayShape() {
		System.out.println("displaying shape");
	}

}

class PlayerPiece extends Gameshape{
	public void movePiece() {
		System.out.println("moving game piece");
	}
}