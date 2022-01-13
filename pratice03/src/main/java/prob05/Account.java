package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo=accountNo;
	}
	
	public void save(Integer money) {
		balance+=money;
		System.out.println(this.accountNo+"계좌에 "+money+"원이 입금되었습니다.");
		System.out.println("현재 잔액 : "+this.balance);
	}
	
	public void deposit(Integer money) {
		if(money>balance) {
			System.out.println("잔고보다 출금 금액이 더 큽니다.");
		}else {
			this.balance-=money;
			System.out.println(this.accountNo+"계좌에 "+money+"원이 출금되었습니다.");
			System.out.println("현재 잔액 : "+this.balance);
		}	
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
}
