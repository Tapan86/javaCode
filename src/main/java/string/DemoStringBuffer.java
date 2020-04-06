package string;

public class DemoStringBuffer {

	public static void main(String[] args) {
		
		//mutable string - StringBuffer & StringBuilder (java 1.5)
		//StringBuffer is thread safe but StringBuilder is NOT thread safe
		//methods available for StringBuffer & StringBuilder
		//1. append 2. insert 3. replace 4. delete 5. reverse 6.capacity 7.ensureCapacity
		//compare strings 1. equal() 2. == 3. compareTo()
		
		StringBuffer sb = new StringBuffer("CareerHack");
		sb.replace(9, 10, "x");
		sb.append(" ");
		sb.append("is a IT Trainninng Center.");
		
		System.out.println(sb.toString());
			
		StringBuilder sd = new StringBuilder("");
		sd.append("CareerHack");
		sd.insert(6, "Java");
		sd.reverse();
		
		System.out.println(sd.toString());
		
		StringBuffer sb1 = new StringBuffer("Dhaka");
		sb1.replace(0, 5, "Chittagong");
		System.out.println(sb1.toString());	
	}

}
