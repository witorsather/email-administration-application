package emailapp;

import java.util.Scanner;

//class our template
public class Email {
//	encapsulecion = private for access not people
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	int mailboxCapacity;
	private String alternateEmail;

	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}

	// ask for the department
	private String setDepartment() {
		System.out.print(
				"DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for nome\nEnter department code: ");
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

	// set the mailbox capacity

	// set the alternate email

	// change the password

}
