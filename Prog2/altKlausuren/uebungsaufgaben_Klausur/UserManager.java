package uebungsaufgaben_Klausur;

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
	public void serialize(List<User> object) throws RuntimeException
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
	public List<User> deserialize() throws RuntimeException
	{
		List<User> list = new ArrayList<User>();

		ObjectInputStream ois = null;
		
		try
		{
			ois = new ObjectInputStream(new FileInputStream("user.dat"));
			User user = null;
			do 
			{
				user = (User) ois.readObject();
				list.add(user);
				
			}while(user != null);
			System.out.println("Im aktiv");
			return list;
		}
		catch (EOFException eo)
		{
			System.out.println("Exception EOF");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception deserialize");
			
		}finally 
		{
			try 
			{
				ois.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Exception ois close");
			}
		}
		return list;
	}
}
