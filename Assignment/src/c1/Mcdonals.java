package c1;

class McException extends Throwable{
	String msg;
	McException(String msg){
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}

public class Mcdonals {
	static void food() throws McException{
		String foodname = "Sandwich";
		if(foodname == "Burger") {
			System.out.println("Burgers are fetched");
		}
		else {
			throw new McException("No matching item found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			food();
		}
		catch(McException e) {
			System.out.println(e.getMessage());
		}

	}

}
