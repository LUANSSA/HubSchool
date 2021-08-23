package view;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameClientLogin  extends JFrame{

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;
	private JLabel lblUser;
	private JLabel lblPass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameClientLogin window = new FrameClientLogin();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameClientLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 600);
		
		
		
		GridBagLayout gbl_FrameClientLogin = new GridBagLayout();
		gbl_FrameClientLogin.columnWidths = new int[] {0,0,0,0,0,0,0,0,0};
		gbl_FrameClientLogin.rowHeights = new int[] {0,0,0,0,0,0,0,0,0};
		gbl_FrameClientLogin.columnWeights = new double[] {Double.MIN_VALUE};
		gbl_FrameClientLogin.rowWeights = new double[] {Double.MIN_VALUE};
		getContentPane().setLayout(gbl_FrameClientLogin);
		
	
		//User
		lblUser = new JLabel("User");
		GridBagConstraints gbc_User = new GridBagConstraints(); 
		gbc_User.gridx = 1;
		gbc_User.gridy = 1;
		
		getContentPane().add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setColumns(12);
		getContentPane().add(txtUser);
		
	
	}

}
