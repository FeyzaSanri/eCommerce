package eCommerce;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.EmailManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.UserValidationManager;
import eCommerce.dataAcces.concrete.InMemoryUserDao;
import eCommerce.googleAuth.GoogleAdapter;


public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InMemoryUserDao());
		//UserValidationService validationService = new UserValidatonManager();
		AuthService authService = new AuthManager(userService, new UserValidationManager(), new EmailManager());
        authService.register(6, "Feyza", "Sanrý", "feyzaaasanri0@gmail.com", "258147369f");
        authService.register(2, "Engin", "Demiroð", "engindemirog", "65645423");
        
        
		authService.login("feyzaaasanri0@gmail.com", "258147369f");
		
		
		AuthService googleAuthService = new GoogleAdapter();
		googleAuthService.register(4, "feyzaaasanriii@gmail.com", "123456789fs", "Feyza Nur", "Sanrý");
		googleAuthService.login("feyzaaasanriii@gmail.com", "123456789fs");
	}

}
