package stopwatch;

/**
 * Append chars to a string.
 * @author Pappim Pipatkasrira
 * @version 28.01.2017
 */

public class AppendToString implements Runnable {

	final char CHAR = 'a';
	int count = 0;
	
	public AppendToString(int count){
		this.count = count;
	}

	public void run(){
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}
	
	public String toString(){
		String format = String.format("Append %,d chars to String", count);
		return format;
	}

}
