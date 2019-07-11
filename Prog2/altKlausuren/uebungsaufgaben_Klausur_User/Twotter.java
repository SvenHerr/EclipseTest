package uebungsaufgaben_Klausur_User;

import java.util.List;

import uebungsaufgaben_Klausur.User;

public class Twotter 
{
	public static void main(String[] args) 
	{
		TwotterSystem sys = new TwotterSystem();
		User u = new User("Horst", "123");
		sys.addMessage(u, new Message(" Hello World "));
		List<Message> v = sys.getAllMessages();
		List<Message> m = sys.getAllMessagesFromDate(" 2018 -01 -31 ");
		List<Message> d = sys.getAllMessagesFromUser(v);
	}

}
