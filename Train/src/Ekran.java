import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Desktop;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ekran extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ekran frame = new Ekran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Ekran() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\B\\Codes\\JavaProjects\\Train\\m_logo.png"));
		setBackground(new Color(255, 255, 255));
		setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		setTitle("Metro App");
		getContentPane().setLayout(null);
		
		JPanel Ekran = new JPanel();
		Ekran.setBackground(new Color(0, 0, 128));
		Ekran.setBounds(0, 0, 584, 411);
		getContentPane().add(Ekran);
		Ekran.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 564, 258);
		Ekran.add(panel);
		panel.setLayout(null);
		
		JButton web = new JButton("");
		web.setBounds(79, 168, 50, 50);
		panel.add(web);
		web.setBorderPainted(false);
		web.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.metro.istanbul/").toURI());
				}
				catch (Exception m) {}
			
			}
		});
		web.setForeground(new Color(204, 255, 255));
		web.setBackground(Color.WHITE);
		web.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\web.png"));
		
		JButton map = new JButton("");
		map.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.metro.istanbul/YolcuHizmetleri/AgHaritalari").toURI());
				}
				catch (Exception m) {}
			}
		});
		map.setBounds(175, 168, 68, 50);
		panel.add(map);
		map.setBorderPainted(false);
		map.setBackground(Color.WHITE);
		map.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\map.png"));
		
		JButton contact = new JButton("");
		contact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://cozummerkezi.ibb.istanbul/application/cozummerkezi").toURI());
				}
				catch (Exception m) {}
				
			}
		});
		contact.setBounds(293, 168, 50, 50);
		panel.add(contact);
		contact.setBackground(Color.WHITE);
		contact.setBorderPainted(false);
		contact.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\mail.png"));
		
		JButton exit = new JButton("");
		exit.setBounds(387, 168, 50, 50);
		panel.add(exit);
		exit.setBorderPainted(false);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame Giris = new Giris(); 
				Giris.show(); 
				
				dispose();
			}
		});
		exit.setBackground(Color.WHITE);
		exit.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\exit.png"));
		
		JLabel lblExit = new JLabel("Çıkış");
		lblExit.setBounds(397, 221, 68, 32);
		panel.add(lblExit);
		lblExit.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblContact = new JLabel("İletişim");
		lblContact.setBounds(293, 219, 75, 36);
		panel.add(lblContact);
		lblContact.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblMap = new JLabel("Metro Haritası");
		lblMap.setBounds(172, 219, 95, 36);
		panel.add(lblMap);
		lblMap.setHorizontalTextPosition(SwingConstants.LEFT);
		lblMap.setHorizontalAlignment(SwingConstants.LEFT);
		lblMap.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblWeb = new JLabel("Web Sayfası");
		lblWeb.setBounds(68, 219, 94, 36);
		panel.add(lblWeb);
		lblWeb.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\metro.png"));
		lblNewLabel_1.setBounds(105, 11, 386, 127);
		panel.add(lblNewLabel_1);
	
	}
}
