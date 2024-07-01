package bankProject;

import java.util.Scanner;

public class Main {
	private long acc;
	private String pass;
	private long amt;
	private String uname;

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setAcc(long acc) {
		this.acc = acc;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAmt(long amt) {
		this.amt = amt;
	}

	public void BalanceEnquiry() {
		System.out.println("Your account balance is : " + amt);
	}

	public void BalanceDeposit(long amount) {
		amt += amount;
		System.out.println(amount + " added in your bank account ");
	}

	public void BalanceWithdrawal(long amount) {
		try {
			if (amount > amt) {
				throw new BankBalanceException("Enter valid amount ");
			} else {
				amt -= amount;
				System.out.println(amount + " withdrawn successfully !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void UsernameAndPasswordValidation(String uname, String pass, String uname2, String pass2)
			throws UserNameException, WrongPasswordException {
		if (!uname.equals(uname2)) {
			throw new UserNameException("Wrong username");
		}
		if (!pass.equals(pass2)) {
			throw new WrongPasswordException("Wrong Password ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uname = "abc";
		String pass = "123";
		long amt = 1000;
		System.out.println("Enter Username : ");
		String uname2 = sc.nextLine();
		System.out.println("Enter Password :");
		String pass2 = sc.nextLine();

		Main obj = new Main();
		obj.setAmt(amt);
		int choice = 0;

		try {
			UsernameAndPasswordValidation(uname, pass, uname2, pass2);

			while (choice != 7) {
				System.out.println("1) Balance Enquiry ");
				System.out.println("2) Cash Deposit ");
				System.out.println("3) Cash withdraw");
				System.out.println("4) Username change");
				System.out.println("5) Password change");
				System.out.println("6) Exit ");
				System.out.println("Enter your Choice code :");
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					obj.BalanceEnquiry();
					break;
				case 2:
					System.out.println("Enter Amount :");
					long amount = sc.nextLong();
					obj.BalanceDeposit(amount);
					break;
				case 3:
					System.out.println("How much money you want to withdraw :");
					long with = sc.nextLong();
					obj.BalanceWithdrawal(with);
					break;
				case 4:
					System.out.println("Enter new username :");
					uname = sc.nextLine();
					obj.setUname(uname);
					System.out.println("Username Changed ");
					break;
				case 5:
					System.out.println("Enter new Password :");
					pass = sc.nextLine();
					obj.setPass(pass);
					System.out.println("Password Changed ");
					break;
				case 6:
					choice = 7;
					break;
				default:
					System.out.println("Enter Number Between 1 to 6");
					break;
				}
			}
		} catch (WrongPasswordException e) {
			System.out.println(e);
		} catch (UserNameException e) {
			System.out.println(e);
		} finally {
			System.out.println("Thank You for using this Application");
			sc.close();

		}
	}
}
