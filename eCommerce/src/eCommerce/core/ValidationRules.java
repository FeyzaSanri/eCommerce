package eCommerce.core;

public class ValidationRules {
	public static boolean checkRules(boolean... validationRules) {
		for (boolean validationR : validationRules) {
			if (!validationR)
				return false;
		}
		return true;
}
}
