package uebungsblatt17;

import java.util.ArrayList;
import java.util.Optional;

public class Test1 
{
	public static void main(String[]args) 
	{
		Optional<String> test = Optional.of("Hello");
		test.ifPresent(System.out::println);
		
	}

}
