
public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course();
		course1.id=1;
		course1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)";
		course1.instructor="Engin Demiro�";
		course1.progressRate=75;
		
		Course course2= new Course();
		course2.id=2;
		course2.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java + React)";
		course2.instructor="Engin Demiro�";
		course2.progressRate=10;

		Category category1 = new Category();
		category1.id=1;
		category1.name="Programlama";
		
		Course[] courses = {course1,course2};
		Category[] categories = {category1};
		
		CourseManager courseManager = new CourseManager();
		courseManager.getByCourse(course1);
		courseManager.getByCategory(category1);
		courseManager.getAllCategories(categories);
		courseManager.getAllCourses(courses);
	}

}
