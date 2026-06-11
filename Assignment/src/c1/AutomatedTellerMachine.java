package c1;
class ATM_Exception extends Exception{
	String msg;
	public ATM_Exception(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	public String getMessage(){
		return msg;
	}
}
public class AutomatedTellerMachine {
	static void withdraw() throws ATM_Exception{
		int amt = 45000;
		if(amt<=25000) {
			System.out.println("Money dispansed");
		}
		else {
			throw new ATM_Exception("Amount exceeded limit");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			withdraw();
		}
		catch(ATM_Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
