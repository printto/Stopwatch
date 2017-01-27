package stopwatch;

import java.util.Scanner;

/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Pappim Pipatkasrira
 * @version 1.0
 * @since Jan 27, 2017
 */
public class Stopwatch {

	boolean isRunning = false;
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime = 0;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime = 0;
	/** duration between startTime and stopTime, in nanoseconds. */
	private long duration = 0;

	public Stopwatch(){

	}

	/** @return isRunning in boolean to check if stopwatch is running. */
	public boolean isRunning(){
		return isRunning;
	}

	/** Start the stopwatch if it is not already running. */
	public void start(){
		if(!isRunning){
			isRunning = true;
			startTime = System.nanoTime();
		}
	}

	/** Stop the stopwatch if it is running and update the duration. */
	public void stop(){
		if(isRunning){
			isRunning = false;
			stopTime = System.nanoTime();
			duration = stopTime - startTime;
		}
	}

	/** @return duration of the stopwatch in seconds. */
	public double getElapsed(){
		if(isRunning){
			return (System.nanoTime() - stopTime)*NANOSECONDS;
		}
		else{
			return duration*NANOSECONDS;
		}
	}

}
