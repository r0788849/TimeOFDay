package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(10, 25);
		assertEquals(10, myTimeOfDay.getHours());
		assertEquals(25, myTimeOfDay.getMinutes());
		assertEquals(625, myTimeOFDay.getMinutesSinceMidnight());
		
		myTimeOfDay.setHours(11);
		assertEquals(11, myTimeOfDay.getHours());
		assertEquals(25, myTimeOfDay.getMinutes());
		assertEquals(685, myTimeOFDay.getMinutesSinceMidnight());
		
		myTimeOfDay.setMinutes(30);
		assertEquals(11, myTimeOfDay.getHours());
		assertEquals(30, myTimeOfDay.getMinutes());
		assertEquals(690, myTimeOFDay.getMinutesSinceMidnight());
		
		myTimeOfDay.setMinutesSinceMidnight(30);
		assertEquals(0, myTimeOfDay.getHours());
		assertEquals(30, myTimeOfDay.getMinutes());
		assertEquals(30, myTimeOFDay.getMinutesSinceMidnight());
	}

}
