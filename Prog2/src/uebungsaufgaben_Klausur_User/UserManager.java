package uebungsaufgaben_Klausur_User;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User> 
{
	@Override
	public void serialize(List<User> object) 
	{
		ObjectOutputStream oos = null;
		try 
		{		
			oos = new ObjectOutputStream(new FileOutputStream("user.dat"));
			for (int i = 0; i < object.size(); i++) 
			{
				User p = object.get(i);
				oos.writeObject(p);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Exception serialize");
		}
		
		try 
		{
			oos.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Exception oos close");
		}
	}

	@Override
	public List<User> deserialize() 
	{
		List<User> list = new ArrayList<User>();

		ObjectInputStream ois = null;
		
		try
		{
			ois = new ObjectInputStream(new FileInputStream("user.dat"));
			do 
			{
				User user = (User) ois.readObject();
				list.add(user);
			}while(true);
		}
		catch (EOFException eo)
		{
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception deserialize");
		}

		try 
		{
			ois.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Exception ois close");
		}
		
		return list;
	}
}
