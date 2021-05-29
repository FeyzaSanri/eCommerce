package eCommerce.core;

public class BusinessRules {
	public static boolean checkRules(boolean... businessRules) {
		for (boolean businessRule : businessRules) {
			if (!businessRule)
				
				return false;
		}
		return true;
}
}
