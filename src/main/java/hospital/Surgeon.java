package hospital;

public class Surgeon extends Doctor {

	public boolean isOperating;

	public Surgeon(String empNumber, String empName, boolean isOperating) {
		super(empNumber, empName);
		this.isOperating = isOperating;
	}

	@Override
	public int getSalary() {
		return 120000;
	}

}
