package OOPs;

public class Encapsulation_Demo {
	public static void main(String[] args) {
		Employee empObj = new Employee();
		empObj.setEmpID(101);
		empObj.setEmpName("Sarjerao");
		empObj.setEmpSal(90000);
		// empObj.setEmpEmailID("sarjerao");
		empObj.setEmpEmailID("sarjerao@sarjerao.com");

		System.out.println("Emplloyee ID ==> " + empObj.getEmpID());
		System.out.println("Emplloyee Name ==> " + empObj.getEmpName());
		System.out.println("Emplloyee Salary ==> " + empObj.getEmpSal());
		System.out.println("Emplloyee Email ID ==> " + empObj.getEmpEmailID());
	}
}

class Employee {
	private int empID;
	private String empName;
	private float empSal;
	private String empEmailID;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int eID) {
		this.empID = eID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String eName) {
		this.empName = eName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float eSal) {
		this.empSal = eSal;
	}

	public String getEmpEmailID() {
		return empEmailID;
	}

	public void setEmpEmailID(String eEmailID) {
		if (eEmailID.indexOf("@") != -1) {
			this.empEmailID = eEmailID;
		} else {
			throw new IllegalArgumentException("Email Address is Invalid...");
		}
	}
}
