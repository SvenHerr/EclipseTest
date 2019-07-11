package uebungsblatt16;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Aufgabe3_Tutorium 
{
	public static void main(String[]args) 
	{
		try(ServerSocket server = new ServerSocket(8082))
		{
			Socket socket = server.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) 
			{
				String line = br.readLine();
				System.out.println(line);
				bw.write("OK");
				bw.newLine();
				bw.flush();
			}	
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
