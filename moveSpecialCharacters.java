package Assignment;

public class moveSpecialCharacters {
	static String moveAllSC(String str)
	{
		int len = str.length();
		String regx = "[a-zA-Z0-9\s+]";
		String res1 = "", res2 = "";
		for (int i=0;i<len;i++)
		{
			char c = str.charAt(i);
			if(String.valueOf(c).matches(regx))
				res1 = res1 + c;
			else
				res2 = res2 + c;
		}
		return res1 + res2;
	}
	
	public static void main(String[] args) 
	{
		String str1 = "He@#$llo!*&";
		String str2 = "%$Wel*&come!";
		
		System.out.println(moveAllSC(str1));
		System.out.println(moveAllSC(str2));
	}
}
