package uebungsaufgaben_Klausur_User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem 
{
	List<User> userList = new ArrayList<User>();
	Map<User, Message> userListandMessage = new HashMap<User, Message>();

	
	public User addMessage(User u, Message message) 
	{
		userListandMessage.put(u, message);
		return null;
	}
	
	public List<Message> getAllMessagesFromDate(String date) 
	{
		
		return null;
	}
	
	public List<Message> getAllMessages() 
	{
		
		return null;
	}
	
	public List<Message> getAllMessagesFromUser(List<Message> u) 
	{
		
		return null;
	}
	
	

}
