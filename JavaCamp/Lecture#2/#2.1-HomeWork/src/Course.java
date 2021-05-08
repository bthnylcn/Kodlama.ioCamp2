
public class Course {

	int id;
	String name;
	String instructor;
	int progressRate;
	
	public Course() {
		System.out.println("Constructor Çalþýtý");
	}

	public Course(int id, String name, String instructor, int progressRate) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.progressRate = progressRate;
	}
	
	
}
