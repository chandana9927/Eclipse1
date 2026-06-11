package c1;
//Instead of exception class we can write throwable class then why not?
class ChessException extends Throwable{
	String msg;
	public ChessException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}

public class Chess {
	static void game() throws ChessException{
		int players = 14;
		if(players == 2) {
			System.out.println("Game begins...");
		}
		else {
			throw new ChessException("Invalid number of players");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			game();
		}
		//doubt we can also print variable na? then why are we not doing that.
		catch(ChessException e) {
			System.out.println(e.getMessage());
		}

	}

}
