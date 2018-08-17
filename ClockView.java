class ClockView extends javax.swing.JFrame {

	private javax.swing.JLabel tLabel = new javax.swing.JLabel();
	
	ClockView() {
		this.setDefaultCloseOperation(
			javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setSize(1920,1080);
		this.getContentPane().add(tLabel);
		this.refreshTimeDisplay();
	}
	
	protected String getDigitsAsString(int i) {
		String str = Integer.toString(i);
		if(i<10) str = '0'+str;
		return str;
	}

	protected Integer convert (int t) {
		if(t > 12);
			int k = t - 12;
		return (k);
	}

	protected String amORpm (int i) {
		String c;
		if(i < 12)
			c = "AM";
		else
			c = "PM";
		return c;
	}
	
	public void refreshTimeDisplay() {
		Timestamp t = new Timestamp();
		t.fillTimes();
		String display = getDigitsAsString(convert(t.hrs)) + ":"
				+ getDigitsAsString(t.mins) + ":"
				+ getDigitsAsString(t.secs) + " " + amORpm(t.hrs);
		tLabel.setText("  " + display );
		tLabel.repaint();
	}
}