package inheritance3;

public class Main {

	public static void main(String[] args) {
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor();
		instructor.setId(11);
		instructor.setFirstname("Engin");
		instructor.setLastName("Demirog");
		instructor.setInstructorIdentityNumber(1234567);
		instructorManager.Add(instructor);
		instructorManager.Delete(instructor);
		UserManager userManager = new UserManager();
		User user =new User () ;
		user.setId(22);
		user.setFirstname("Esra");
		user.setLastName("Agazade");
		userManager.Add(user);
		userManager.Delete(user);
		userManager.Update(user);
		Student student=new Student();
		student.setId(37);
		student.setFirstname("Ayse");
		student.setLastName("Celik");
		student.setStudenIdentityNumber(99999);
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student);
		studentManager.Delete(student);
		studentManager.Update(student);

	}

}
