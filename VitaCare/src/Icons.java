import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JSeparator;

public class Icons {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Icons window = new Icons();
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
	public Icons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCarbs = new JLabel("Carbs:");
		lblCarbs.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblCarbs.setBounds(10, 153, 46, 14);
		frame.getContentPane().add(lblCarbs);
		
		JLabel lblProtein = new JLabel("Protein:");
		lblProtein.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblProtein.setBounds(10, 178, 46, 14);
		frame.getContentPane().add(lblProtein);
		
		JLabel lblFat = new JLabel("Fat:");
		lblFat.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblFat.setBounds(10, 203, 46, 14);
		frame.getContentPane().add(lblFat);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\spaghetti.png"));
		label.setBounds(99, 55, 70, 55);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\salmon.png"));
		label_1.setBounds(212, 40, 70, 70);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\fried-egg (1).png"));
		label_2.setBounds(326, 40, 70, 70);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\turkey.png"));
		label_3.setBounds(449, 55, 70, 55);
		frame.getContentPane().add(label_3);
		
		JLabel lblSpaghetti = new JLabel("Spaghetti");
		lblSpaghetti.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblSpaghetti.setBounds(109, 121, 46, 14);
		frame.getContentPane().add(lblSpaghetti);
		
		JLabel lblSalmon = new JLabel("Salmon");
		lblSalmon.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblSalmon.setBounds(225, 121, 38, 14);
		frame.getContentPane().add(lblSalmon);
		
		JLabel lblEgg = new JLabel("Egg\r\n");
		lblEgg.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblEgg.setBounds(351, 121, 38, 14);
		frame.getContentPane().add(lblEgg);
		
		JLabel lblTurkey = new JLabel("Turkey\r\n");
		lblTurkey.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblTurkey.setBounds(469, 121, 38, 14);
		frame.getContentPane().add(lblTurkey);
		
		JLabel lblPerPortion_1 = new JLabel("Per Portion\r\n");
		lblPerPortion_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblPerPortion_1.setBounds(10, 128, 64, 14);
		frame.getContentPane().add(lblPerPortion_1);
		
		JLabel lblNewLabel = new JLabel("53g");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 154, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblg = new JLabel("10g");
		lblg.setHorizontalAlignment(SwingConstants.CENTER);
		lblg.setBounds(109, 179, 46, 14);
		frame.getContentPane().add(lblg);
		
		JLabel lblg_1 = new JLabel("5g");
		lblg_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_1.setBounds(109, 204, 46, 14);
		frame.getContentPane().add(lblg_1);
		
		JLabel lblg_2 = new JLabel("0g");
		lblg_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_2.setBounds(217, 154, 46, 14);
		frame.getContentPane().add(lblg_2);
		
		JLabel lblg_3 = new JLabel("11g");
		lblg_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_3.setBounds(217, 179, 46, 14);
		frame.getContentPane().add(lblg_3);
		
		JLabel lblg_4 = new JLabel("7g");
		lblg_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_4.setBounds(217, 204, 46, 14);
		frame.getContentPane().add(lblg_4);
		
		JLabel lblg_5 = new JLabel("1.1g");
		lblg_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_5.setBounds(337, 154, 46, 14);
		frame.getContentPane().add(lblg_5);
		
		JLabel lblg_6 = new JLabel("13g");
		lblg_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_6.setBounds(337, 179, 46, 14);
		frame.getContentPane().add(lblg_6);
		
		JLabel lblg_7 = new JLabel("11g");
		lblg_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_7.setBounds(337, 204, 46, 14);
		frame.getContentPane().add(lblg_7);
		
		JLabel lblg_8 = new JLabel("0g");
		lblg_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_8.setBounds(461, 154, 46, 14);
		frame.getContentPane().add(lblg_8);
		
		JLabel lblg_9 = new JLabel("16g\r\n");
		lblg_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_9.setBounds(461, 179, 46, 14);
		frame.getContentPane().add(lblg_9);
		
		JLabel lblg_10 = new JLabel("4.2g");
		lblg_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblg_10.setBounds(461, 204, 46, 14);
		frame.getContentPane().add(lblg_10);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\apple (1).png"));
		label_4.setBounds(99, 244, 60, 64);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\baguette (2).png"));
		label_5.setBounds(212, 244, 77, 64);
		frame.getContentPane().add(label_5);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\carrot (1).png"));
		lblNewLabel_1.setBounds(326, 244, 70, 64);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ina\\Desktop\\icon\\orange (1).png"));
		lblNewLabel_2.setBounds(453, 244, 66, 64);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblApple = new JLabel("Apple");
		lblApple.setHorizontalAlignment(SwingConstants.CENTER);
		lblApple.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblApple.setBounds(109, 318, 46, 14);
		frame.getContentPane().add(lblApple);
		
		JLabel lblBread = new JLabel("Bread");
		lblBread.setHorizontalAlignment(SwingConstants.CENTER);
		lblBread.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblBread.setBounds(217, 319, 46, 14);
		frame.getContentPane().add(lblBread);
		
		JLabel lblCarrot = new JLabel("Carrot");
		lblCarrot.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarrot.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblCarrot.setBounds(337, 319, 46, 14);
		frame.getContentPane().add(lblCarrot);
		
		JLabel lblOrange = new JLabel("Orange");
		lblOrange.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrange.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblOrange.setBounds(461, 319, 46, 14);
		frame.getContentPane().add(lblOrange);
		
		JToggleButton tglbtnSuggestedFoods = new JToggleButton("Suggested Foods");
		tglbtnSuggestedFoods.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tglbtnSuggestedFoods.setBounds(0, 0, 127, 23);
		frame.getContentPane().add(tglbtnSuggestedFoods);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(539, 0, 17, 332);
		frame.getContentPane().add(scrollBar);
	}
}