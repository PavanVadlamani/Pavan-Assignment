
public class String_Assignments {

	public static void main(String[] args) {
		String  str;
		str = "HEllo World";
		System.out.println(str.length());
		String str1,str2;
		str1="Hello ";
		str2="How are you";
		System.out.println(str1.concat(str2));
		String strq3,strori;
		strq3="Java String pool refers to collection of Strings which are stored in heap memory";
		strori="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(strq3.toLowerCase());
		System.out.println(strq3.toUpperCase());
		System.out.println(strq3.replace("a", "$"));
		System.out.println(strori.contains("collection"));
		String strmatch;
		strmatch="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(strmatch.equals(strori));
		System.out.println(strmatch.equalsIgnoreCase(strori));
		
		
		

	}

}
