package inheritance3;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("Egitmen"+" "+instructor.getFirstname()+" "+instructor.getLastName()+" " +"eklendi.");
	}

	public void Update(Instructor instructor) {
		System.out.println("Egitmen"+" "+instructor.getFirstname()+" "+instructor.getLastName()+" " +"guncellendi.");
	}

	public void Delete(Instructor instructor) {
		System.out.println("Egitmen"+" "+instructor.getFirstname()+" "+instructor.getLastName()+" " +"silindi.");
	}
}
