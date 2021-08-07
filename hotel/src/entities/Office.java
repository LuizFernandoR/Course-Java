package entities;

public class Office {
	
	private String name;
	private String email;
	private String checkin;
	private String checkout;
	
	public Office(String name, String email, String checkin, String checkout) {
		this.name = name;
		this.email = email;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

		
}
