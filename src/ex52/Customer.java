package ex52;

public class Customer {
	private Profile profile;
	private int id;

	public Customer(Profile profile, int id) throws InvalidCustomerException {
		if (profile == null) {
			throw new InvalidCustomerException("Profile cannot be null.");
		}
		if (id < 0) {
			throw new InvalidCustomerException("id cannot be negative.");
		}
		this.profile = profile;
		this.id = id;
	}

	public String getShippingCity() {
		return profile.getShippingInfo().getCity();
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
