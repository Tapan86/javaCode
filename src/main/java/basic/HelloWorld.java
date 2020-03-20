package basic;

class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World 1");
		HelloWorld.main(10);
		HelloWorld.main(args, 10);
		
	}//end of main
	
	//overloading main methods by different number of arguments
	public static void main(String[] args, int y) {
		System.out.println("Hello World 2");
		
	}//end of main
	
	//overloading main methods by different data type
	public static void main(int y) {
		System.out.println("Hello World 3");
		
	}//end of main
	
}//end of class
