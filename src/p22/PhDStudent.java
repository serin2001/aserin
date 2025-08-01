package p22;

public class PhDStudent extends Student {
	private String dissTopic;
	
	public PhDStudent(String firstName, String lastName, int age, int matNumber, int semester, String dissTopic) {
		super(firstName, lastName, age, matNumber, semester);
		this.dissTopic = dissTopic;
	}
	
	public String getTopic() {
		return dissTopic;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + ", Dissertation: " + getTopic();
	}
}
