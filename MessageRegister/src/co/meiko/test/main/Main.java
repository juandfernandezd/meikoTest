package co.meiko.test.main;

import co.meiko.test.models.MessageFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFactory mFactory = new MessageFactory();
		String message = "Hola mundo!";
		mFactory.selectMessage(message);
	}

}
