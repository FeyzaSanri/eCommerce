package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.UserValidationService;
import eCommerce.core.BusinessRules;
import eCommerce.entites.concretes.User;

public class AuthManager implements AuthService{

	UserService userService;
	UserValidationService userValidationService;
	EmailService emailService;
	
	
	public AuthManager() {
		
	}
	
	public AuthManager(UserService userService, UserValidationService userValidationService, EmailService emailService) {
		
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.emailService = emailService;
	}
	
	
	@Override
	public void login(String email, String password) {
		if(!BusinessRules.checkRules(checkMailPassword(email, password))) {
			System.out.println("You have entered incorrectly. Try again.");
			return;
		}
		
		User userLogin = userService.getMailAndPassword(email, password);
		
		if (userLogin == null) {
			System.out.println("Login failed. Your email address or password is incorrect.");
			return;
		}

		if (!userVerificationCheck(userLogin)) {
			System.out.println("Login failed. Verification failed.");
			return;
		}
		System.out.println("Login successful : " + userLogin.getEposta());
		
	}
	
	
	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User userRegister = new User(id,firstName,lastName,email,password);
		
		if(!userValidationService.validate(userRegister)) {
			System.out.println("Validation failed. Check your information");
			return;
		}
		
		else if(!BusinessRules.checkRules(checkMail(email))) {
			System.out.println("This e-mail address is already in use.");
			return;
		}
		System.out.println( "Registration successful. Confirmation email has been sent.");
		emailService.send("Click to verify" );
		userService.add(userRegister);
	}
	
	
	private boolean checkMail(String email) {
		return userService.getByEmail(email) == null;
	}

	private boolean userVerificationCheck(User user) {
		return user.isVerified();
	}

	private boolean checkMailPassword(String email, String password) {
		if (email.length() <= 0  ||  password.length() <= 0) { 

			return false;
		}
			return true;
	}
	
	
		
	
	

	
	
}
