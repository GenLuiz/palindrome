package com.test.classes;

public class PalindromesCheck {
	
	public Boolean checkPalindromes(String word)
	{
		Boolean response = false;
		word = word.trim();
		int len = word.length();
		int lastPos = len-1;
		
		for(int x = 0; x<len; x++)
		{
			if(len%2 == 0)
			{
				if (word.charAt((len/2)) == word.charAt((len/2)-1))
				{
					if(verifyFirstAndLast(word, x, lastPos))
					{
						response = true;
						lastPos--;
					}
					else
						return false;
				}
				else
					return false;
			}else
			{
				if(verifyFirstAndLast(word, x, lastPos))
				{
					response = true;
					lastPos--;
				}
				else
					return false;
			}
		}
		return response;
	}

	public Boolean verifyFirstAndLast(String word, int pos1, int pos2)
	{
		Boolean responseFrom = false;
		
		if(word.charAt(pos1) == word.charAt(pos2))
			responseFrom = true;
		
		return responseFrom;
	}
}
