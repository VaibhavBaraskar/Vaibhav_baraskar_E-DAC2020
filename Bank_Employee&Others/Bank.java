//vaibhav Baraskar 2/10/2020
//operational class
import java.util.Scanner;
class Bank{

	 public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println(" -------Welcome to Bank------- ");
	//System.out.println("How many account is to be created");
	//int noOfAccounts=sc.nextInt();
	char doYouWontContinue,doYouWantTranction;
	do{
		Banking customer1= new Banking();
		System.out.println("Please Enter Your Account Number :=");
		long acc_no=sc.nextLong();
		customer1.setAccountNo(acc_no);		
		
		System.out.println("Please Enter Your Account Holder Name :=");
		sc.nextLine();
		String acc_Holder_Name=sc.nextLine();
		customer1.setAccountHolderName(acc_Holder_Name);
		
		System.out.println("Please Enter Select You Account Type  :");
		String acc_type="";
		System.out.println("Select 1.Saving  2.current Account");
		int atype=sc.nextInt();
		if(atype==1){
			 acc_type="Saving Account";
			}else if(atype==2){
				acc_type="Current Account";
				}else{
					System.out.println("As You didnt mention so Your Account consider as Current type ");	
				acc_type="Current Account";
			}

		//switch(atype){
			//case 1: this.acc_type="Saving Account";
		//		break;
		//	case 2:this.acc_type="Current Account";
		//		break;
		//	default: System.out.println("As You didnt mention so Your Account consider as Current type ");	
		//		this.acc_type="Current Account";					
		//	}	

		customer1.setTypeOfAccount(acc_type);

		int balance=customer1.getBalance();
		System.out.println(acc_type+"  Account Balance is := "+balance);

	do{
		System.out.println("Which Operation Would You Like To Perform choose Following Option");
		System.out.println("1. Deposit   2. Withdrow");
		int opt=sc.nextInt();		
	if(opt==1){
		System.out.println("Would You Like To Add Some Amount :");
		int amt=sc.nextInt();
		customer1.deposit(amt);
		}else if(opt==2){
			System.out.println("Would You Like To Withdrow Some Amount :");
			int withdrowamt=sc.nextInt();
			customer1.withdrow(withdrowamt);
		}
		System.out.println("Do you want to continue  for Account Operations (Y/N):");
		doYouWantTranction=sc.next().charAt(0);
	}while((doYouWantTranction=='y')||(doYouWantTranction=='Y'));

		//System.out.println("Would You Like To Add Some Amount :");
		//int amt=sc.nextInt();
		//customer1.deposit(amt);
		
		//System.out.println("Would You Like To Withdrow Some Amount :");
		//int withdrowamt=sc.nextInt();
		//customer1.withdrow(withdrowamt);

System.out.println("----------OUTPUT----------");

System.out.println("Account Info :  ");
	System.out.println("Account Number is := "+customer1.getAccountNo());
	System.out.println("Account Holder Name is :="+customer1.getAccountHolderName());
	System.out.println("Account Type is :="+customer1.getTypeOfAccount());
	int balance2=customer1.getBalance();
	System.out.println(acc_type+"  Account Balance is := "+balance2);
 		
System.out.println("\n\n");
	
	System.out.println("Do you want to continue  for new Account User (Y/N):");
	 doYouWontContinue=sc.next().charAt(0);
	}while((doYouWontContinue=='y')||(doYouWontContinue=='Y'));



	//System.out.println("How many account is to be created");
	//Banking customer1= new Banking();
	//customer1.setAccountNo(10100013256L);
	//customer1.setAccountHolderName("Vaibhav Baraskar");
	//customer1.setTypeOfAccount("Saving");
	//customer1.deposit(1000);
	//int balance=customer1.getBalance();
	//System.out.println("Current Balance is : "+balance);
	//customer1.withdrow(1000);
	
 	//System.out.println("Account Info :  ");
	//System.out.println("Account Number is := "+customer1.getAccountNo());
	//System.out.println("Account Holder Name is :="+customer1.getAccountHolderName());
	//System.out.println("Account Type is :="+customer1.getTypeOfAccount());
	//customer1.withdrow(1000);
	}
	
}


//output
//E:\Module1\type>java Bank
// -------Welcome to Bank-------
//Please Enter Your Account Number :=
//100100013256
//Please Enter Your Account Holder Name :=
//Vaibhav Baraskar
//Please Enter Select You Account Type  :
//Select 1.Saving  2.current Account
//3
//As You didnt mention so Your Account consider as Current type
//Current Account  Account Balance is := 500
//Would You Like To Add Some Amount :
//2000
//Your amount is Successfully Deposited of Rs. 2000
//Your Current Balance is: 2500
//Would You Like To Withdrow Some Amount :
//1500
//Your Current Balance is: 1000
//----------OUTPUT----------
//Account Info :
//Account Number is := 100100013256
//Account Holder Name is :=Vaibhav Baraskar
//Account Type is :=Current Account
//Current Account  Account Balance is := 1000





//Do you want to continue (Y/N):
