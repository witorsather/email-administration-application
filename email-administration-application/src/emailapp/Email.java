package emailapp;

import java.util.Scanner;

//class our template
public class Email {
//	encapsulecion = private for access not people
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "aeycompany.com";

	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// call a method asking for the department - return the department
		this.department = setDepartment();

		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	// ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName
				+ ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for nome\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoise = in.nextInt();
		if (depChoise == 1) {
			return "sales";
		} else if (depChoise == 2) {
			return "dev";
		} else if (depChoise == 3) {
			return "acct";
		} else {
			return "";
		}
	}

	// generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWYZ123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "mb";
	}

}
