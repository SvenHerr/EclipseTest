package uebungsblatt19;

import java.util.Iterator;

public class IterableString implements Iterable<Character> 
{
	private String string;

	public IterableString(String string) 
	{
		this.string = string;
	}

	@Override
	public Iterator<Character> iterator() 
	{
		return new StringIterator(string);
	}
}