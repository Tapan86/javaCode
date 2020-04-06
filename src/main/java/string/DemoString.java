package string;

public class DemoString {

	public static void main(String[] args) {

		// primitive & non primitive
		// char - primitive data type
		// String - non primitive data type

		// immutable - not changeable
		String text = "CareerHack";
		text = text + " ";
		text+= "is a IT Traininng Center.";

		System.out.println(text);

		String myText = new String("CareerHack");
		myText+=" ";
		myText+="is a IT Training Center.";

		System.out.println(myText);
		
		
		String s1 = "Mahbub";
		String s2 = "Mahbub";
		String s3 = "MahBub";
		
		//comparing String
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));

	}

}
