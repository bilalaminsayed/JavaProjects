//Bilal Sayed Project 3 7/7/18
import javax.swing.JFrame;

class Window extends JFrame {
	Window() {
		Converter c = new Converter();
		setContentPane(c);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(175,170);
	    setVisible(true);
	}
}