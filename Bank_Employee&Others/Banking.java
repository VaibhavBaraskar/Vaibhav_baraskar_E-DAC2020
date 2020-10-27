//vaibhav Baraskar 2/10/2020
//pojo class

//package type;

class Banking{

 	static private int amount=500;
	private	long accountNo;
 	private	String accountHolderName;
	private	String TypeOfAccount;

	public void setAccountNo(long accountNo) 	//setter
	{
	this.accountNo=accountNo;
	}
	public void setAccountHolderName(String accountHolderName) //setter
	{
	this.accountHolderName=accountHolderName;
	}
	public void setTypeOfAccount(String TypeOfAccount) //setter
	{
	this.TypeOfAccount=TypeOfAccount;
	}

	public long getAccountNo(){  //gatter
		return this.accountNo;
	}
	public String getAccountHolderName(){ //gatter
		return this.accountHolderName;
	}
	public String getTypeOfAccount(){ //gatter
		return this.TypeOfAccount;
	}

	public int getBalance (){ //gatter
		return amount;
	}
	public void withdrow(int amountTobeWithdrow){  //operation
	if((this.amount-amountTobeWithdrow)<500){
		System.out.println("Your balance is below the 500 Please insert before withdrow");
	}else{
		this.amount=this.amount-amountTobeWithdrow;
		int p= getBalance();
		System.out.println("Your Current Balance is: "+p);
	}
	}

	public void deposit(int amountTobeDeposite){  //operation
		this.amount=this.amount + amountTobeDeposite;
		System.out.println("Your amount is Successfully Deposited of Rs. "+amountTobeDeposite);
		int p= getBalance();
		System.out.println("Your Current Balance is: "+p);
		}

	
}