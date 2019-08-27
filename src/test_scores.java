import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String ask = JOptionPane.showInputDialog("What did you get on your test?");
	
	double score = Double.parseDouble(ask);
	
	if (score > 90) {
		JOptionPane.showMessageDialog(null, "Wow! You did really good!");
	}
	if (score > 80 && score < 90) {
		JOptionPane.showMessageDialog(null, "You did pretty average");
	}
	if (score > 70 && score < 80) {
		JOptionPane.showMessageDialog(null, "Eh. You could improve");
	}
	if (score < 60) {
		JOptionPane.showMessageDialog(null, "Man, you did terrible!");
	}

}
}
