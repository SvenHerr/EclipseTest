package uebungsaufgaben_Klausur;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class Client 
{
	public static void main(String[] args) throws IOException
	{
	    byte[] bytesToTransfer = "Hallo Welt".getBytes();
	    Socket connectionToHost = new Socket("localhost", 5555);
	    
	    try(OutputStream os = connectionToHost.getOutputStream())
	    {
	    	GZIPOutputStream gzOs = new GZIPOutputStream(os);
		    gzOs.write(bytesToTransfer);
	    } 
	    finally 
	    {
	    	connectionToHost.close();
	    }
	}
}
