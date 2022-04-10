package First;

import javax.swing.JOptionPane;

public class Gui {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Name please");
		// using JOptionpane to use input GUI
		JOptionPane.showMessageDialog(null, "Hai " + name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Age please"));
		// using parseInt method to convert to string since JOptions only accepts string
		JOptionPane.showMessageDialog(null, "age: " + age);

	}
}