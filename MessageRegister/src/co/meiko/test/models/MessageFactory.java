package co.meiko.test.models;

import java.io.IOException;

public class MessageFactory implements IMessageFactory {

	@Override
	public void selectMessage(String message) {
		// TODO Auto-generated method stub
		
		try {
			PropertiesLoader pLoader = new PropertiesLoader();
			pLoader.getPropValues();
			String messageType = pLoader.getMessageType();
			
			switch(messageType) {
				case "console":
					MessageConsole mConsole = new MessageConsole();
					mConsole.registerMessage(message);
					break;
					
				case "disk":
					MessageDisk mDisk = new MessageDisk();
					mDisk.registerMessage(message);
					break;
					
				default:
					System.out.println("Message type not supported");
					break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
