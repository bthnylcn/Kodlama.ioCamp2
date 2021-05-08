
public class Student extends User {
	
	private int studentId;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String email, String password,int studentId) {
		super(firstName,lastName,email,password);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}
