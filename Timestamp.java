class Timestamp {
	int hrs;
	int mins;
	int secs;
	
	void fillTimes() {
		java.util.Calendar now;
		now = java.util.Calendar.getInstance();
		hrs = now.get(java.util.Calendar.HOUR_OF_DAY);
		mins = now.get(java.util.Calendar.MINUTE);
		secs = now.get(java.util.Calendar.SECOND);
	}
}	