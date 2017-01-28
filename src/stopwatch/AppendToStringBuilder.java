package stopwatch;

/**
 * Append chars to a StringBuilder.
 */

public class AppendToStringBuilder implements Runnable {
	
	final char CHAR = 'a';
	int count = 0;
	
	public AppendToStringBuilder(int count){
		this.count = count;
		System.out.printf("Append %,d chars to StringBuilder\n", count);
	}
	
	public void run(){
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}
	
}
