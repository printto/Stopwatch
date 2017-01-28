package stopwatch;

/**
 * Add BigDecimal objects from an array.
 * @author Pappim Pipatkasrira
 * @version 28.01.2017
 */

import java.math.BigDecimal;

public class SumBigDecimal implements Runnable {

	int counter = 0;
	BigDecimal[] values;

	public SumBigDecimal(int counter, int ARRAY_SIZE){
		this.counter = counter;
		System.out.printf("Sum array of BigDecimal with count=%,d\n", counter);
		// create array of values to add, before we start the timer
		this.values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
	}
	
	public void run(){
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
		System.out.println("sum = " + sum);
	}

}
