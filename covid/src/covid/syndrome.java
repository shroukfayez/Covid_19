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

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class syndrome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					syndrome frame = new syndrome();
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
	public syndrome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Syndrome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Fever");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Nominate");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Congestion in the falsehood");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Lethargy");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Lack of concentration");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Difficulty breathing");
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Loss of smell and taste");
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Mucus");
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Change in skin color");
		
		
		
		JButton btnNewButton = new JButton("Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Result result = new Result();
				result.setVisible(true);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_4)
								.addComponent(chckbxNewCheckBox_1)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxNewCheckBox_3)
								.addComponent(chckbxNewCheckBox_2))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_6)
										.addComponent(chckbxNewCheckBox_5)
										.addComponent(chckbxNewCheckBox_7)
										.addComponent(chckbxNewCheckBox_8))
									.addGap(24))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewButton)
									.addGap(14)))))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxNewCheckBox_5))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_1)
						.addComponent(chckbxNewCheckBox_6))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_2)
						.addComponent(chckbxNewCheckBox_7))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_3)
						.addComponent(chckbxNewCheckBox_8))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(chckbxNewCheckBox_4)
							.addContainerGap(20, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
