package cn.mybook.domain;

public class Account {

	private Integer accountId;
	private int balance;
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
	
		return "Account[accountId="+accountId+", balance="+balance+"]";
	}
	
	
}
