package odev3;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.firstName+ " taraf�ndan "+  instructor.giveCourse + " kursu eklendi");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.firstName +" taraf�ndan " +instructor.giveCourse +" kurs silindi");
	}
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.firstName + " taraf�ndan " + instructor.giveCourse + " kurs g�ncellendi");
	}
	
}
