package uebungsblatt16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.omg.CORBA.portable.InputStream;

public class Aufgabe3 
{
	
	
	public static void main(String[] args) 
	{
		final int PORT = 5000;
		try(ServerSocket ss = new ServerSocket(PORT);
		Socket connection = ss.accept();
		InputStream is = (InputStream) connection.getInputStream();
		//  Ok zurück senden
				
		BufferedReader br = new BufferedReader(new InputStreamReader(is));)
		{
			System.out.println(Charset.defaultCharset() + ": " + br.readLine());
			System.out.println(StandardCharsets.ISO_8859_1 + ": " + br.readLine());
			System.out.println(StandardCharsets.UTF_16 + ": " + br.readLine());
			System.out.println(StandardCharsets.UTF_8 + ": " + br.readLine());
			System.out.println(StandardCharsets.US_ASCII + ": " + br.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
