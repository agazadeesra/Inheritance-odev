package inheritance3;

public class UserManager {
	public void Add(User user) {
		System.out.println("Kullanici"+" "+user.getFirstname()+" "+user.getLastName()+" " +"eklendi.");
	}
	public void Update (User user) {
		System.out.println("Kullanici"+" "+user.firstname+" "+user.getLastName()+" " +"guncellendi.");
	}
	public void Delete(User user) {
		System.out.println("Kullanici"+" "+ user.getFirstname()+" "+user.getLastName()+" "+ "silindi.");
	}
}
