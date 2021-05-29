package eCommerce.business.abstracts;

import eCommerce.entites.concretes.User;

public interface UserValidationService {
	 boolean validate(User user);
}
