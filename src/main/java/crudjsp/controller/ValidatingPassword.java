package crudjsp.controller;

import crudjsp.beans.BeanPerson;

public class ValidatingPassword implements ValidatingPasswordInterface{
		
	@Override
	public boolean validatingLogin(String login, String password) {
		
	    BeanPerson beanPerson = new BeanPerson();
		beanPerson.setLogin(login);
		beanPerson.setPassword(password);
		
		if (login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
