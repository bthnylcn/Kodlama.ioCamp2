
public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+" sisteme eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+" sistemden silindi.");
	}
}
