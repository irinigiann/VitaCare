import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class DiabettesApp1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblText;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiabettesApp1 window = new DiabettesApp1();
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
	public DiabettesApp1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField("");
		textField.setBounds(10, 145, 414, 87);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(20, 236, 46, 18);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 236, 189, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBounds(258, 233, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		lblText = new JLabel("Text :");
		lblText.setBounds(10, 132, 46, 14);
		frame.getContentPane().add(lblText);
		
		JButton btnImportYourCalories = new JButton("Import MyMcrosCount");
		btnImportYourCalories.setBounds(10, 98, 145, 23);
		frame.getContentPane().add(btnImportYourCalories);
		
		JToggleButton tglbtnContactDoctor = new JToggleButton("Contact Doctor");
		tglbtnContactDoctor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tglbtnContactDoctor.setBounds(0, -2, 121, 23);
		frame.getContentPane().add(tglbtnContactDoctor);
	}
}
