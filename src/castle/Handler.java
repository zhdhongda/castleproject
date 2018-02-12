package castle;

public class Handler {
	protected Game game;
	public Handler(Game game) {
		this.game = game;
	}
	
	public void doCmd(String word){
//		if ( word.equals("help") ) {
//			.printHelp();
//		} else if (word.equals("go") ) {
//			goRoom(words[1]);
//		} else if ( word.equals("bye") ) {
//			break;
//		}
		
	}
	
	public boolean isBye() { return false;}
}
