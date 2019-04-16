import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtG;
	private JTextField txtkcal;
	private JTextField txtG_1;
	private JTextField textField_1;
	private JTextField txtg;
	private JTextField txtkcal_1;
	private JTextField txtg_1;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize(textField);
	}

	/**
	 * Initialize the contents of the frame.
	  
	 */
	private void initialize(JComponent label) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 834, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("\r\n\r\n\r\n\r\n\r\nMENU\r\n");
		lblMenu.setBounds(0, 48, 816, 22);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblMenu);
		
		JButton btnMyCaloriesCount = new JButton("My Calories Count");
		btnMyCaloriesCount.setBounds(0, 371, 816, 25);
		btnMyCaloriesCount.setVerticalAlignment(SwingConstants.TOP);
		btnMyCaloriesCount.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(btnMyCaloriesCount);
		
		JLabel lblMyDailyCount = new JLabel("My Daily Count\r\n");
		lblMyDailyCount.setBounds(306, 13, 142, 16);
		lblMyDailyCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblMyDailyCount);
		
		JButton lblMyCaloriesCount = new JButton("My Macros Count");
		lblMyCaloriesCount.setBounds(0, 93, 162, 25);
		lblMyCaloriesCount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblMyCaloriesCount);
		
		JButton btnSuggestedFoods = new JButton("Suggested Foods");
		btnSuggestedFoods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Icons nw = new Icons();
				nw.NewScreen();
			}
		});
		btnSuggestedFoods.setBounds(0, 133, 145, 25);
		btnSuggestedFoods.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnSuggestedFoods);
		
		JButton btnPortionScanner = new JButton("Portion Scanner");
		btnPortionScanner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				camera nw = new camera();
				nw.NewScreen();
			}
		});
		btnPortionScanner.setBounds(0, 178, 142, 25);
		btnPortionScanner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnPortionScanner);
		
		JButton btnContactDoctor = new JButton("Contact Doctor");
		btnContactDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DiabettesApp1 nw = new DiabettesApp1();
				nw.NewScreen();
			}
		});
		btnContactDoctor.setBounds(0, 221, 142, 25);
		btnContactDoctor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnContactDoctor);
		
		textField = new JTextField();
		textField.setText("20/12/20\r\n");
		textField.setBounds(201, 95, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCarbs = new JLabel("Carbs");
		lblCarbs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarbs.setBounds(337, 66, 56, 16);
		frame.getContentPane().add(lblCarbs);
		
		txtG = new JTextField();
		txtG.setText("12 g");
		txtG.setBounds(332, 95, 116, 22);
		frame.getContentPane().add(txtG);
		txtG.setColumns(10);
		
		JLabel lblCalories = new JLabel("Calories");
		lblCalories.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalories.setBounds(495, 67, 56, 16);
		frame.getContentPane().add(lblCalories);
		
		txtkcal = new JTextField();
		txtkcal.setText("1600kcal");
		txtkcal.setBounds(482, 95, 116, 22);
		frame.getContentPane().add(txtkcal);
		txtkcal.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(201, 67, 56, 16);
		frame.getContentPane().add(lblDate);
		
		JLabel lblFat = new JLabel("Fat");
		lblFat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFat.setBounds(642, 67, 56, 16);
		frame.getContentPane().add(lblFat);
		
		txtG_1 = new JTextField();
		txtG_1.setText("17 g\r\n\r\n");
		txtG_1.setBounds(642, 95, 116, 22);
		frame.getContentPane().add(txtG_1);
		txtG_1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("21/12/20");
		textField_1.setBounds(201, 130, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtg = new JTextField();
		txtg.setText("10g");
		txtg.setBounds(332, 130, 116, 22);
		frame.getContentPane().add(txtg);
		txtg.setColumns(10);
		
		txtkcal_1 = new JTextField();
		txtkcal_1.setText("1750kcal");
		txtkcal_1.setBounds(482, 135, 116, 22);
		frame.getContentPane().add(txtkcal_1);
		txtkcal_1.setColumns(10);
		
		txtg_1 = new JTextField();
		txtg_1.setText("22g");
		txtg_1.setBounds(642, 133, 116, 22);
		frame.getContentPane().add(txtg_1);
		txtg_1.setColumns(10);
		
		
		
	}
}

