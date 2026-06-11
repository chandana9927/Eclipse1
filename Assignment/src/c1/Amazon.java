package c1;

public class Amazon {
	static void currHeight() throws AmazonException{ 
		int height = 999;
		if(height<=240) {
			System.out.println("Perfect Height");
		}
		else {
			throw new AmazonException("Please enter a valid response");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			currHeight();
		}
		catch(AmazonException e) {
			System.out.println(e.getMessage());
		}
	}

}

class AmazonException extends Exception{
	String msg;
	AmazonException(String msg){
		this.msg = msg;
	}
	public String getMessage(){
		return msg;
	}
}
