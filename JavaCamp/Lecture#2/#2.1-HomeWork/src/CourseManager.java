
public class CourseManager {

	public void getByCourse(Course course) {
		System.out.println(course.name + " seçildi.");
	}
	
	public void getByCategory(Category category) {
		System.out.println(category.name + " seçildi.");
	}
	
	public void getAllCategories(Category[] categories) {
		for(Category category:categories) {
			System.out.println(category.name);
		}
	}
	
	public void getAllCourses(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.name);
		}
	}
}
