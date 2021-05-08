
public class Main {

	public static void main(String[] args) {
		Instructor engin =new Instructor("Engin","Demiroğ","engin@demirog.com","123","Java+React");
		
		Student james=new Student("James","Hetfield","james@metallica.com","1m1",1);
		
		UserManager userManager=new UserManager();
		userManager.login(james);
		userManager.login(engin);
		
		StudentManager studentManager= new StudentManager();
		studentManager.get(1);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.add(engin);
	}

}
