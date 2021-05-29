package eCommerce.googleAuth;

import eCommerce.business.abstracts.AuthService;

public class GoogleAdapter implements AuthService{
	@Override
	public void register(int id, String email,String password,String firstName,String lastName) {
		GoogleManager googleAuthManager = new GoogleManager();
		googleAuthManager.register(email,password);
	}

	@Override
	public void login(String email, String password) {
		GoogleManager googleAuthManager = new GoogleManager();
		googleAuthManager.login(email,password);
	}
}
