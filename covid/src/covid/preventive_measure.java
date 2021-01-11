package covid;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class preventive_measure extends JFrame {

	private JPanel contentPane;
	static int point;
	static int[] array = new int[11];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preventive_measure frame = new preventive_measure();
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
	public preventive_measure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Preventive Measures");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblNewLabel_1 = new JLabel("Have you had contact with infected person ?");

		JLabel lblNewLabel_2 = new JLabel("Do you alaways wear a mask ?");

		JLabel lblNewLabel_3 = new JLabel("Do you wash your hands frequently ?");

		JLabel lblNewLabel_4 = new JLabel("Do you follow the social spacing ?");

		JLabel lblNewLabel_5 = new JLabel("Are you in closed places frequently ?");

		JLabel lblNewLabel_6 = new JLabel("Do you use anything personally collectively ?");

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Yes");

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Yes");

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Yes");

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Yes");

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Yes");

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("No");

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("No");

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("No");

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("No");

		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("No");

		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("No");

		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton.isSelected()) {
					rdbtnNewRadioButton_6.setSelected(false);
					array[0] = 1;
				}
			}
		});
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_6.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					array[1] = 0;
				}
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton_7.setSelected(false);
					array[2] = 1;
				}
			}
		});
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_7.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					array[3] = 0;
				}
			}
		});
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_2.isSelected()) {
					rdbtnNewRadioButton_8.setSelected(false);
					array[4] = 1;
				}
			}
		});
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_8.isSelected()) {
					rdbtnNewRadioButton_2.setSelected(false);
					array[5] = 0;
				}
			}
		});

		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_3.isSelected()) {
					rdbtnNewRadioButton_9.setSelected(false);
					array[6] = 1;
				}
			}
		});
		rdbtnNewRadioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_9.isSelected()) {
					rdbtnNewRadioButton_3.setSelected(false);		
					array[7] = 0;
				}
			}
		});
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_4.isSelected()) {
					rdbtnNewRadioButton_10.setSelected(false);		
					array[8] = 1;
				}

			}
		});
		rdbtnNewRadioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_10.isSelected()) {
					rdbtnNewRadioButton_4.setSelected(false);
		
					array[9] = 0;
				}
			}
		});
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_5.isSelected()) {
					rdbtnNewRadioButton_11.setSelected(false);
					
					array[10] = 1;
				}
			}
		});
		rdbtnNewRadioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_11.isSelected()) {
					rdbtnNewRadioButton_5.setSelected(false);
					array[10] = 0;
				}
			}
		});
		int total_array=0;
		for(int i = 0; i < array.length ; i ++) {
			total_array +=array[i];
		}
		System.out.println(total_array);

		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				syndrome Syn = new syndrome();
				Syn.setVisible(true);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_3).addComponent(lblNewLabel_4)
														.addComponent(lblNewLabel_5).addComponent(lblNewLabel_6)
														.addComponent(lblNewLabel_2).addComponent(lblNewLabel_1))
												.addGap(6)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtnNewRadioButton_2)
														.addComponent(rdbtnNewRadioButton_3)
														.addComponent(rdbtnNewRadioButton_4)
														.addComponent(rdbtnNewRadioButton_5)
														.addComponent(rdbtnNewRadioButton_1)
														.addComponent(rdbtnNewRadioButton))
												.addGap(14)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtnNewRadioButton_6)
														.addComponent(rdbtnNewRadioButton_7)
														.addComponent(rdbtnNewRadioButton_11)
														.addComponent(rdbtnNewRadioButton_10)
														.addComponent(rdbtnNewRadioButton_9)
														.addComponent(rdbtnNewRadioButton_8)
														.addComponent(btnNewButton))))
								.addContainerGap(81, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(lblNewLabel)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
						.addComponent(rdbtnNewRadioButton).addComponent(rdbtnNewRadioButton_6))
				.addGap(7)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
						.addComponent(rdbtnNewRadioButton_1).addComponent(rdbtnNewRadioButton_7))
				.addGap(10)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3)
						.addComponent(rdbtnNewRadioButton_2).addComponent(rdbtnNewRadioButton_8))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4)
								.addComponent(rdbtnNewRadioButton_3))
						.addComponent(rdbtnNewRadioButton_9))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_5)
						.addComponent(rdbtnNewRadioButton_4).addComponent(rdbtnNewRadioButton_10))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_6)
						.addComponent(rdbtnNewRadioButton_5).addComponent(rdbtnNewRadioButton_11))
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnNewButton).addGap(33)));
		contentPane.setLayout(gl_contentPane);
	}
}
