public class clock {

	public static void main(String[] args) {

		ClockView cv = new ClockView();
		cv.setVisible(true);
		try {
		    for (;;) {
			cv.refreshTimeDisplay();
			Thread.sleep(500);
		    }
		} catch (Exception e) {System.out.println("Error:"+e) ; }
	}
}