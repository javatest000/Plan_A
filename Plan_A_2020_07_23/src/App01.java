import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;

public class App01 {

	private final String ID = "a";
	private final String PWD = "b";

	private JFrame frame;
	private JTextField idField;
	private JPasswordField pwdField;
	private JPanel currPanel;
	private JTable table;
	private JTable table_1;
	private JTextField tf;

	int a, b, c, d, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, z;
	int sum;
	int abc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App01 window = new App01();
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
	public App01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImagePanel loginPanel = new ImagePanel(new ImageIcon("D:\\07_23 Im\\plan_a\\LogIn_Press_Panel.png").getImage());
		loginPanel.setBounds(0, 0, 5166, 3411);
		frame.getContentPane().add(loginPanel);
		currPanel = loginPanel;
		loginPanel.setBorder(null);
		frame.setSize(loginPanel.getDim());
		frame.setPreferredSize(loginPanel.getDim());

		loginPanel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 2542, 1369);
		loginPanel.add(lblNewLabel_1);

		idField = new JTextField();
		idField.setBounds(1199, 727, 260, 52);
		idField.setBackground(new Color(255, 255, 255));
		idField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		loginPanel.add(idField);
		idField.setColumns(10);
		idField.setBorder(null);

		pwdField = new JPasswordField();
		pwdField.setBackground(Color.WHITE);
		pwdField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pwdField.setBounds(1217, 814, 242, 52);
		pwdField.setBorder(null);
		loginPanel.add(pwdField);

		JButton btnLogin = new JButton("Log In");

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ID.equals(idField.getText()) && PWD.equals("b")) {
					currPanel.setVisible(false);
					// main_panel.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "You Failed to log in");
				}
			}
		});
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnLogin.setBounds(1165, 930, 260, 52);
		loginPanel.add(btnLogin);
		btnLogin.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\LogIn_btn.png"));
		btnLogin.setPressedIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\PressLogIn_btn.png"));

		JPanel main_panel = new JPanel();
		main_panel.setBorder(null);
		main_panel.setBounds(0, 0, 2542, 1369);
		frame.getContentPane().add(main_panel);
		main_panel.setBackground(Color.WHITE);
		main_panel.setLayout(null);
		main_panel.setVisible(true);

		JPanel button_panel = new JPanel();
		button_panel.setBounds(0, 0, 1652, 180);
		main_panel.add(button_panel);
		button_panel.setBorder(null);
		button_panel.setBackground(new Color(0, 0, 0, 0));
		button_panel.setLayout(null);

		JPanel rice_panel = new JPanel();
		rice_panel.setBorder(null);
		rice_panel.setBounds(0, 0, 1652, 1357);
		main_panel.add(rice_panel);
		rice_panel.setVisible(false);
		rice_panel.setBackground(new Color(0, 0, 0, 0));

		JPanel drink_panel = new JPanel();
		drink_panel.setBounds(0, 0, 1652, 1357);
		main_panel.add(drink_panel);
		drink_panel.setBorder(null);
		drink_panel.setLayout(null);
		drink_panel.setVisible(false);
		drink_panel.setBackground(new Color(0, 0, 0, 0));

		String columnName[] = { "", "", "" };

		Object rowData[][] = { { "ºñºö¹ä", a, 10000 }, { "ººÀ½¹ä", b, 9000 }, { "¼Ò°í±â µ¤¹ä", c, 4000 }, { "¼øµÎºÎ", d, 6000 },
				{ "½ºÆÄ°ÔÆ¼", z, 6000 }, { "½Å¶ó¸é", f, 4000 },

				{ "ÇÜ¹ö°Å", g, 3500 }, { "¿ë°¨ÇÑ ±è¹ä", h, 4000 }, { "È­´öÇÇÀÚ", i, 6000 }, { "Â¥ºü±¸¸®", j, 1900 },
				{ "»÷µåÀ§Ä¡", k, 5000 }, { "¹Ð¶±ººÀÌ", l, 2900 },

				{ "¸ÓÇÉ", m, 2000 }, { "¸¶Ä«·Õ", n, 1700 }, { "»õ¿ì±ø", o, 1500 }, { "»ø·¯µå", p, 5900 }, { "Çã´Ï¹öÅÍÄ¨", q, 2000 },
				{ "ÆËÄÜ", r, 3000 },

				{ "¿¡½ºÇÁ·¹¼Ò ´õºí ¼¦", s, 1260 }, { "¸¶½Å´Ù", t, 270 }, { "¸ÆÄÝ", u, 350 }, { "¼ÖÀÇ ´«", v, 300 },
				{ "ÄÜÆ®¶óº£ÀÌ½º", w, 760 }, { "ºñ¶ô½ÄÇý", x, 900 },

		};

		DefaultTableModel model = new DefaultTableModel(rowData, columnName);

		JSpinner spinner01 = new JSpinner();
		spinner01.setBounds(704, 384, 73, 45);
		rice_panel.add(spinner01);

		JSpinner spinner02 = new JSpinner();
		spinner02.setBounds(1450, 384, 73, 45);
		rice_panel.add(spinner02);

		JSpinner spinner03 = new JSpinner();
		spinner03.setBounds(704, 772, 73, 45);
		rice_panel.add(spinner03);

		JSpinner spinner04 = new JSpinner();
		spinner04.setBounds(1450, 772, 73, 45);
		rice_panel.add(spinner04);

		JSpinner spinner05 = new JSpinner();
		spinner05.setBounds(704, 1145, 73, 45);
		rice_panel.add(spinner05);

		JSpinner spinner06 = new JSpinner();
		spinner06.setBounds(1450, 1143, 73, 45);
		rice_panel.add(spinner06);

		JButton btnMenu02 = new JButton("");
		btnMenu02.setBounds(1383, 444, 140, 45);
		btnMenu02.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnMenu02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				b = (int) spinner02.getValue();
				abc = b * 9000;
				Object[] temp = { "ººÀ½¹ä", b, abc };
				model.addRow(temp);
			}
		});
		rice_panel.setLayout(null);

		JButton btnMenu01 = new JButton("");
		btnMenu01.setBounds(638, 444, 140, 45);
		rice_panel.add(btnMenu01);
		btnMenu01.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnMenu01.setBackground(Color.WHITE);

		btnMenu01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = (int) spinner01.getValue();

				abc = a * 10000;
				a = (int) spinner01.getValue();
				Object[] temp = { "ºñºö¹ä", a, abc };
				model.addRow(temp);
			}
		});
		btnMenu01.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMenu02.setBackground(Color.WHITE);
		btnMenu02.setFont(new Font("Tahoma", Font.BOLD, 40));
		rice_panel.add(btnMenu02);

		JButton btnMenu03 = new JButton("");
		btnMenu03.setBounds(638, 832, 140, 45);
		btnMenu03.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnMenu03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				c = (int) spinner03.getValue();
				abc = c * 4000;
				Object[] temp = { "¼Ò°í±â µ¤¹ä", c, abc };
				model.addRow(temp);

			}
		});
		btnMenu03.setBackground(Color.WHITE);
		btnMenu03.setFont(new Font("Tahoma", Font.BOLD, 40));
		rice_panel.add(btnMenu03);

		JButton btnMenu04 = new JButton("");
		btnMenu04.setBounds(1383, 832, 140, 45);
		btnMenu04.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnMenu04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d = (int) spinner04.getValue();
				abc = d * 6000;
				Object[] temp = { "¼øµÎºÎ", d, abc };
				model.addRow(temp);
			}
		});
		btnMenu04.setBackground(Color.WHITE);
		btnMenu04.setFont(new Font("Tahoma", Font.BOLD, 40));
		rice_panel.add(btnMenu04);

		JButton btnMenu05 = new JButton("");
		btnMenu05.setBounds(638, 1203, 140, 45);
		btnMenu05.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnMenu05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				z = (int) spinner05.getValue();
				abc = z * 6000;
				Object[] temp = { "½ºÆÄ°ÔÆ¼", z, abc };
				model.addRow(temp);
			}
		});
		btnMenu05.setBackground(Color.WHITE);
		btnMenu05.setFont(new Font("Tahoma", Font.BOLD, 40));
		rice_panel.add(btnMenu05);

		JButton btnMenu06 = new JButton("");
		btnMenu06.setBounds(1383, 1203, 140, 45);
		btnMenu06.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnMenu06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f = (int) spinner06.getValue();
				abc = f * 4000;
				Object[] temp = { "½Å¶ó¸é", f, abc };
				model.addRow(temp);
			}
		});
		btnMenu06.setBackground(Color.WHITE);
		btnMenu06.setFont(new Font("Tahoma", Font.BOLD, 40));
		rice_panel.add(btnMenu06);

		JLabel lblNewLabel_25_3_1_1 = new JLabel("");
		lblNewLabel_25_3_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_3_1_1.setBounds(638, 384, 73, 45);
		rice_panel.add(lblNewLabel_25_3_1_1);

		JLabel lblNewLabel_26_3_1_1 = new JLabel("");
		lblNewLabel_26_3_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_3_1_1.setBounds(1378, 384, 73, 45);
		rice_panel.add(lblNewLabel_26_3_1_1);

		JLabel lblNewLabel_25_1_1_1_1 = new JLabel("");
		lblNewLabel_25_1_1_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_1_1_1_1.setBounds(638, 772, 73, 45);
		rice_panel.add(lblNewLabel_25_1_1_1_1);

		JLabel lblNewLabel_26_1_1_1_1 = new JLabel("");
		lblNewLabel_26_1_1_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_1_1_1_1.setBounds(1378, 773, 73, 45);
		rice_panel.add(lblNewLabel_26_1_1_1_1);

		JLabel lblNewLabel_25_2_1_1_1 = new JLabel("");
		lblNewLabel_25_2_1_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_2_1_1_1.setBounds(638, 1143, 73, 45);
		rice_panel.add(lblNewLabel_25_2_1_1_1);

		JLabel lblNewLabel_26_2_1_1_1 = new JLabel("");
		lblNewLabel_26_2_1_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_2_1_1_1.setBounds(1378, 1143, 73, 45);
		rice_panel.add(lblNewLabel_26_2_1_1_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(120, 192, 700, 331);
		rice_panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\01_\uC2DD\uC0AC\uB958_\uBE44\uBE54\uBC25.png"));

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\01_\uC2DD\uC0AC\uB958_\uBCF6\uC74C\uBC25.png"));
		lblNewLabel_2.setBounds(865, 192, 700, 331);
		rice_panel.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(
				new ImageIcon("D:\\07_23 Im\\plan_a\\01_\uC2DD\uC0AC\uB958_\uC18C\uACE0\uAE30 \uB36E\uBC25.png"));
		lblNewLabel_4.setBounds(120, 581, 700, 331);
		rice_panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\01_\uC2DD\uC0AC\uB958_\uC21C\uB450\uBD80.png"));
		lblNewLabel_5.setBounds(865, 581, 700, 331);
		rice_panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6
				.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\01_\uC2DD\uC0AC\uB958_\uC2A4\uD30C\uAC8C\uD2F0.png"));
		lblNewLabel_6.setBounds(120, 952, 700, 331);
		rice_panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\01_\uC2DD\uC0AC\uB958_\uC2E0\uB77C\uBA74.png"));
		lblNewLabel_7.setBounds(865, 952, 700, 331);
		rice_panel.add(lblNewLabel_7);

		JSpinner spinner31 = new JSpinner();
		spinner31.setBounds(700, 381, 73, 45);
		drink_panel.add(spinner31);

		JButton btnDrink01 = new JButton("");
		btnDrink01.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnDrink01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] temp = { 7, "New button", 1, 1700 };
				model.addRow(temp);
				s = (int) spinner31.getValue();

			}
		});
		// count_panel.setLayout(null);

		JSpinner spinner32 = new JSpinner();
		spinner32.setBounds(700, 769, 73, 45);
		drink_panel.add(spinner32);

		JSpinner spinner33 = new JSpinner();
		spinner33.setBounds(1455, 381, 73, 45);
		drink_panel.add(spinner33);

		JSpinner spinner34 = new JSpinner();
		spinner34.setBounds(1455, 769, 73, 45);
		drink_panel.add(spinner34);

		JSpinner spinner35 = new JSpinner();
		spinner35.setBounds(700, 1144, 73, 45);
		drink_panel.add(spinner35);

		JSpinner spinner36 = new JSpinner();
		spinner36.setBounds(1455, 1144, 73, 45);
		drink_panel.add(spinner36);

		btnDrink01.setBackground(Color.WHITE);
		btnDrink01.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDrink01.setBounds(633, 441, 140, 45);
		drink_panel.add(btnDrink01);

		JButton btnDrink03 = new JButton("");
		btnDrink03.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnDrink03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Object[] temp = { 9, "New button", 1, 1700 };
				model.addRow(temp);
				u = (int) spinner33.getValue();

			}
		});
		btnDrink03.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDrink03.setBackground(Color.WHITE);
		btnDrink03.setBounds(633, 829, 140, 45);
		drink_panel.add(btnDrink03);

		JButton btnDrink05 = new JButton("");
		btnDrink05.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnDrink05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Object[] temp = { 11, "New button", 1, 1700 };
				model.addRow(temp);
				w = (int) spinner34.getValue();

			}
		});
		btnDrink05.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDrink05.setBackground(Color.WHITE);
		btnDrink05.setBounds(633, 1207, 140, 45);
		drink_panel.add(btnDrink05);

		JButton btnDrink02 = new JButton("");
		btnDrink02.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnDrink02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] temp = { 8, "New button", 1, 1700 };
				model.addRow(temp);
				t = (int) spinner32.getValue();

			}
		});
		btnDrink02.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDrink02.setBackground(Color.WHITE);
		btnDrink02.setBounds(1386, 441, 140, 45);
		drink_panel.add(btnDrink02);

		JButton btnDrink04 = new JButton("");
		btnDrink04.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnDrink04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Object[] temp = { 10, "New button", 1, 1700 };
				model.addRow(temp);
				v = (int) spinner33.getValue();

			}
		});
		btnDrink04.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDrink04.setBackground(Color.WHITE);
		btnDrink04.setBounds(1386, 829, 140, 45);
		drink_panel.add(btnDrink04);

		JButton btnDrink06 = new JButton("");
		btnDrink06.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnDrink06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] temp = { 12, "New button", 1, 1700 };
				model.addRow(temp);
				x = (int) spinner35.getValue();

			}
		});
		btnDrink06.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDrink06.setBackground(Color.WHITE);
		btnDrink06.setBounds(1386, 1207, 140, 45);
		drink_panel.add(btnDrink06);

		JLabel lblNewLabel_25_3_1 = new JLabel("");
		lblNewLabel_25_3_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_3_1.setBounds(633, 381, 73, 45);
		drink_panel.add(lblNewLabel_25_3_1);

		JLabel lblNewLabel_26_3_1 = new JLabel("");
		lblNewLabel_26_3_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_3_1.setBounds(1385, 381, 73, 45);
		drink_panel.add(lblNewLabel_26_3_1);

		JLabel lblNewLabel_25_1_1_1 = new JLabel("");
		lblNewLabel_25_1_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_1_1_1.setBounds(633, 769, 73, 45);
		drink_panel.add(lblNewLabel_25_1_1_1);

		JLabel lblNewLabel_26_1_1_1 = new JLabel("");
		lblNewLabel_26_1_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_1_1_1.setBounds(1385, 770, 73, 45);
		drink_panel.add(lblNewLabel_26_1_1_1);

		JLabel lblNewLabel_25_2_1_1 = new JLabel("");
		lblNewLabel_25_2_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_2_1_1.setBounds(633, 1144, 73, 45);
		drink_panel.add(lblNewLabel_25_2_1_1);

		JLabel lblNewLabel_26_2_1_1 = new JLabel("");
		lblNewLabel_26_2_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_2_1_1.setBounds(1385, 1144, 73, 45);
		drink_panel.add(lblNewLabel_26_2_1_1);

		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\04_\uC74C\uB8CC\uB958_\uB354\uBE14 \uC0F7.png"));
		lblNewLabel_19.setBounds(117, 191, 700, 331);
		drink_panel.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\04_\uC74C\uB8CC\uB958_\uB9C8\uC2E0\uB2E4.png"));
		lblNewLabel_20.setBounds(868, 191, 700, 331);
		drink_panel.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\04_\uC74C\uB8CC\uB958_\uB9E5\uCF5C.png"));
		lblNewLabel_21.setBounds(117, 579, 700, 331);
		drink_panel.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\04_\uC74C\uB8CC\uB958_\uC194\uC758 \uB208.png"));
		lblNewLabel_22.setBounds(868, 579, 700, 331);
		drink_panel.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setIcon(
				new ImageIcon("D:\\07_23 Im\\plan_a\\04_\uC74C\uB8CC\uB958_\uCF58\uD2B8\uB77C\uBCA0\uC774\uC2A4.png"));
		lblNewLabel_23.setBounds(117, 953, 700, 331);
		drink_panel.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24
				.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\04_\uC74C\uB8CC\uB958_\uBE44\uB77D\uC2DD\uD61C.png"));
		lblNewLabel_24.setBounds(868, 953, 700, 331);
		drink_panel.add(lblNewLabel_24);

		JPanel snak2_panel = new JPanel();
		snak2_panel.setBorder(null);
		snak2_panel.setBackground(new Color(0, 0, 0, 0));
		snak2_panel.setBounds(0, 0, 1652, 1357);
		main_panel.add(snak2_panel);
		snak2_panel.setLayout(null);

		JSpinner spinner22 = new JSpinner();
		spinner22.setBounds(702, 776, 73, 37);
		snak2_panel.add(spinner22);

		JButton btnSSnak02 = new JButton("");
		btnSSnak02.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSSnak02.setBounds(1380, 443, 140, 45);
		btnSSnak02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = (int) spinner22.getValue();
				abc = n*1700;
				Object[] temp = { "¸¶Ä«·Õ", n, abc };
				model.addRow(temp);
			}
		});

		JSpinner spinner21 = new JSpinner();
		spinner21.setBounds(702, 387, 73, 37);
		snak2_panel.add(spinner21);

		JSpinner spinner23 = new JSpinner();
		spinner23.setBounds(1442, 387, 78, 37);
		snak2_panel.add(spinner23);

		JSpinner spinner24 = new JSpinner();
		spinner24.setBounds(1447, 776, 73, 37);
		snak2_panel.add(spinner24);

		JSpinner spinner25 = new JSpinner();
		spinner25.setBounds(702, 1148, 73, 37);
		snak2_panel.add(spinner25);

		JSpinner spinner26 = new JSpinner();
		spinner26.setBounds(1447, 1148, 73, 37);
		snak2_panel.add(spinner26);

		JButton btnSSnak01 = new JButton("");
		btnSSnak01.setBounds(635, 443, 140, 45);
		snak2_panel.add(btnSSnak01);
		btnSSnak01.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSSnak01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m = (int) spinner21.getValue();
				abc = m * 2000;
				Object[] temp = { "¸ÓÇÉ", m, abc };
				model.addRow(temp);
			}
		});
		btnSSnak01.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSSnak01.setBackground(Color.WHITE);
		btnSSnak02.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSSnak02.setBackground(Color.WHITE);
		snak2_panel.add(btnSSnak02);

		JButton btnSSnak03 = new JButton("");
		btnSSnak03.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSSnak03.setBounds(635, 833, 140, 45);
		btnSSnak03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o = (int) spinner23.getValue();
				abc = o*1500;
				Object[] temp = { "»õ¿ì±ø", o, abc };
				model.addRow(temp);
			}
		});
		btnSSnak03.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSSnak03.setBackground(Color.WHITE);
		snak2_panel.add(btnSSnak03);

		JButton btnSSnak04 = new JButton("");
		btnSSnak04.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSSnak04.setBounds(1380, 833, 140, 45);
		btnSSnak04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o = (int) spinner23.getValue();
				abc = o*1500;
				Object[] temp = {"»ø·¯µå", p, 5900};
				model.addRow(temp);
			}
		});
		btnSSnak04.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSSnak04.setBackground(Color.WHITE);
		snak2_panel.add(btnSSnak04);

		JButton btnSSnak05 = new JButton("");
		btnSSnak05.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSSnak05.setBounds(635, 1206, 140, 45);
		btnSSnak05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] temp = { 23, "New button", 1, 1700 };
				model.addRow(temp);
				q = (int) spinner25.getValue();
			}
		});
		btnSSnak05.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSSnak05.setBackground(Color.WHITE);
		snak2_panel.add(btnSSnak05);

		JButton btnSSnak06 = new JButton("");
		btnSSnak06.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSSnak06.setBounds(1380, 1206, 140, 45);
		btnSSnak06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] temp = { 24, "New button", 1, 1700 };
				model.addRow(temp);
				r = (int) spinner26.getValue();

			}
		});
		btnSSnak06.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSSnak06.setBackground(Color.WHITE);
		snak2_panel.add(btnSSnak06);

		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25.setBounds(630, 383, 73, 45);
		snak2_panel.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26.setBounds(1369, 383, 73, 45);
		snak2_panel.add(lblNewLabel_26);

		JLabel lblNewLabel_25_1 = new JLabel("New label");
		lblNewLabel_25_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_1.setBounds(635, 772, 73, 45);
		snak2_panel.add(lblNewLabel_25_1);

		JLabel lblNewLabel_26_1 = new JLabel("New label");
		lblNewLabel_26_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_1.setBounds(1369, 772, 73, 45);
		snak2_panel.add(lblNewLabel_26_1);

		JLabel lblNewLabel_25_2 = new JLabel("New label");
		lblNewLabel_25_2.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_2.setBounds(630, 1144, 73, 45);
		snak2_panel.add(lblNewLabel_25_2);

		JLabel lblNewLabel_26_2 = new JLabel("New label");
		lblNewLabel_26_2.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_2.setBounds(1380, 1144, 73, 45);
		snak2_panel.add(lblNewLabel_26_2);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\03_\uAC04\uC2DD\uB958_\uB9C8\uCE74\uB871.png"));
		lblNewLabel.setBounds(863, 192, 700, 331);
		snak2_panel.add(lblNewLabel);

		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\03_\uAC04\uC2DD\uB958_\uBA38\uD540.png"));
		lblNewLabel_14.setBounds(117, 192, 700, 331);
		snak2_panel.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\03_\uAC04\uC2DD\uB958_\uC0D0\uB7EC\uB4DC.png"));
		lblNewLabel_15.setBounds(863, 582, 700, 331);
		snak2_panel.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\03_\uAC04\uC2DD\uB958_\uC0C8\uC6B0\uAE61.png"));
		lblNewLabel_16.setBounds(117, 582, 700, 331);
		snak2_panel.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\03_\uAC04\uC2DD\uB958_\uD31D\uCF58.png"));
		lblNewLabel_17.setBounds(863, 955, 700, 331);
		snak2_panel.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setIcon(
				new ImageIcon("D:\\07_23 Im\\plan_a\\03_\uAC04\uC2DD\uB958_\uD5C8\uB2C8\uBC84\uD130\uCE69.png"));
		lblNewLabel_18.setBounds(117, 955, 700, 331);
		snak2_panel.add(lblNewLabel_18);

		JPanel snak_panel = new JPanel();
		snak_panel.setBounds(0, 0, 1652, 1357);
		snak_panel.setBorder(null);
		main_panel.add(snak_panel);
		snak_panel.setLayout(null);
		snak_panel.setVisible(false);
		snak_panel.setBackground(new Color(0, 0, 0, 0));

		JSpinner spinner11 = new JSpinner();
		spinner11.setBounds(700, 384, 73, 45);
		snak_panel.add(spinner11);

		JButton btnSnak01 = new JButton("");
		btnSnak01.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSnak01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				g = (int) spinner11.getValue();
				abc = g * 3500;
				Object[] temp = { "ÇÜ¹ö°Å", g, 3500 };
				model.addRow(temp);

			}
		});

		JSpinner spinner12 = new JSpinner();
		spinner12.setBounds(700, 772, 73, 45);
		snak_panel.add(spinner12);

		JSpinner spinner13 = new JSpinner();
		spinner13.setBounds(1452, 384, 73, 45);
		snak_panel.add(spinner13);

		JSpinner spinner14 = new JSpinner();
		spinner14.setBounds(1452, 772, 73, 45);
		snak_panel.add(spinner14);

		JSpinner spinner15 = new JSpinner();
		spinner15.setBounds(700, 1147, 73, 45);
		snak_panel.add(spinner15);

		JSpinner spinner16 = new JSpinner();
		spinner16.setBounds(1452, 1147, 73, 45);
		snak_panel.add(spinner16);

		btnSnak01.setForeground(Color.BLACK);
		btnSnak01.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSnak01.setBackground(Color.WHITE);
		btnSnak01.setBounds(637, 444, 140, 45);
		snak_panel.add(btnSnak01);

		JButton btnSnak02 = new JButton("");
		btnSnak02.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSnak02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				h = (int) spinner12.getValue();
				abc = h * 4000;
				Object[] temp = { "¿ë°¨ÇÑ ±è¹ä", h, abc };
				model.addRow(temp);
			}
		});
		btnSnak02.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSnak02.setBackground(Color.WHITE);
		btnSnak02.setBounds(1385, 444, 140, 45);
		snak_panel.add(btnSnak02);

		JButton btnSnak03 = new JButton("");
		btnSnak03.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSnak03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				i = (int) spinner13.getValue();
				abc = i * 6000;
				Object[] temp = { "È­´öÇÇÀÚ", i, abc };
				model.addRow(temp);

			}
		});
		btnSnak03.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSnak03.setBackground(Color.WHITE);
		btnSnak03.setBounds(637, 832, 140, 45);
		snak_panel.add(btnSnak03);

		JButton btnSnak04 = new JButton("");
		btnSnak04.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSnak04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j = (int) spinner14.getValue();
				abc = j * 1900;
				Object[] temp = { "Â¥ºü±¸¸®", j, 1900 };
				model.addRow(temp);
			}
		});
		btnSnak04.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSnak04.setBackground(Color.WHITE);
		btnSnak04.setBounds(1385, 832, 140, 45);
		snak_panel.add(btnSnak04);

		JButton btnSnak05 = new JButton("");
		btnSnak05.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSnak05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				k = (int) spinner15.getValue();
				abc = k * 5000;
				Object[] temp = { "»÷µåÀ§Ä¡", k, abc };
				model.addRow(temp);

			}
		});
		btnSnak05.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSnak05.setBackground(Color.WHITE);
		btnSnak05.setBounds(637, 1203, 140, 45);
		snak_panel.add(btnSnak05);

		JButton btnSnak06 = new JButton("");
		btnSnak06.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uC544\uD2B8\uBCF4\uB4DC \u2013 3.png"));
		btnSnak06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				l = (int) spinner16.getValue();
				abc = l * 2900;
				Object[] temp = { "¹Ð¶±ººÀÌ", l, abc };
				model.addRow(temp);
			}
		});
		btnSnak06.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSnak06.setBackground(Color.WHITE);
		btnSnak06.setBounds(1385, 1203, 140, 45);
		snak_panel.add(btnSnak06);

		JLabel lblNewLabel_25_3 = new JLabel("");
		lblNewLabel_25_3.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_3.setBounds(624, 384, 73, 45);
		snak_panel.add(lblNewLabel_25_3);

		JLabel lblNewLabel_26_3 = new JLabel("");
		lblNewLabel_26_3.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_3.setBounds(1376, 384, 73, 45);
		snak_panel.add(lblNewLabel_26_3);

		JLabel lblNewLabel_25_1_1 = new JLabel("");
		lblNewLabel_25_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_1_1.setBounds(624, 772, 73, 45);
		snak_panel.add(lblNewLabel_25_1_1);

		JLabel lblNewLabel_26_1_1 = new JLabel("");
		lblNewLabel_26_1_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_1_1.setBounds(1376, 773, 73, 45);
		snak_panel.add(lblNewLabel_26_1_1);

		JLabel lblNewLabel_25_2_1 = new JLabel("");
		lblNewLabel_25_2_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_25_2_1.setBounds(624, 1147, 73, 45);
		snak_panel.add(lblNewLabel_25_2_1);

		JLabel lblNewLabel_26_2_1 = new JLabel("");
		lblNewLabel_26_2_1.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn.png"));
		lblNewLabel_26_2_1.setBounds(1376, 1147, 73, 45);
		snak_panel.add(lblNewLabel_26_2_1);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\02_\uC2DD\uC0AC\uB958_\uD584\uBC84\uAC70.png"));
		lblNewLabel_8.setBounds(119, 192, 700, 331);
		snak_panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\02_\uC2DD\uC0AC\uB958_\uAE40\uBC25.png"));
		lblNewLabel_9.setBounds(868, 192, 700, 331);
		snak_panel.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10
				.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\02_\uC2DD\uC0AC\uB958_\uD654\uB355\uD53C\uC790.png"));
		lblNewLabel_10.setBounds(119, 580, 700, 331);
		snak_panel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11
				.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\02_\uC2DD\uC0AC\uB958_\uC9DC\uD30C\uAD6C\uB9AC.png"));
		lblNewLabel_11.setBounds(868, 580, 700, 331);
		snak_panel.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12
				.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\02_\uC2DD\uC0AC\uB958_\uC0CC\uB4DC\uC704\uCE58.png"));
		lblNewLabel_12.setBounds(119, 952, 700, 331);
		snak_panel.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13
				.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\02_\uC2DD\uC0AC\uB958_\uBC00\uB5A1\uBCF6\uC774.png"));
		lblNewLabel_13.setBounds(868, 952, 700, 331);
		snak_panel.add(lblNewLabel_13);

		JButton btn1 = new JButton("");
		btn1.setBounds(52, 23, 378, 117);
		button_panel.add(btn1);
		btn1.setBorder(null);
		btn1.setBackground(new Color(0, 0, 0, 0));
		btn1.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\01_menu_btn.png"));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rice_panel.setVisible(true);
				snak_panel.setVisible(false);
				snak2_panel.setVisible(false);
				drink_panel.setVisible(false);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));

		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\02_menu_btn.png"));
		btn2.setBounds(454, 23, 378, 117);
		button_panel.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rice_panel.setVisible(false);
				drink_panel.setVisible(true);
				snak_panel.setVisible(false);
				snak2_panel.setVisible(false);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));

		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\03_menu_btn.png"));
		btn3.setBounds(846, 23, 378, 118);
		button_panel.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rice_panel.setVisible(false);
				drink_panel.setVisible(false);
				snak_panel.setVisible(true);
				snak2_panel.setVisible(false);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));

		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\04_menu_btn.png"));
		btn4.setBounds(1244, 23, 378, 117);
		button_panel.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rice_panel.setVisible(false);
				drink_panel.setVisible(false);
				snak_panel.setVisible(false);
				snak2_panel.setVisible(true);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));

		JPanel count_panel = new JPanel();
		count_panel.setBounds(1669, 355, 830, 990);
		main_panel.add(count_panel);
		count_panel.setBackground(new Color(0, 0, 0, 0));
		table_1 = new JTable();
		table_1.setBounds(27, 30, 0, 0);
		table_1.setBackground(Color.WHITE);

		JTable jTable = new JTable(model);
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setBackground(new Color(0, 0, 0, 0));
		jScrollPane.setBounds(58, 143, 715, 460);
		count_panel.setVisible(true);
		count_panel.setLayout(null);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\07_23 Im\\photo_2020-07-24_14-12-12.jpg"));
		label_1.setBounds(43, 15, 750, 80);
		count_panel.add(label_1);

		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uBA54\uB274_btn.png"));
		lblNewLabel_27.setBounds(58, 111, 240, 33);
		count_panel.add(lblNewLabel_27);

		JLabel lblNewLabel_28 = new JLabel("New label");
		lblNewLabel_28.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn \u2013 1.png"));
		lblNewLabel_28.setBounds(299, 111, 240, 33);
		count_panel.add(lblNewLabel_28);

		JLabel lblNewLabel_29 = new JLabel("New label");
		lblNewLabel_29.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uAC00\uACA9_btn.png"));
		lblNewLabel_29.setBounds(533, 111, 240, 33);
		count_panel.add(lblNewLabel_29);

		JLabel lblSum = new JLabel("");
		lblSum.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uC218\uB7C9_btn \u2013 1.png"));
		lblSum.setForeground(Color.PINK);
		lblSum.setBounds(58, 672, 715, 128);
		lblSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblSum.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSum.setBackground(Color.PINK);
		count_panel.add(lblSum);
		count_panel.add(table_1);
		count_panel.add(jScrollPane);

		JButton btnCu = new JButton("");
		btnCu.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\\uACB0\uC81C_\uCFE0\uD3F0_btn.png"));
		btnCu.setBounds(61, 842, 150, 100);
		btnCu.setBackground(new Color(0, 0, 0, 0));
		count_panel.add(btnCu);
		btnCu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn1 = new JButton("");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						JButton btn1 = (JButton) e.getSource();
						jTable.setValueAt(0, jTable.getSelectedRow(), 2);
					}
				});
			}
		});
		btnCu.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JButton btnSel = new JButton("");
		btnSel.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\\uACB0\uC81C_\uACB0\uC81C_btn.png"));
		btnSel.setBounds(623, 842, 150, 100);
		count_panel.add(btnSel);
		btnSel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSel.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JButton btnCancel = new JButton("");
		btnCancel.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\\uACB0\uC81C_\uCDE8\uC18C_btn.png"));
		btnCancel.setBounds(244, 842, 150, 100);
		count_panel.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton btn3 = new JButton("Total Cancel");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						JButton btn3 = (JButton) e.getSource();
						DefaultTableModel m = (DefaultTableModel) jTable.getModel();

						m.setRowCount(0);
						tf.setText(String.valueOf(""));
						String str = String.format("%,d", sum);
						tf.setText(str + "  won");
						tf.setFont(new Font("Tahoma", Font.BOLD, 30));
					}
				});
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JButton btnPay = new JButton("");
		btnPay.setIcon(new ImageIcon("D:\\07_23 Im\\BTN\\\uACB0\uC81C_\uC120\uD0DD\uCDE8\uC18C_btn.png"));
		btnPay.setBounds(437, 842, 150, 100);
		count_panel.add(btnPay);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\07_23 Im\\\uACB0\uC81C\uCC3D_btn\\\uACB0\uC81C\uCC3D.png"));
		label.setBounds(0, 0, 830, 990);
		count_panel.add(label);

		JLabel main_panel_1 = new JLabel("New label");
		main_panel_1.setBorder(null);
		main_panel_1.setBounds(0, 0, 2542, 1369);
		main_panel.add(main_panel_1);
		main_panel_1.setIcon(new ImageIcon("D:\\07_23 Im\\plan_a\\\uBC30\uACBD.png"));

		table = new JTable();
		frame.setLocationRelativeTo(null);
		frame.setJMenuBar(menuBar());
		frame.pack();
	}

	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		bar.add(fileMenu);
		bar.add(aboutMenu);
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(openFile);
		fileMenu.addSeparator();
		fileMenu.add(exit);

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		return bar;
	}
}
