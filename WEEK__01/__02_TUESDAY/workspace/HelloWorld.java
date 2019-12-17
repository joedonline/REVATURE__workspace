public class HelloWorld {
	
	// static ==> associated with the Class, not instance
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("myField is " + myField);
		repeatedPrint("This will NOT repeat 4x", 11);
	}

	private static String myField = "J.Lo";
	
	//  Write a method that takes a String and an Integer
	// and demonstrates Method Signatures, modifiers, 
	// return types, method names

	/*
		<modifier> <return type> methodName(Type param, Type param) { ... }
	*/
	public static void repeatedPrint(String toPrint, Integer timesToPrint) {

		for (int i = 0; i < timesToPrint; i++) {
			System.out.println(toPrint);
		}

	}

}
