package timeofday;


/**
 * Each instance of this class stores a time of day
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 * @invar | getMinutesSinceMidnight() == 60 * getHours() + getMinutes()
 */


public class TimeOfDay {
	
	/**
	 * @invar | 0 <= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;
	
	public int getHours() {return minutesSinceMidnight / 60 ;}
	
	public int getMinutes() {return minutesSinceMidnight % 60 ;}
	
	public int getMinutesSinceMidnight() {return minutesSinceMidnight ;}
	
	
	/**
	 * initialises this instance so that it stores the time of day
	 * @param hours
	 * @param minutes
	 * 
	 * @throws IllegalArgumentExcpetion | hours < 0 || 23 < hours 
	 * @throws IllegalArgumentExcpetion | minutes < 0 || 59 < minutes 
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		if (hours < 0 || 23 < hours) throw new IllegalArgumentException(" 'hours' out of reach ") ;
		if (minutes < 0 || 59 < minutes) throw new IllegalArgumentException(" 'minutes' out of reach ") ;
		
		this.minutesSinceMidnight = hours * 60 + minutes;
	}
	
	/**
	 * sets this objects hours to the given value
	 * 
	 * @throws IllegalArgumentExcpetion | hours < 0 || 23 < hours 
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 * 
	 */
	public void setHours(int hours) {
		if (hours < 0 || 23 < hours) throw new IllegalArgumentException(" 'hours' out of reach ") ;
		
		minutesSinceMidnight = minutesSinceMidnight % 60 + hours * 60;
	}
	
	/**
	 * sets this objects minutes to the given value
	 * 
	 * @throws IllegalArgumentExcpetion | minutes < 0 || 59 < minutes
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 * 
	 */
	public void setMinutes(int minutes) {
		if (minutes < 0 || 59 < minutes) throw new IllegalArgumentException(" 'minutes' out of reach ") ;
		
		minutesSinceMidnight = minutesSinceMidnight / 60 * 60 + minutes;
	}
	
	/**
	 * sets this objects minutes since midnight  to the given value
	 * 
	 * @throws IllegalArgumentExcpetion | minutesSinceMidnight < 0 || 60 * 24 <= minutesSinceMidnight
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutesSinceMidnight() == minutesSinceMidnight
	 * 
	 */
	public void setMinutesSinceMidnight(int minutesSinceMidnight) {
		this.minutesSinceMidnight = minutesSinceMidnight;
	}
	
	
}
