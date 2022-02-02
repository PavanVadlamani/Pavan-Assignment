
public class String_builder_Assignemnt {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("StringBuffer");
		builder.append("is a peer class of position");
		builder.append("that provides much of");
		builder.append("the functionality of strings");
		System.out.println(builder);
		StringBuilder builder1 = new StringBuilder("It is used to _ at the specified index position");
		builder1.replace(14,15,"insert text");
		System.out.println(builder1);
		StringBuilder builder2 = new StringBuilder("This method returns the reversed object on which it was called"); 
		System.out.println(builder2.reverse());

	}

}
