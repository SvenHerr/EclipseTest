package uebungsaufgaben_Klausur;

import java.net.URL;

public class DownloadManager 
{
	private URL url ;
	
	void configure ( int maxThreads , long timeout )
	{
		
	}
	public String startDownload ()
	{
		return null;
		
	} // returns the JobId
	
	public void cancelDownload ( String jobId )
	{
		
	}
	
	public void specifyDownloadLocation ( URL url ) 
	{
		this . url = url ;
	}
	
	// nicht Teil des F l u i d I n t e rf a c e s
	public static byte [] downloadFromURL ( URL url ) 
	{
		return null;
		
	}
}
