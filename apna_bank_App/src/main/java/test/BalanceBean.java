package test;

public class BalanceBean {
	//accountNo,userid,password,name,amount,aadhar_number,pan_number,address,mailid,phone
	private String userid,password;
	private long accountNo;
	
	public BalanceBean() {}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
		
}
