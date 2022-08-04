import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class Kayit extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kayit frame = new Kayit();
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
	public Kayit() {
		setFont(new Font("Dialog", Font.BOLD, 13));
		setTitle("Kayıt Ol");
		setIconImage(Toolkit.getDefaultToolkit().
				getImage("D:\\B\\Codes\\JavaProjects\\Train\\m_logo.png"));
		setBackground(new Color(255, 255, 255));
		setForeground(Color.DARK_GRAY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(154, 90, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\logo.png"));
		lblNewLabel_2.setBounds(122, -16, 253, 127);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(85, 90, 354, 2);
		contentPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(85, 272, 354, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Kayıt Ol");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(170, 289, 205, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblEposta = new JLabel("E-Posta");
		lblEposta.setForeground(new Color(0, 0, 153));
		lblEposta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEposta.setBackground(Color.WHITE);
		lblEposta.setBounds(85, 103, 101, 31);
		contentPane.add(lblEposta);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), Color.BLACK, Color.BLACK));
		textField.setBounds(184, 104, 185, 31);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanıcı Adı ");
		lblNewLabel_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(85, 142, 101, 35);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), Color.BLACK, Color.BLACK));
		textField_1.setBounds(184, 145, 185, 31);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Arial", Font.PLAIN, 11));
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), Color.BLACK, Color.BLACK));
		passwordField.setBounds(184, 188, 185, 31);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setFont(new Font("Arial", Font.PLAIN, 11));
		passwordField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), Color.BLACK, Color.BLACK));
		passwordField_1.setBounds(184, 230, 185, 31);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Şifre");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 153));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(85, 185, 101, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Şifre Tekrar");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 153));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(85, 227, 101, 35);
		contentPane.add(lblNewLabel_1_2);
	}
}
