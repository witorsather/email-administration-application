package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// create object from template Email
		Email em1 = new Email("John", "Smith");

		em1.setAlternateEmail("js@gmail.com");
		System.out.println(em1.getAlternateEmail());

		System.out.print(em1.showInfo());
	}

}
