package covid;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class personal_info extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static int infection;
	static int infection_city;
	static int[] point = new int[2];
	boolean flag = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personal_info frame = new personal_info();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public personal_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Personal Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(SystemColor.desktop);

		JLabel lblNewLabel_1 = new JLabel("Name : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});

		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_1 = new JTextField();

		textField_1.setColumns(10);

		JLabel lblJob = new JLabel("Job : ");
		lblJob.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Doctor", "nurse", "Engineer", "site Engineer",
				"Teacher", "Professor", "worker", "developer", "lawyer", "salesman", "tour guide", "student" }));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String job = (String) comboBox.getSelectedItem();

				switch (job) {
				case "Doctor":
					infection = 9;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "nurse":
					infection = 10;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "Engineer":
					infection = 3;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "site Engineer":
					infection = 5;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "Teacher":
					infection = 8;
					point[0] = infection;
					System.out.println(point[0]);
					break;

				case "Professor":
					infection = 6;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "worker":
					infection = 7;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "developer":
					infection = 3;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "lawyer":
					infection = 6;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "salesman":
					infection = 8;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "tour guide":
					infection = 9;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				case "student":
					infection = 7;
					point[0] = infection;
					System.out.println(point[0]);
					break;
				}

			}
		});

		comboBox.setSelectedIndex(0);

		JLabel lblCity = new JLabel("City : ");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "Cairo", "Alexandria", "Giza", "Suez",
				"Ismailia", "Port said", "Sharika", "Dakahlia", "October" }));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String city = (String) comboBox_1.getSelectedItem();
				
					switch (city) {
					case "Cairo":
						infection_city = 5;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "Alexandria":
						infection_city = 5;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "Giza":
						infection_city = 3;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "suez":
						infection_city = 2;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "Ismailia":
						infection = 1;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "Port said":
						infection_city = 1;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "Sharika":
						infection_city = 3;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "Dakahlia":
						infection_city = 3;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;
					case "October":
						infection_city = 4;
						point[1] = infection_city;
						System.out.println(point[1]);
						break;	
					
				}
					int total_points = point[0]+point[1];
					System.out.println("Total points is : " + total_points);
			}
		});
		

		comboBox_1.setSelectedIndex(0);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				preventive_measure preventive = new preventive_measure();
				preventive.setVisible(true);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(20).addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblGender)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnNewRadioButton)
										.addGap(18).addComponent(rdbtnNewRadioButton_1))
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblNewLabel_1).addGap(18)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 136,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblAge)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textField_1,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblJob).addGap(18)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblCity).addGap(18)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap(207, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(313, Short.MAX_VALUE).addComponent(btnNext).addGap(56)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap().addComponent(lblNewLabel).addGap(18)
				.addGroup(gl_contentPane
						.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1).addComponent(textField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(10)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblGender)
						.addComponent(rdbtnNewRadioButton).addComponent(rdbtnNewRadioButton_1))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblAge).addComponent(
						textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblJob))
				.addGap(21)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCity))
				.addGap(10).addComponent(btnNext).addContainerGap(20, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
		
	}
}
