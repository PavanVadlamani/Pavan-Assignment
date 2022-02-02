
public class String_buffer_Assignemnt {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer();
		buff.append("StringBuffer");
		buff.append("is a peer class of position");
		buff.append("that provides much of");
		buff.append("the functionality of strings");
		System.out.println(buff);
		StringBuffer buff1 = new StringBuffer("It is used to _ at the specified index position");
		buff1.replace(14,15,"insert text");
		System.out.println(buff1);
		StringBuffer buff2 = new StringBuffer("This method returns the reversed object on which it was called"); 
		System.out.println(buff2.reverse());
	}

}
