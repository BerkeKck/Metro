
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;

public class Giris extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField giris_name;
	private JTextField kayit_eposta;
	private JPasswordField kayit_pass2;
	private JPasswordField kayit_pass1;
	private JPasswordField giris_pass;
	static String name;
	static String pass;
	private JTextField kayit_name;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giris frame = new Giris();
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
	public Giris() {
		setFont(new Font("Dialog", Font.BOLD, 13));
		setTitle("Giriş Yap");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\B\\Codes\\JavaProjects\\Train\\m_logo.png"));
		setBackground(new Color(255, 255, 255));
		setForeground(Color.DARK_GRAY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel MetroIstanbul = new JLabel("");
		MetroIstanbul.setBounds(163, 0, 253, 127);
		MetroIstanbul.setIcon(new ImageIcon("D:\\B\\Codes\\JavaProjects\\Train\\logo.png"));
		contentPane.add(MetroIstanbul);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(63, 117, 469, 283);
		contentPane.add(tabbedPane);

		JPanel Giris = new JPanel();
		tabbedPane.addTab("Giriş Yap", null, Giris, null);

		JButton button_giris = new JButton("Giriş Yap");
		button_giris.setBounds(145, 163, 205, 31);
		button_giris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = giris_name.getText();
				pass = giris_pass.getText();
				
			}
		});
		Giris.setLayout(null);
		button_giris.setForeground(Color.BLACK);
		button_giris.setFont(new Font("Tahoma", Font.BOLD, 11));
		Giris.add(button_giris);

		giris_name = new JTextField();
		giris_name.setBounds(165, 62, 185, 31);
		giris_name.setHorizontalAlignment(SwingConstants.CENTER);
		giris_name.setFont(new Font("Arial", Font.PLAIN, 12));
		giris_name.setColumns(10);
		giris_name.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0),
				Color.BLACK, Color.BLACK));
		Giris.add(giris_name);

		JLabel giris_kullanici = new JLabel("KULLANICI ADI");
		giris_kullanici.setBounds(54, 62, 101, 31);
		giris_kullanici.setForeground(new Color(0, 0, 153));
		giris_kullanici.setFont(new Font("Tahoma", Font.BOLD, 12));
		giris_kullanici.setBackground(Color.WHITE);
		Giris.add(giris_kullanici);

		JLabel giris_sifre = new JLabel("ŞİFRE");
		giris_sifre.setBounds(54, 104, 101, 35);
		giris_sifre.setHorizontalAlignment(SwingConstants.CENTER);
		giris_sifre.setForeground(new Color(0, 0, 153));
		giris_sifre.setFont(new Font("Tahoma", Font.BOLD, 12));
		Giris.add(giris_sifre);

		JSeparator separator = new JSeparator();
		separator.setBounds(68, 150, 354, 2);
		Giris.add(separator);
		
		giris_pass = new JPasswordField();
		giris_pass.setBounds(165, 104, 185, 31);
		giris_pass.setToolTipText("");
		giris_pass.setHorizontalAlignment(SwingConstants.CENTER);
		giris_pass.setFont(new Font("Arial", Font.PLAIN, 11));
		giris_pass.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255),
						Color.BLACK, Color.BLACK));
		Giris.add(giris_pass);
		
		JCheckBox giris_check = new JCheckBox("Şifreyi Gör");
		giris_check.setBounds(356, 111, 97, 23);
		Giris.add(giris_check);

		JPanel Kayit = new JPanel();
		tabbedPane.addTab("Kayıt Ol", null, Kayit, null);
		Kayit.setLayout(null);

		JButton button_kayit = new JButton("Kayıt Ol");
		button_kayit.setForeground(Color.BLACK);
		button_kayit.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_kayit.setBounds(160, 213, 205, 31);
		Kayit.add(button_kayit);

		kayit_eposta = new JTextField();
		kayit_eposta.setHorizontalAlignment(SwingConstants.CENTER);
		kayit_eposta.setFont(new Font("Arial", Font.PLAIN, 12));
		kayit_eposta.setColumns(10);
		kayit_eposta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0),
				Color.BLACK, Color.BLACK));
		kayit_eposta.setBounds(180, 24, 185, 31);
		Kayit.add(kayit_eposta);

		JLabel kayit_posta = new JLabel("E-Posta");
		kayit_posta.setForeground(new Color(0, 0, 153));
		kayit_posta.setFont(new Font("Tahoma", Font.BOLD, 12));
		kayit_posta.setBackground(Color.WHITE);
		kayit_posta.setBounds(69, 23, 101, 31);
		Kayit.add(kayit_posta);

		JLabel kayit_sifre_tekrar = new JLabel("Şifre Tekrar");
		kayit_sifre_tekrar.setForeground(new Color(0, 0, 153));
		kayit_sifre_tekrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		kayit_sifre_tekrar.setBounds(69, 154, 101, 35);
		Kayit.add(kayit_sifre_tekrar);

		JSeparator seperator1 = new JSeparator();
		seperator1.setBounds(66, 200, 354, 2);
		Kayit.add(seperator1);

		kayit_pass2 = new JPasswordField();
		kayit_pass2.setToolTipText("");
		kayit_pass2.setHorizontalAlignment(SwingConstants.CENTER);
		kayit_pass2.setFont(new Font("Arial", Font.PLAIN, 11));
		kayit_pass2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255),
				Color.BLACK, Color.BLACK));
		kayit_pass2.setBounds(180, 157, 185, 31);
		Kayit.add(kayit_pass2);

		JLabel kayit_sifre = new JLabel("Şifre");
		kayit_sifre.setForeground(new Color(0, 0, 153));
		kayit_sifre.setFont(new Font("Tahoma", Font.BOLD, 12));
		kayit_sifre.setBounds(69, 108, 101, 35);
		Kayit.add(kayit_sifre);

		kayit_pass1 = new JPasswordField();
		kayit_pass1.setToolTipText("");
		kayit_pass1.setHorizontalAlignment(SwingConstants.CENTER);
		kayit_pass1.setFont(new Font("Arial", Font.PLAIN, 11));
		kayit_pass1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255),
				Color.BLACK, Color.BLACK));
		kayit_pass1.setBounds(180, 111, 185, 31);
		Kayit.add(kayit_pass1);
		
		kayit_name = new JTextField();
		kayit_name.setHorizontalAlignment(SwingConstants.CENTER);
		kayit_name.setFont(new Font("Arial", Font.PLAIN, 12));
		kayit_name.setColumns(10);
		kayit_name.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0),
						Color.BLACK, Color.BLACK));
		kayit_name.setBounds(180, 67, 185, 31);
		Kayit.add(kayit_name);
		
		JLabel kayit_kullanıcı = new JLabel("Kullanıcı Adı");
		kayit_kullanıcı.setForeground(new Color(0, 0, 153));
		kayit_kullanıcı.setFont(new Font("Tahoma", Font.BOLD, 12));
		kayit_kullanıcı.setBackground(Color.WHITE);
		kayit_kullanıcı.setBounds(69, 66, 101, 31);
		Kayit.add(kayit_kullanıcı);
		
		JCheckBox kayit_check = new JCheckBox("Şifreyi Gör");
		kayit_check.setBounds(371, 115, 97, 23);
		Kayit.add(kayit_check);
		
		}
	}


