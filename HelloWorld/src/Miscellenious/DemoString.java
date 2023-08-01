package Miscellenious;

public class DemoString {

	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "java";
		
//		String s1 = new String("Java");
//		String s2 = new String("Java");
		
		
//	String is first class object, StringBuffer is not
//	String is immutable, StringBuffer is
		
		
//		== compares memory location and .equals() compares content.
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1 == s2)
		{
			System.out.println("same memmory");
		}
		else 
		{
			System.out.println("diff memmory");
		}
		
		
		if(s1.equals(s2))
		{
			System.out.println("same content");
		}
		else 
		{
			System.out.println("diff content");
		}
		
		s1  = s1.concat("ROcks...");
		System.out.println(s1+"...."+s1.hashCode());
		
		s1  = s1.toUpperCase();
		System.out.println(s1+"...."+s1.hashCode());
		
		

		StringBuffer ss1 = new StringBuffer("python");
		StringBuffer ss2 = new StringBuffer("python");
//		StringBuffer ss1 = "python";
//		System.out.println(ss1.hashCode());
//		
//		ss1 = ss1.append(" is a script");
//		System.out.println(ss1+"...."+ss1.hashCode());
		
		
		
		if(ss1 == ss2)
		{
			System.out.println("same memmory");
		}
		else 
		{
			System.out.println("diff memmory");
		}
		
		
		if(ss1.equals(ss2))
		{
			System.out.println("same content");
		}
		else 
		{
			System.out.println("diff content");
		}
		
		
//		Comparing two string buffers
		if(ss1.toString().equals(ss2.toString()))
		{
			System.out.println("Both StringBuffer are same");
		}
		else 
		{
			System.out.println("Both StringBuffer are diff");
		}
		
		
		
		String s3 = "java";
		s3 = s3.concat(" Rocks");
		s3 = s3.toUpperCase();
		s3 = s3.toLowerCase();
		System.out.println(s3);
		
		
		String s4 = "My students are very brilliant";
		
//		Splitting every word of sentence
		String[] s5 = s4.split(" ");
		
//		length of a string
		int lenghtOfS4 = s4.length();
		System.out.println(lenghtOfS4);
		
//		replacing y with i
		String s6 = s4.replace('y', 'i');
		System.out.println(s6);
		
//		String s7 = s4.substring(0, 3);
//		String s8 = s4.substring(4, 12);
//		String s9 = s4.substring(13, 16);
//		String s10 = s4.substring(17, 21);
//		String s11 = s4.substring(22, 30);
		
		
//		Converting first letter of every word to upper case
		char[] charArray = s4.toCharArray();
		boolean foundSpace = true;
		
		for(int i = 0; i < charArray.length; i++) 
		{
		      // if the array element is a letter
		      if(Character.isLetter(charArray[i])) 
		      {
		        // check space is present before the letter
		        if(foundSpace) 
		        {
		          // change the letter into upper case
		          charArray[i] = Character.toUpperCase(charArray[i]);
		          foundSpace = false;
		        }
		      }

		      else 
		      {
		        // if the new character is not character
		        foundSpace = true;
		      }
		}
		
		s4 = String.valueOf(charArray);
		System.out.println(s4);
		
		
	}
	
	
	

}
