import java.time.LocalDate;

public class vendor extends Employee {
	private int noEmp;
	private double amt;
	
	
	public vendor() {
		super();
	}


	public vendor(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,int noEmp, double amt) {
		super(pid,pname,mobile,email,dept,desg,doj);
		this.noEmp = noEmp;
		this.amt = amt;
	}


	public int getNoEmp() {
		return noEmp;
	}


	public void setNoEmp(int noEmp) {
		this.noEmp = noEmp;
	}


	public double getAmt() {
		return amt;
	}


	public void setAmt(double amt) {
		this.amt = amt;
	}


	@Override
	public String toString() {
		return super.toString()+"vendor [noEmp=" + noEmp + ", amt=" + amt + "]";
	}
	
	public double calculateSal(){
		return  noEmp*amt;
	}
}
