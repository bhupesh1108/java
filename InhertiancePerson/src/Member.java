
public class Member extends Person {

	private String MemShip;
	private double amt;
	public Member() {
		super();
	}
	public Member(int pid, String pname, String mobile, String email,String memShip, double amt) {
		super(pid,pname,mobile,email);
		MemShip = memShip;
		this.amt = amt;
	}
	public String getMemShip() {
		return MemShip;
	}
	public void setMemShip(String memShip) {
		MemShip = memShip;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Member [MemShip=" + MemShip + ", amt=" + amt + "]";
	}
	
	
}
