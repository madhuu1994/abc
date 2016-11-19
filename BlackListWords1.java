import java.util.*;

public class BlackListWords1
{
    static Set blacklist = new HashSet();

	static
	{
		//blacklist.add("idiot");
		blacklist.add("badword2");
		blacklist.add("badword3");
	}
	
	public static void main(String []args)
	{
    	String statement = "john doe is an idiot";
		if (hasBlackListedWords(statement))
		{
			System.out.println("cannot print because it is a black listed word");
		}
		else 
		{
			System.out.println(statement);
		}
	}
   
	public static boolean hasBlackListedWords(String str)
	{
		String[] words = str.split(" ");
		for(String word : words)
		{
			if (blacklist.contains(word))
			{
			return true;
	    	}
		}
		return false;
  
	}
}