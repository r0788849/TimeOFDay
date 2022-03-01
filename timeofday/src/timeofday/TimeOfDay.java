package timeofday;


/**
 * Each instance of this class stores a time of day
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 * @invar | getMinutesSinceMidnight() == 60 * getHours() + getMinutes()
 */


public class TimeOfDay {
	
	public int getHours() {throw new RuntimeException("not yet implemented") ;}
	
	public int getMinutes() {throw new RuntimeException("not yet implemented") ;}
	
	public int getMinutesSinceMidnight() {throw new RuntimeException("not yet implemented") ;}
	
	
	/**
	 * initialises this instance so that it stores the time of day
	 * @param hours
	 * @param minutes
	 * 
	 * @throws IlligalArgumentExcpetion | hours < 0 || 23 < hours 
	 * @throws IlligalArgumentExcpetion | minutes < 0 || 59 < hours 
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {throw new RuntimeException("not yet implemented") ;
		
	}
	
	/**
	 * sets this objects hours to the given value
	 * 
	 * @throws IlligalArgumentExcpetion | hours < 0 || 23 < hours 
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 * 
	 */
	public void setHours(int hours) {throw new RuntimeException("not yet implemented") ;}
	
	/**
	 * sets this objects minutes to the given value
	 * 
	 * @throws IlligalArgumentExcpetion | minutes < 0 || 59 < minutes
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 * 
	 */
	public void setMinutes(int minutes) {throw new RuntimeException("not yet implemented") ;}
	
	/**
	 * sets this objects minutes since midnight  to the given value
	 * 
	 * @throws IlligalArgumentExcpetion | hours < 0 || 23 < hours 
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutesSinceMidnight() == minutesSinceMidnight
	 * 
	 */
	public void setMinutesSinceMidnight(int minutesSinceMidnight) {throw new RuntimeException("not yet implemented") ;}
	
	
}
