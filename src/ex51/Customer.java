package ex51;

public class Customer {
	private Profile profile;
	private int id;

	public Customer(Profile profile, int id) {
		this.profile = profile;
		this.id = id;
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
