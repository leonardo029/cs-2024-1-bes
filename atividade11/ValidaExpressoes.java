package atividade11;

public class ValidaExpressoes {

	boolean ValidaExpressao(String login, String password) {
		
		if(login.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%&*()-+.,;?{[}]^><:])[a-zA-Z0-9!@#$%&*()-+.,;?{[}]^><:]{5,30}")){

			if(password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&*()-+.,;?{[}]^><:])[a-zA-Z0-9!@#$%&*()-+.,;?{[}]^><:]{8,12}")){
				return true;
			}

		}

		return false;
	}
}