package eCommerce.business.concretes;

import eCommerce.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send(String message) {
		System.out.println(message + "emaile gönderildi.");
		
		
	}

}
