package uebungsblatt19;

import java.util.Iterator;

public class StringIterator implements Iterator<Character> 
{
	private String string;

	public StringIterator(String string) 
	{
		this.string = string;
	}

	private int currentPosition = 0;

	@Override
	public boolean hasNext() 
	{
		if (currentPosition < string.length())
			return true;
		else
			return false;
	}

	@Override
	public Character next() 
	{
		char c = string.charAt(currentPosition);
		currentPosition++;
		return c;

	}
}