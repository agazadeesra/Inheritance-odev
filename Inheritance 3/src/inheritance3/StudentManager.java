package inheritance3;

public class StudentManager {
	public void Add(Student student) {
		System.out.println("Ogrenci"+" "+student.getFirstname()+" "+student.getLastName()+" " +"eklendi.");
	}

	public void Update(Student student) {
		System.out.println("Ogrenci"+" "+student.getFirstname()+" "+student.getLastName()+" " +" guncellendi.");
	}

	public void Delete(Student student) {
		System.out.println("Ogrenci"+" "+student.getFirstname()+" "+student.getLastName()+" " +" silindi.");
	}
}
