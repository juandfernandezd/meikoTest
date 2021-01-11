package co.meiko.test.models;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MessageDisk implements IMessage {

	@Override
	public void registerMessage(String message) {
		// TODO Auto-generated method stub
		PrintWriter writer;
		try {
			writer = new PrintWriter("message.txt", "UTF-8");
			writer.write(message);
			writer.close();
			System.out.println("Message Writed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
