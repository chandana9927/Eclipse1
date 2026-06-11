package c1;

class FootballException extends Exception{
	String msg;
	public FootballException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}

public class Football {
	static void game() throws FootballException{
		int players = 54;
		if(players == 11) {
			System.out.println("Good team");
		}
		else {
			throw new FootballException("Invalid players");
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			game();
		}
		
		catch(FootballException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
