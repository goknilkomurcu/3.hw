package odev3;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.firstName+ " tarafından "+  instructor.giveCourse + " kursu eklendi");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.firstName +" tarafından " +instructor.giveCourse +" kurs silindi");
	}
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.firstName + " tarafından " + instructor.giveCourse + " kurs güncellendi");
	}
	
}
