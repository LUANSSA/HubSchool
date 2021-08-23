package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class FrameFormRegistration extends JFrame implements ActionListener{

	//Components of the Form
	private Container c;
	private JLabel title; //application title
	private JLabel name;
	private JTextField txtname;
	private JLabel phone;
	private JTextField txtphone;
	private JLabel gender;
	private JRadioButton gendermale;
	private JRadioButton genderfemale;
	private JRadioButton genderothers;
	private ButtonGroup gendergp;
	private JLabel dob; //date of birth
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add; //address
	private JTextArea txtadd; //text address
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea txtout;
	private JLabel res;
	//private JTextArea resadd;
	
	Border raisedetched = BorderFactory.createEtchedBorder (EtchedBorder.RAISED);
	
	
	
	private String dates[] 
		= { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sub", "Oct", "Nov", "Dec"};
	private String years[] 
		= { "1995", "1996", "1997", "1998",
		    "1999", "2000", "2001", "2002",
		    "2003", "2004", "2005", "2006",
		    "2007", "2008", "2009", "2010",
		    "2011", "2012", "2013", "2014",
		    "2015", "2016", "2017", "2018",
		    "2019" };	
	
	//constructor, to initialize the components
	//with default values.
	public FrameFormRegistration() {
		setTitle("Registration Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 900,600);
		setResizable(false);
		
		
		
		c = getContentPane();
		c.setLayout(null);
		
		//Title
		title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN,30));
		title.setSize(300, 30);
		title.setLocation(300,30);
		c.add(title);
		
		//Name
		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN,20));
		name.setSize(100,20);
		name.setLocation(100, 100);
		c.add(name);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Arial", Font.PLAIN, 15));
		txtname.setSize(190, 20);
		txtname.setLocation(200, 100);
		txtname.setBorder(raisedetched);
		c.add(txtname);
		
		//Phone
		phone = new JLabel("Phone");
		phone.setFont(new Font("Arial", Font.PLAIN, 20));
		phone.setSize(100,20);
		phone.setLocation(100,150);
		c.add(phone);
		
		txtphone = new JTextField();
		txtphone.setFont(new Font("Arial", Font.PLAIN, 15));
		txtphone.setSize(190, 20);
		txtphone.setLocation(200, 150);
		txtphone.setBorder(raisedetched);
		
		c.add(txtphone);
		
		
		//Gender
		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		c.add(gender);
		
		genderfemale = new JRadioButton("Female");
		genderfemale.setFont(new Font("Arial", Font.PLAIN, 15));
		genderfemale.setSelected(true);
		genderfemale.setSize(80, 20);
		genderfemale.setLocation(200, 200);
		c.add(genderfemale);
		
		gendermale = new JRadioButton("Male");
		gendermale.setFont(new Font("Arial", Font.PLAIN, 15));
		gendermale.setSelected(false);
		gendermale.setSize(60, 20);
		gendermale.setLocation(280, 200);
		c.add(gendermale);
		
		genderothers = new JRadioButton("Others");
		genderothers.setFont(new Font("Arial", Font.PLAIN, 15));
		genderothers.setSelected(false);
		genderothers.setSize(80, 20);
		genderothers.setLocation(340, 200);
		c.add(genderothers);
		
		gendergp = new ButtonGroup();
		gendergp.add(genderfemale);
		gendergp.add(gendermale);
		gendergp.add(genderothers);
		
		//Date of birth
		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		c.add(dob);
		
		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		c.add(date);
		
		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		c.add(month);
		
		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(70, 20);
		year.setLocation(310, 250);
		c.add(year);
		
		//Address
		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 300);
		c.add(add);
		
		txtadd = new JTextArea();
		txtadd.setFont(new Font("Arial", Font.PLAIN, 15));
		txtadd.setSize(200, 75);
		txtadd.setLocation(200, 300);
		txtadd.setLineWrap(true);		
		txtadd.setBorder(raisedetched);
		c.add(txtadd);
		
		
		//Terms and Conditions
		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(145, 400);
		c.add(term);
		
		//Buttons
		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);
		
		
		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(290, 450);
		reset.addActionListener(this);
		c.add(reset);
		
		
		//Msg
		txtout = new JTextArea();
		txtout.setFont(new Font("Arial", Font.PLAIN, 15));
		txtout.setSize(300, 400);
		txtout.setLocation(500, 100);
		txtout.setLineWrap(true);
		txtout.setEditable(false);
		txtout.setBorder(raisedetched);
		c.add(txtout);
		
		
		//Msg
		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);
		
		/*
		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);
		*/
		
		//setVisible(true);
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
			if(term.isSelected()) {
				String data1;
				String data = 
						"Name : "
						+txtname.getText() + "\n"
						+"Phone: "
						+txtphone.getText() + "\n";
				if(genderfemale.isSelected()) {
					data1 = "Gender: Female"
							+ "\n";
				}
				else if(gendermale.isSelected()) {
					data1 = "Gender: Male"
							+ "\n";
				}
				else {
					data1 = "Gender: Others"
							+ "\n";
				}
				String data2 =
						"DOB: "
						+ (String)date.getSelectedItem()
						+"/ " + (String)month.getSelectedItem()
						+"/" + (String)year.getSelectedItem()
						+"\n";
				String data3 = "Address: "+ txtadd.getText();
				txtout.setText(data + data1 + data2 + data3);
				txtout.setEditable(false);
				res.setText("Registration Successfully..");
				
			}
			else {
				txtout.setText("");
				//resadd.setText("");
				res.setText("Please accept the terms & conditions..");
			}
			
		}
		else if(e.getSource() == reset) {
			String def = "";
			txtname.setText(def);
			txtadd.setText(def);
			txtphone.setText(def);
			res.setText(def);
			txtout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			//resadd.setText("");
		}
		
	}
}
