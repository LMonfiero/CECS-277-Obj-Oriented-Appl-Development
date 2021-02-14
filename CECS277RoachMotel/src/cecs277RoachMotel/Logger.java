package cecs277RoachMotel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
	/** The file name where we will do the ASCII logging */
	private static String logFileName = "log.txt";
	
	/**
	 * The singleton instance.  The volatile keyword makes sure that multiple threads 
	 * handle the unique instance variable correctly when we initialize it. 
	*/
	private volatile static Logger logger;
	
	/** The File corresponding to the log file name */
	private File logFile;
	
	/** Flag to tell whether we have written to this log yet or not. */
	boolean append = false;
	
	public static void setFile (String fileName) {
		Logger.logFileName = fileName;
	}
	
	/** The private constructor that only this class can use. */
	private Logger () {
		//Honestly, I could have constructed this File object each time the user wanted
		//to log something, but that would have been wasteful.
		this.logFile = new File (Logger.logFileName);
	}
	
	/**
	 * This essentially takes the place of a typical constructor.
	 * @return	The one and only instance of the Logger class.
	 */
	public static Logger getLogger () {
		if (Logger.logger== null) {
			// Make this thread safe
			synchronized (Logger.class) {
				if (Logger.logger == null) {
					Logger.logger = new Logger();
				}
			}
		}
		return Logger.logger;
	} // End of the getLogger method
	
	/**
	 * This is an instance-oriented version of the log utility.
	 * @param message	The string that you want to put out to the log.
	 */
	public void log (String message) {
		//Create a prefix to indicate the exact time and date of the log message.
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Calendar cal = Calendar.getInstance();
		FileWriter fileWriter = null;					// The file writer that we will write to
		//Make sure that never more than one thread runs this next block of code at the same time.
		//We only have one instance, so this really is just like a static synchronize stretch.
		synchronized (this) {
			try {
				//Create a new FileWriter and append if we have written anything already.
				fileWriter = new FileWriter (this.logFile.getAbsoluteFile(), this.append);
				this.append = true;					// From here on out, append
			} catch (IOException e) {
				e.printStackTrace();
			} // End of squelching the IOException exception
			PrintWriter pw = new PrintWriter (fileWriter);
			pw.println(dateFormat.format(cal.getTime()) + " " + message);
			pw.close();
		}
	}
	
	/**
	 * Static version of the logger, just for kicks.
	 * @param message	The message that you want to log.
	 */
	public static void Slog (String message) {
		//Get the one and only one instance of Logger that we have, or
		//construct it if we need to.
		Logger logger = Logger.getLogger();
		//Call the instance-oriented log routine.  No sense repeating that code.
		logger.log(message);
	} // End of the Static Logger member method.
} // End of the Logger class
