package Portfolio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class HomeFrames extends JFrame {
	/////========================= All IMAGE
	private ImageIcon logo = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\logo.jpg")
					.getImage().getScaledInstance(112, 91, Image.SCALE_DEFAULT));
	private ImageIcon megel = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\megel.PNG")
					.getImage().getScaledInstance(545, 182, Image.SCALE_DEFAULT));
	private ImageIcon astro = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\icon8.gif")
					.getImage().getScaledInstance(232, 220, Image.SCALE_DEFAULT));
	private ImageIcon xIcon = new ImageIcon(
			new ImageIcon("C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\mainOOPproject\\\\src\\\\asset\\\\remove.png")
					.getImage().getScaledInstance(27, 28, Image.SCALE_DEFAULT));
	private ImageIcon migs = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\user.png")
					.getImage().getScaledInstance(407, 430, Image.SCALE_DEFAULT));
	private ImageIcon work1 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\workex1.png")
					.getImage().getScaledInstance(252, 251, Image.SCALE_DEFAULT));
	private ImageIcon work2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\workex2.png")
					.getImage().getScaledInstance(252, 251, Image.SCALE_DEFAULT));
	private ImageIcon work3 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\work3.png")
					.getImage().getScaledInstance(252, 251, Image.SCALE_DEFAULT));
	private ImageIcon facebook = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\facebook.png")
					.getImage().getScaledInstance(46, 40, Image.SCALE_DEFAULT));
	private ImageIcon gmail = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\gmail (1).png")
					.getImage().getScaledInstance(46, 40, Image.SCALE_DEFAULT));
	private ImageIcon telegram = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\telegram.png")
					.getImage().getScaledInstance(46, 40, Image.SCALE_DEFAULT));
	private ImageIcon astronaut = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\astronaut.gif")
					.getImage().getScaledInstance(325, 378, Image.SCALE_DEFAULT));
	
	

	//=========== JPANEL CLASS ===========================
		private JPanel contentPane;
		private JPanel aboutmePanel;
		

	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						HomeFrames frame = new HomeFrames();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		
	public HomeFrames() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1280, 720);
			setLocationRelativeTo(null);
			setIconImage(logo.getImage());
			setUndecorated(true);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
	

			
		//========== Header Panel ================================	
			JPanel HeaderPanel = new JPanel();
			HeaderPanel.setBackground(new Color(0, 0, 0));
			HeaderPanel.setBounds(0, 0, 1280, 91);
			contentPane.add(HeaderPanel);
			HeaderPanel.setLayout(null);
			
			// ================ exit panel ===========================
			JPanel panel = new JPanel(); 
			panel.setBackground(new Color(0, 0, 0));
			panel.setBounds(1243, 11, 27, 28);
			HeaderPanel.add(panel);
			panel.setLayout(null);
			//============================ Mouse Listener for Icon X ========================
			JLabel xLbl = new JLabel("");
			xLbl.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION)== 0 ) {
						HomeFrames.this.dispose();
					}
				}
				@Override
				public void mouseEntered(MouseEvent args0) {
					xLbl.setForeground(Color.RED);
				}
				@Override
				public void mouseExited(MouseEvent args0) {
					xLbl.setForeground(Color.WHITE);
				}
			});
			xLbl.setIcon(xIcon);
			xLbl.setBounds(0, 0, 27, 28);
			panel.add(xLbl);
			
			
			// =================================== home panel =========================
			JPanel HomePanel_1 = new JPanel();
			HomePanel_1.addMouseListener(new PanelButtonMouseAdapter(HomePanel_1){
			    public void mouseClicked(MouseEvent e) {
			        
		            
			    }
			});
			HomePanel_1.setLayout(null);
			HomePanel_1.setBackground(new Color(0, 0, 0));
			HomePanel_1.setBounds(242, 22, 197, 58);
			HeaderPanel.add(HomePanel_1);
			
			JLabel homeLbl_1 = new JLabel("     HOME");
			homeLbl_1.setForeground(new Color(255, 255, 255));
			homeLbl_1.setBackground(new Color(255, 255, 255));
			homeLbl_1.setFont(new Font("Anton", Font.PLAIN, 20));
			homeLbl_1.setBounds(52, 0, 98, 58);
			HomePanel_1.add(homeLbl_1);
			
			// about me panel =======================================================
			JPanel Aboutmepanel = new JPanel();
			Aboutmepanel.setBounds(449, 22, 197, 58);
			HeaderPanel.add(Aboutmepanel);
			Aboutmepanel.addMouseListener(new PanelButtonMouseAdapter(Aboutmepanel){
			    public void mouseClicked(MouseEvent e) {
			        
			      
			    }
			});
			Aboutmepanel.setBackground(new Color(0, 0, 0));
			Aboutmepanel.setLayout(null);
			
			JLabel aboutmelbl = new JLabel("About Me");
			aboutmelbl.setBackground(new Color(0, 0, 0));
			aboutmelbl.setForeground(new Color(255, 255, 255));
			aboutmelbl.setFont(new Font("Anton", Font.PLAIN, 20));
			aboutmelbl.setBounds(56, 0, 78, 58);
			Aboutmepanel.add(aboutmelbl);
			
			
			// ================== workexperiencepanel===========================
			JPanel workexperiencepanel = new JPanel();
			workexperiencepanel.setBounds(656, 22, 197, 58);
			HeaderPanel.add(workexperiencepanel);
			workexperiencepanel.addMouseListener(new PanelButtonMouseAdapter(workexperiencepanel){
				public void mouseClicked(MouseEvent e) {
					
					

				}
				});
			workexperiencepanel.setBackground(new Color(0, 0, 0));
			workexperiencepanel.setLayout(null);
			
			JLabel workexperiencelbl = new JLabel("Work Experience");
			workexperiencelbl.setForeground(new Color(255, 255, 255));
			workexperiencelbl.setFont(new Font("Anton", Font.PLAIN, 20));
			workexperiencelbl.setBounds(23, 0, 138, 58);
			workexperiencepanel.add(workexperiencelbl);
			
			
			//================contact panel============================
			JPanel contanctpanel = new JPanel();
			contanctpanel.setBounds(863, 22, 197, 58);
			HeaderPanel.add(contanctpanel);
			contanctpanel.addMouseListener(new PanelButtonMouseAdapter(contanctpanel){
			    public void mouseClicked(MouseEvent e) {
			        
		            
			    }
			});
			contanctpanel.setBackground(new Color(0, 0, 0));
			contanctpanel.setLayout(null);
			
			JLabel contactlbl = new JLabel("Contact");
			contactlbl.setForeground(new Color(255, 255, 255));
			contactlbl.setFont(new Font("Anton", Font.PLAIN, 20));
			contactlbl.setBounds(60, 0, 74, 58);
			contanctpanel.add(contactlbl);
			
			JLabel lbllogo = new JLabel("");
			lbllogo.setIcon(logo);
			lbllogo.setBounds(0, 0, 112, 91);
			HeaderPanel.add(lbllogo);
			
			// ================scroll pane panel ===============================
			JPanel scrollpanepanel = new JPanel();
			scrollpanepanel.setBounds(0, 90, 1280, 630);
			contentPane.add(scrollpanepanel);
			scrollpanepanel.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
		    scrollPane.setBounds(0, 0, 1280, 630);
		    scrollPane.setBackground(new Color(225, 254, 253));
		    scrollpanepanel.add(scrollPane);
		    

		    JPanel scrollContent = new JPanel();
		    scrollContent.setBackground(new Color(255, 255, 255));
		    scrollContent.setLayout(null);
		    scrollContent.setPreferredSize(new Dimension(1001, 1978)); // increase the size of the panel to fit all 9 labels
		    scrollPane.setViewportView(scrollContent);
		    
		    // ===================== homepanelscroll Panel
		    JPanel homescrollpanel = new JPanel();
			homescrollpanel.setBounds(0, 0, 1261, 628);
			scrollContent.add(homescrollpanel);
			homescrollpanel.setLayout(null);
			
			JLabel computersciencelbl = new JLabel("Computer Science ");
			computersciencelbl.setFont(new Font("Anton", Font.PLAIN, 76));
			computersciencelbl.setBounds(10, 26, 658, 133);
			homescrollpanel.add(computersciencelbl);
			
			JLabel lblStudent = new JLabel("Student");
			lblStudent.setFont(new Font("Anton", Font.PLAIN, 80));
			lblStudent.setBounds(312, 102, 255, 133);
			homescrollpanel.add(lblStudent);
			
			JLabel megellbl = new JLabel("");
			megellbl.setIcon(megel);
			megellbl.setBounds(10, 230, 545, 182);
			homescrollpanel.add(megellbl);
			
			JLabel lblMiguelCn = new JLabel("Miguel C.N");
			lblMiguelCn.setFont(new Font("Anton", Font.PLAIN, 80));
			lblMiguelCn.setBounds(891, 484, 360, 133);
			homescrollpanel.add(lblMiguelCn);
			
			JLabel lblPolison = new JLabel("Polison");
			lblPolison.setFont(new Font("Anton", Font.PLAIN, 80));
			lblPolison.setBounds(996, 387, 255, 133);
			homescrollpanel.add(lblPolison);
			
			JLabel lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setIcon(astronaut);
			lblNewLabel_6.setBounds(793, 217, 325, 378);
			homescrollpanel.add(lblNewLabel_6);
			
			// ============ Aboutme panel=================================
		    aboutmePanel = new JPanel();
		    aboutmePanel.setBounds(0, 628, 1261, 720);
		    scrollContent.add(aboutmePanel);
		    aboutmePanel.setLayout(null);
		    
		    JPanel nameHobbiesPanel = new JPanel();
		    nameHobbiesPanel.setBounds(662, 156, 589, 285);
		    aboutmePanel.add(nameHobbiesPanel);
		    nameHobbiesPanel.setLayout(new CardLayout(0, 0));

		    JPanel aboutMe2 = new JPanel();
		    aboutMe2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		    aboutMe2.setBackground(new Color(240, 240, 240));
		    nameHobbiesPanel.add(aboutMe2, "aboutMePanel");
		    aboutMe2.setLayout(null);
		    //=====================  Mouse Listener About me Cardlayout
		    JLabel aboutMeLabel = new JLabel("About me");
		    aboutMeLabel.setFont(new Font("Anton", Font.PLAIN, 15));
		    aboutMeLabel.setBounds(10, 11, 78, 26);
		    aboutMeLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
		            cardLayout.show(nameHobbiesPanel, "aboutMePanel");
		        }
		    });
		    aboutMe2.add(aboutMeLabel);
		    // ================= Mouse Listener Hobbies Cardlayout
		    JLabel hobbiesLabel = new JLabel("Hobbies");
		    hobbiesLabel.setForeground(new Color(0, 0, 0));
		    hobbiesLabel.setFont(new Font("Anton", Font.PLAIN, 15));
		    hobbiesLabel.setBounds(102, 14, 78, 20);
		    hobbiesLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
		            cardLayout.show(nameHobbiesPanel, "hobbiesPanel");
		        }
		    });
		    aboutMe2.add(hobbiesLabel);
		    
		    JLabel lblNewLabel = new JLabel("______________");
		    lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 11));
		    lblNewLabel.setBounds(10, 23, 64, 14);
		    aboutMe2.add(lblNewLabel);
		    
		    JPanel panel_1 = new JPanel();
		    panel_1.setBounds(10, 61, 569, 185);
		    aboutMe2.add(panel_1);
		    panel_1.setLayout(null);
		    
		    JLabel lblNewLabel_2 = new JLabel("Fullname : ");
		    lblNewLabel_2.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2.setForeground(new Color(0, 0, 0));
		    lblNewLabel_2.setBounds(10, 11, 64, 30);
		    panel_1.add(lblNewLabel_2);
		    
		    JLabel lblNewLabel_3 = new JLabel("Polison, Miguel Christian Narag.");
		    lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3.setBounds(74, 12, 188, 30);
		    panel_1.add(lblNewLabel_3);
		    
		    JLabel lblNewLabel_2_1 = new JLabel("Age : ");
		    lblNewLabel_2_1.setForeground(Color.BLACK);
		    lblNewLabel_2_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_1.setBounds(10, 52, 64, 30);
		    panel_1.add(lblNewLabel_2_1);
		    
		    JLabel lblNewLabel_3_1 = new JLabel("20 years old");
		    lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_1.setBounds(74, 53, 188, 30);
		    panel_1.add(lblNewLabel_3_1);
		    
		    JLabel lblNewLabel_2_2 = new JLabel("Gender : ");
		    lblNewLabel_2_2.setForeground(Color.BLACK);
		    lblNewLabel_2_2.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_2.setBounds(10, 93, 64, 30);
		    panel_1.add(lblNewLabel_2_2);
		    
		    JLabel lblNewLabel_3_2 = new JLabel("Male");
		    lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_2.setBounds(74, 94, 188, 30);
		    panel_1.add(lblNewLabel_3_2);
		    
		    JLabel lblNewLabel_2_3 = new JLabel("Address");
		    lblNewLabel_2_3.setForeground(Color.BLACK);
		    lblNewLabel_2_3.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_3.setBounds(10, 134, 64, 30);
		    panel_1.add(lblNewLabel_2_3);
		    
		    JLabel lblNewLabel_3_3 = new JLabel("1342 Tondo, Manila");
		    lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_3.setBounds(74, 135, 188, 30);
		    panel_1.add(lblNewLabel_3_3);
		    
		    JLabel lblNewLabel_2_4 = new JLabel("School :");
		    lblNewLabel_2_4.setForeground(Color.BLACK);
		    lblNewLabel_2_4.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_4.setBounds(292, 11, 64, 30);
		    panel_1.add(lblNewLabel_2_4);
		    
		    JLabel lblNewLabel_3_4 = new JLabel("National University Manila");
		    lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_4.setBounds(356, 12, 188, 30);
		    panel_1.add(lblNewLabel_3_4);
		    
		    JLabel lblNewLabel_2_1_1 = new JLabel("Year : ");
		    lblNewLabel_2_1_1.setForeground(Color.BLACK);
		    lblNewLabel_2_1_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_1_1.setBounds(292, 52, 64, 30);
		    panel_1.add(lblNewLabel_2_1_1);
		    
		    JLabel lblNewLabel_3_1_1 = new JLabel("3rd term,1st Year");
		    lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_1_1.setBounds(356, 53, 188, 30);
		    panel_1.add(lblNewLabel_3_1_1);
		    
		    JLabel lblNewLabel_2_2_1 = new JLabel("Program : ");
		    lblNewLabel_2_2_1.setForeground(Color.BLACK);
		    lblNewLabel_2_2_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_2_1.setBounds(292, 93, 64, 30);
		    panel_1.add(lblNewLabel_2_2_1);
		    
		    JLabel lblNewLabel_3_2_1 = new JLabel("BS Computer Science ML\r\n");
		    lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_2_1.setBounds(356, 94, 203, 30);
		    panel_1.add(lblNewLabel_3_2_1);
		    
		    JLabel lblNewLabel_2_3_1 = new JLabel("Gmail : ");
		    lblNewLabel_2_3_1.setForeground(Color.BLACK);
		    lblNewLabel_2_3_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_3_1.setBounds(292, 134, 64, 30);
		    panel_1.add(lblNewLabel_2_3_1);
		    
		    JLabel lblNewLabel_3_3_1 = new JLabel("megelnu@gmail.com");
		    lblNewLabel_3_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_3_1.setBounds(356, 135, 188, 30);
		    panel_1.add(lblNewLabel_3_3_1);

		    JPanel hobbies = new JPanel();
		    hobbies.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		    hobbies.setBackground(new Color(240, 240, 240));
		    nameHobbiesPanel.add(hobbies, "hobbiesPanel");
		    hobbies.setLayout(null);

		    JLabel hobbiesTextLabel = new JLabel("Hobbies");
		    hobbiesTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
		    hobbiesTextLabel.setBounds(102, 14, 78, 20);
		 // ============= Mouse listener Hobbies  cardlayout
		    hobbiesTextLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
		            cardLayout.show(nameHobbiesPanel, "hobbiesPanel");
		        }
		    });
		    hobbies.add(hobbiesTextLabel);
		    
		    // ============= Mouse listener About me cardlayout
		    JLabel aboutMeTextLabel = new JLabel("About me");
		    aboutMeTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
		    aboutMeTextLabel.setBounds(11, 11, 78, 26);
		    aboutMeTextLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
		            cardLayout.show(nameHobbiesPanel, "aboutMePanel");
		        }
		    });
		    hobbies.add(aboutMeTextLabel);
		    
		    JLabel lblNewLabel_1 = new JLabel("______________");
		    lblNewLabel_1.setFont(new Font("Anton", Font.PLAIN, 11));
		    lblNewLabel_1.setBounds(99, 23, 64, 14);
		    hobbies.add(lblNewLabel_1);
		    
		    JPanel panel_1_1 = new JPanel();
		    panel_1_1.setLayout(null);
		    panel_1_1.setBounds(11, 61, 569, 213);
		    hobbies.add(panel_1_1);
		    
		    JLabel lblNewLabel_2_5 = new JLabel("Hobbies : ");
		    lblNewLabel_2_5.setForeground(Color.BLACK);
		    lblNewLabel_2_5.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_5.setBounds(10, 11, 64, 30);
		    panel_1_1.add(lblNewLabel_2_5);
		    
		    JLabel lblNewLabel_3_5 = new JLabel("Watching Sport Movie");
		    lblNewLabel_3_5.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_5.setBounds(74, 12, 188, 30);
		    panel_1_1.add(lblNewLabel_3_5);
		    
		    JLabel lblNewLabel_2_1_2 = new JLabel("Hobbies 2 : ");
		    lblNewLabel_2_1_2.setForeground(Color.BLACK);
		    lblNewLabel_2_1_2.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_1_2.setBounds(10, 52, 64, 30);
		    panel_1_1.add(lblNewLabel_2_1_2);
		    
		    JLabel lblNewLabel_3_1_2 = new JLabel("Watching Series Movie");
		    lblNewLabel_3_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_1_2.setBounds(74, 53, 188, 30);
		    panel_1_1.add(lblNewLabel_3_1_2);
		    
		    JLabel lblNewLabel_2_2_2 = new JLabel("Hobbies 3 ");
		    lblNewLabel_2_2_2.setForeground(Color.BLACK);
		    lblNewLabel_2_2_2.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_2_2.setBounds(10, 93, 64, 30);
		    panel_1_1.add(lblNewLabel_2_2_2);
		    
		    JLabel lblNewLabel_3_2_2 = new JLabel("Improving myself");
		    lblNewLabel_3_2_2.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_2_2.setBounds(74, 94, 188, 30);
		    panel_1_1.add(lblNewLabel_3_2_2);
		    
		    JLabel lblNewLabel_2_3_2 = new JLabel("Hobbies 4");
		    lblNewLabel_2_3_2.setForeground(Color.BLACK);
		    lblNewLabel_2_3_2.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_3_2.setBounds(10, 134, 64, 30);
		    panel_1_1.add(lblNewLabel_2_3_2);
		    
		    JLabel lblNewLabel_3_3_2 = new JLabel("More Coding and self Learning");
		    lblNewLabel_3_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_3_2.setBounds(74, 135, 188, 30);
		    panel_1_1.add(lblNewLabel_3_3_2);
		    
		    JLabel lblNewLabel_2_4_1 = new JLabel("Favorite Food : ");
		    lblNewLabel_2_4_1.setForeground(Color.BLACK);
		    lblNewLabel_2_4_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_4_1.setBounds(292, 11, 92, 30);
		    panel_1_1.add(lblNewLabel_2_4_1);
		    
		    JLabel lblNewLabel_3_4_1 = new JLabel("My Mother Cook");
		    lblNewLabel_3_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_4_1.setBounds(381, 12, 188, 30);
		    panel_1_1.add(lblNewLabel_3_4_1);
		    
		    JLabel lblNewLabel_2_1_1_1 = new JLabel("Idol : ");
		    lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		    lblNewLabel_2_1_1_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_1_1_1.setBounds(292, 52, 64, 30);
		    panel_1_1.add(lblNewLabel_2_1_1_1);
		    
		    JLabel lblNewLabel_3_1_1_1 = new JLabel("Justin Bieber, Zayn Malik, Klay Thompson");
		    lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_1_1_1.setBounds(356, 53, 188, 30);
		    panel_1_1.add(lblNewLabel_3_1_1_1);
		    
		    JLabel lblNewLabel_2_2_1_1 = new JLabel("Favorite Band");
		    lblNewLabel_2_2_1_1.setForeground(Color.BLACK);
		    lblNewLabel_2_2_1_1.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_2_2_1_1.setBounds(292, 93, 92, 30);
		    panel_1_1.add(lblNewLabel_2_2_1_1);
		    
		    JLabel lblNewLabel_3_2_1_1 = new JLabel("UUD, Maroon 5 , Oasis");
		    lblNewLabel_3_2_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_3_2_1_1.setBounds(381, 94, 178, 30);
		    panel_1_1.add(lblNewLabel_3_2_1_1);
		    
		    JLabel textaboutmelbl = new JLabel("About me");
		    textaboutmelbl.setFont(new Font("Anton", Font.PLAIN, 40));
		    textaboutmelbl.setBounds(662, 11, 177, 86);
		    aboutmePanel.add(textaboutmelbl);
		    
		    JPanel secondpanel = new JPanel();
		    secondpanel.setBounds(42, 449, 581, 253);
		    aboutmePanel.add(secondpanel);
		    secondpanel.setLayout(new CardLayout(0, 0));

		    JPanel education = new JPanel();
		    education.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		    education.setBackground(new Color(240, 240, 240));
		    secondpanel.add(education, "aboutMePanel");
		    education.setLayout(null);

		    JLabel educationlbl = new JLabel("Education");
		    educationlbl.setFont(new Font("Anton", Font.PLAIN, 15));
		    educationlbl.setBounds(10, 11, 78, 26);
		    educationlbl.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
		            cardLayout.show(secondpanel, "aboutMePanel");
		        }
		    });
		    education.add(educationlbl);

		    JLabel skilss = new JLabel("Skill");
		    skilss.setForeground(new Color(0, 0, 0));
		    skilss.setFont(new Font("Anton", Font.PLAIN, 15));
		    skilss.setBounds(102, 14, 78, 20);
		   // ======================= action listener for Skills card layout
		    skilss.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
		            cardLayout.show(secondpanel, "hobbiesPanel");
		        }
		    });
		    education.add(skilss);
		    
		    JLabel lblNewLabel2 = new JLabel("______________");
		    lblNewLabel2.setFont(new Font("Anton", Font.PLAIN, 11));
		    lblNewLabel2.setBounds(10, 23, 64, 14);
		    education.add(lblNewLabel2);
		    
		    JPanel panel_2 = new JPanel();
		    panel_2.setBounds(10, 61, 569, 187);
		    education.add(panel_2);
		    panel_2.setLayout(null);
		    
		    JLabel lblNewLabe3 = new JLabel("Elementary  (2008 - 2016)");
		    lblNewLabe3.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabe3.setForeground(new Color(0, 0, 0));
		    lblNewLabe3.setBounds(10, 11, 180, 30);
		    panel_2.add(lblNewLabe3);
		    
		    JLabel lblNewLabel_4 = new JLabel("Francisco Balagtas Elementary school");
		    lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_4.setBounds(10, 38, 318, 30);
		    panel_2.add(lblNewLabel_4);
		    
		    JLabel lblNewLabel_4_1 = new JLabel("Padre Mariano Gomez Elementary School\r\n");
		    lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_4_1.setBounds(10, 67, 318, 30);
		    panel_2.add(lblNewLabel_4_1);
		    
		    JLabel lblEducation = new JLabel("High School 2016 - 2020");
		    lblEducation.setForeground(Color.BLACK);
		    lblEducation.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblEducation.setBounds(10, 108, 180, 30);
		    panel_2.add(lblEducation);
		    
		    JLabel lblNewLabel_4_2 = new JLabel("Cayetano Arellano High School\r\n");
		    lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_4_2.setBounds(10, 135, 294, 30);
		    panel_2.add(lblNewLabel_4_2);
		    
		    JLabel lblSeniorHigh = new JLabel("Senior High 2020 - 2022");
		    lblSeniorHigh.setForeground(Color.BLACK);
		    lblSeniorHigh.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblSeniorHigh.setBounds(314, 11, 222, 30);
		    panel_2.add(lblSeniorHigh);
		    
		    JLabel lblNewLabel_4_3 = new JLabel("Ama Learning Computer Center");
		    lblNewLabel_4_3.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_4_3.setBounds(314, 38, 222, 30);
		    panel_2.add(lblNewLabel_4_3);
		    
		    JLabel lblCollege = new JLabel("College 2022 - current");
		    lblCollege.setForeground(Color.BLACK);
		    lblCollege.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblCollege.setBounds(314, 108, 172, 30);
		    panel_2.add(lblCollege);
		    
		    JLabel lblNewLabel_4_3_1 = new JLabel("National University Manila");
		    lblNewLabel_4_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		    lblNewLabel_4_3_1.setBounds(314, 135, 234, 30);
		    panel_2.add(lblNewLabel_4_3_1);

		    JPanel skillspanel = new JPanel();
		    skillspanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		    skillspanel.setBackground(new Color(240, 240, 240));
		    secondpanel.add(skillspanel, "hobbiesPanel");
		    skillspanel.setLayout(null);

		    JLabel skillsTextLabel = new JLabel("Skills");
		    skillsTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
		    skillsTextLabel.setBounds(102, 14, 78, 20);
		    // ======================= action listener for Skills card layout
		    skillsTextLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
		            cardLayout.show(secondpanel, "hobbiesPanel");
		        }
		    });
		    skillspanel.add(skillsTextLabel);
		    // ======================= action listener for educational card layout
		    JLabel educTextLabel = new JLabel("Education");
		    educTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
		    educTextLabel.setBounds(11, 11, 78, 26);
		    educTextLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
		            cardLayout.show(secondpanel, "aboutMePanel");
		        }
		    });
		    skillspanel.add(educTextLabel);
		    
		    JLabel lblNewLabel_20 = new JLabel("______________");
		    lblNewLabel_20.setFont(new Font("Anton", Font.PLAIN, 11));
		    lblNewLabel_20.setBounds(99, 23, 64, 14);
		    skillspanel.add(lblNewLabel_20);
		    
		    JPanel panel2 = new JPanel();
		    panel2.setLayout(null);
		    panel2.setBounds(11, 61, 569, 171);
		    skillspanel.add(panel2);
		    
		    JLabel lblNewLabel_21 = new JLabel("Java");
		    lblNewLabel_21.setForeground(Color.BLACK);
		    lblNewLabel_21.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_21.setBounds(10, 11, 64, 30);
		    panel2.add(lblNewLabel_21);
		    
		    JLabel lblNewLabel235 = new JLabel("HTML");
		    lblNewLabel235.setForeground(Color.BLACK);
		    lblNewLabel235.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel235.setBounds(10, 52, 64, 30);
		    panel2.add(lblNewLabel235);
		    
		    JLabel lblNewLabel_25 = new JLabel("CSS");
		    lblNewLabel_25.setForeground(Color.BLACK);
		    lblNewLabel_25.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_25.setBounds(10, 93, 64, 30);
		    panel2.add(lblNewLabel_25);
		    
		    JLabel lblNewLabel_27 = new JLabel("PHP");
		    lblNewLabel_27.setForeground(Color.BLACK);
		    lblNewLabel_27.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_27.setBounds(10, 134, 64, 30);
		    panel2.add(lblNewLabel_27);
		    
		    JLabel lblNewLabel_29 = new JLabel("Python");
		    lblNewLabel_29.setForeground(Color.BLACK);
		    lblNewLabel_29.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_29.setBounds(88, 11, 181, 30);
		    panel2.add(lblNewLabel_29);
		    
		    JLabel lblNewLabel_31 = new JLabel("Photoshop Adobe");
		    lblNewLabel_31.setForeground(Color.BLACK);
		    lblNewLabel_31.setFont(new Font("Anton", Font.PLAIN, 14));
		    lblNewLabel_31.setBounds(88, 52, 181, 30);
		    panel2.add(lblNewLabel_31);
		    
		    JLabel texteduclbl = new JLabel("About me");
		    texteduclbl.setFont(new Font("Anton", Font.PLAIN, 40));
		    texteduclbl.setBounds(662, 11, 177, 86);
		    aboutmePanel.add(texteduclbl);
		    
		    JLabel etext1lbl = new JLabel("Hello, my name is Miguel Polison, and I'm 20-years-old programmer from Tondo, Manila");
		    etext1lbl.setFont(new Font("Anton", Font.PLAIN, 15));
		    etext1lbl.setBounds(662, 77, 589, 20);
		    aboutmePanel.add(etext1lbl);
		    
		    JLabel lblImCurrectlyA1 = new JLabel("I'm Currectly a freshman at National University of Manila, where I'm pursuing a degree in");
		    lblImCurrectlyA1.setFont(new Font("Anton", Font.PLAIN, 15));
		    lblImCurrectlyA1.setBounds(662, 101, 589, 20);
		    aboutmePanel.add(lblImCurrectlyA1);
		    
		    JLabel lbl1 = new JLabel("computer science with a machine learning concentration.");
		    lbl1.setFont(new Font("Anton", Font.PLAIN, 15));
		    lbl1.setBounds(662, 125, 589, 20);
		    aboutmePanel.add(lbl1);
		    
		    JLabel lblNewLabel_5 = new JLabel("");
		    lblNewLabel_5.setIcon(migs);
		    lblNewLabel_5.setBounds(153, 11, 407, 430);
		    aboutmePanel.add(lblNewLabel_5);
		    //=============PANEL WORK EXPERIENCE PANEK =======
		    JPanel WorkExperiencePanel = new JPanel();
		    WorkExperiencePanel.setBounds(0, 1348, 1261, 505);
		    scrollContent.add(WorkExperiencePanel);
		    WorkExperiencePanel.setLayout(null);
		    
		    JPanel WorkPhotoGalleryPanel = new JPanel();
		    WorkPhotoGalleryPanel.setBounds(241, 138, 819, 253);
		    WorkExperiencePanel.add(WorkPhotoGalleryPanel);
		    WorkPhotoGalleryPanel.setLayout(null);

		    JLabel textworkexperiencelbl = new JLabel("WORK EXPERIENCE");
		    textworkexperiencelbl.setFont(new Font("Anton", Font.PLAIN, 99));
		    textworkexperiencelbl.setBounds(322, 25, 675, 87);
		    WorkExperiencePanel.add(textworkexperiencelbl);
		    
		    JPanel Gallery1 = new JPanel();
		    Gallery1.setBounds(282, 0, 252, 251);
		    WorkPhotoGalleryPanel.add(Gallery1);
		    Gallery1.setLayout(null);
		    // picture 3 float effect
		    Gallery1.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            Gallery1.setLocation(Gallery1.getX() + 10, Gallery1.getY() + 10);
		        }

		        @Override
		        public void mouseExited(MouseEvent e) {
		            Gallery1.setLocation(Gallery1.getX() - 10, Gallery1.getY() - 10);
		        }
		    });

		    JLabel work1lbl = new JLabel("");
		    work1lbl.setIcon(work1);
		    work1lbl.setBounds(0, 0, 252, 251);
		    Gallery1.add(work1lbl);

		    JPanel Gallery2 = new JPanel();
		    Gallery2.setBounds(567, 0, 252, 251);
		    WorkPhotoGalleryPanel.add(Gallery2);
		    Gallery2.setLayout(null);
		    // ===== picture 2 float effect
		    Gallery2.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            Gallery2.setLocation(Gallery2.getX() + 10, Gallery2.getY() + 10);
		        }

		        @Override
		        public void mouseExited(MouseEvent e) {
		            Gallery2.setLocation(Gallery2.getX() - 10, Gallery2.getY() - 10);
		        }
		    });

		    JLabel work2lbl = new JLabel("");
		    work2lbl.setIcon(work2);
		    work2lbl.setBounds(0, 0, 252, 251);
		    Gallery2.add(work2lbl);

		    JPanel Gallery3 = new JPanel();
		    Gallery3.setBounds(0, 0, 252, 251);
		    WorkPhotoGalleryPanel.add(Gallery3);
		    Gallery3.setLayout(null);
		    // picture 1 effect float
		    Gallery3.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            Gallery3.setLocation(Gallery3.getX() + 10, Gallery3.getY() + 10);
		        }

		        @Override
		        public void mouseExited(MouseEvent e) {
		            Gallery3.setLocation(Gallery3.getX() - 10, Gallery3.getY() - 10);
		        }
		    });

		    JLabel work3lbl = new JLabel("");
		    work3lbl.setIcon(work3);
		    work3lbl.setBounds(0, 0, 252, 251);
		    Gallery3.add(work3lbl);
		    
		    JLabel motivationlbl = new JLabel("\"Start where you are. Use what you have. Do What you can.\"");
		    motivationlbl.setFont(new Font("Anton", Font.PLAIN, 33));
		    motivationlbl.setBounds(241, 422, 819, 72);
		    WorkExperiencePanel.add(motivationlbl);

		    
		    JPanel ContactPanel = new JPanel();
		    ContactPanel.setBounds(0, 1853, 1261, 124);
		    scrollContent.add(ContactPanel);
		    ContactPanel.setLayout(null);
		    
		    JLabel lblNewLabel_7 = new JLabel("Contact");
		    lblNewLabel_7.setFont(new Font("Anton", Font.PLAIN, 20));
		    lblNewLabel_7.setBounds(598, 0, 69, 35);
		    ContactPanel.add(lblNewLabel_7);
		    
		    JLabel facebooklbl = new JLabel("");
		    facebooklbl.setIcon(facebook);
		    facebooklbl.setBounds(10, 73, 46, 40);
		    ContactPanel.add(facebooklbl);
		    
		    JLabel facebooktextlbl = new JLabel("Polison13");
		    facebooktextlbl.setFont(new Font("Anton", Font.PLAIN, 11));
		    facebooktextlbl.setBounds(59, 87, 136, 14);
		    ContactPanel.add(facebooktextlbl);
		    
		    JLabel gmailiconlbl = new JLabel("");
		    gmailiconlbl.setIcon(gmail);
		    gmailiconlbl.setBounds(205, 73, 46, 40);
		    ContactPanel.add(gmailiconlbl);
		    
		    JLabel gmailbl = new JLabel("megelnu@gmail.com");
		    gmailbl.setFont(new Font("Anton", Font.PLAIN, 11));
		    gmailbl.setBounds(261, 87, 136, 14);
		    ContactPanel.add(gmailbl);
		    
		    JLabel telegram1 = new JLabel("");
		    telegram1.setIcon(telegram);
		    telegram1.setBounds(862, 73, 389, 40);
		    ContactPanel.add(telegram1);
		    
		    JLabel contact1lbl = new JLabel("09694540477");
		    contact1lbl.setFont(new Font("Anton", Font.PLAIN, 11));
		    contact1lbl.setBounds(918, 87, 333, 14);
		    ContactPanel.add(contact1lbl);
		    
		    JLabel telegram2 = new JLabel("");
		    telegram2.setIcon(telegram);
		    telegram2.setBounds(1114, 73, 137, 40);
		    ContactPanel.add(telegram2);
		    
		    JLabel gmailbl_2 = new JLabel("09668992983");
		    gmailbl_2.setFont(new Font("Anton", Font.PLAIN, 11));
		    gmailbl_2.setBounds(1170, 87, 81, 14);
		    ContactPanel.add(gmailbl_2);
		    
		    JSeparator separator = new JSeparator();
		    separator.setBounds(10, 38, 1241, -7);
		    ContactPanel.add(separator);

		    
		    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
	    

		}

		 // ================== JPANEL NAMING ACTION LISTENER ===================== 
		private class PanelButtonMouseAdapter extends MouseAdapter{
			
			JPanel panel;
			public PanelButtonMouseAdapter(JPanel panel) {
				this.panel = panel;
			}
			public void mouseEntered(MouseEvent e){
				
				panel.setBackground(new Color(240,  240, 240));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(0, 0, 0));
			}
			
			@Override
			public void mousePressed(MouseEvent e){
				panel.setBackground(new Color(240,  240, 240));
			} 
			
			@Override
			public void mouseReleased(MouseEvent e){
				panel.setBackground(new Color(240,  240, 240));
			}
		}	
	}
