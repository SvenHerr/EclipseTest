package uebungsblatt16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client 
{
	public static void main(String[]args) 
	{
		try (Socket socket = new Socket("localhost", 8082))
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) 
			{
				String str = br.readLine();
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
