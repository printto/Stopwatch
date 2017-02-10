package stopwatch;

/**
 * Append chars to a StringBuilder.
 * @author Pappim Pipatkasrira
 * @version 28.01.2017
 */

public class AppendToStringBuilder implements Runnable {
	
	final char CHAR = 'a';
	int count = 0;
	
	public AppendToStringBuilder(int count){
		this.count = count;
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
	
	public String toString(){
		String format = String.format("Append %,d chars to StringBuilder", count);
		return format;
	}
	
}
