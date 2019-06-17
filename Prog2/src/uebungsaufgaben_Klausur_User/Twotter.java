package uebungsaufgaben_Klausur_User;

import java.util.List;

public class Twotter 
{
	public static void main(String[] args) 
	{
		TwotterSystem sys = new TwotterSystem();
		User u = new User(null, null);
		sys.addMessage(u, new Message(" Hello World "));
		List<Message> u = sys.getAllMessages();
		List<Message> m = sys.getAllMessagesFromDate(" 2018 -01 -31 ");
		List<Message> d = sys.getAllMessagesFromUser(u);
	}

}
