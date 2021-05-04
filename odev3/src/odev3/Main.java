package odev3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setMail("engin....@......com");
		instructor1.setPassword("45135");
		instructor1.setDetail("Java - C# - ...");
		instructor1.setGiveCourse("Java");
		
		Student student1 =new Student();
		student1.setFirstName("Göknil");
		student1.setLastName("Kömürcü");
		student1.setMail("komurcu.goknil@...");
		student1.setPassword("75466");
		student1.setTakeCourse("C#");
		
		UserManager userManager = new UserManager();
		userManager.addToUser(instructor1);
		userManager.deleteUser(student1);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		instructorManager.deleteCourse(instructor1);
		instructorManager.updateCourse(instructor1);
		StudentManager studentManager = new StudentManager();
		studentManager.addToCourse(student1);


		
		
	}

}
