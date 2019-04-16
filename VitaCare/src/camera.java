import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JTextField;

public class camera {

	private JFrame frame;
	private JTextField txtSpaghetti;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					camera window = new camera();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public camera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\vector-camera-unique-camera-icon-royalty-free-cliparts-vectors-and-stock-of-vector-camera-150x150.jpg"));
		label.setBounds(193, 84, 150, 157);
		frame.getContentPane().add(label);
		
		JToggleButton tglbtnPortionScanner = new JToggleButton("Portion Scanner");
		tglbtnPortionScanner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tglbtnPortionScanner.setBounds(0, 0, 121, 23);
		frame.getContentPane().add(tglbtnPortionScanner);
		
		JLabel lblSelectedFood = new JLabel("Selected Food:");
		lblSelectedFood.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectedFood.setBounds(10, 43, 92, 14);
		frame.getContentPane().add(lblSelectedFood);
		
		txtSpaghetti = new JTextField();
		txtSpaghetti.setText("Spaghetti");
		txtSpaghetti.setBounds(100, 40, 86, 20);
		frame.getContentPane().add(txtSpaghetti);
		txtSpaghetti.setColumns(10);
		
		JLabel lblAmountOfPortion = new JLabel("Amount of portions:");
		lblAmountOfPortion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAmountOfPortion.setBounds(10, 252, 114, 14);
		frame.getContentPane().add(lblAmountOfPortion);
		
		JLabel lblX = new JLabel("3");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(134, 250, 19, 14);
		frame.getContentPane().add(lblX);
	}
}