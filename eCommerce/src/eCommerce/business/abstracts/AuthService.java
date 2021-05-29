package eCommerce.business.abstracts;

public interface AuthService {
   public void login(String email , String password);
   public void register(int id, String firstName, String lastName,
		   String email , String password);
   
}
