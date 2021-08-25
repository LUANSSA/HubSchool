package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import util.JCalendar;

public class InfoWorker extends JFrame implements ActionListener{
		
		private Container c;
		
		private JLabel departmentName;
		private JTextField txtDepName;
		private JLabel dateWorker;
		private JComboBox dates;
		private JComboBox month;
		private JComboBox year;
		private JLabel name;
		private JTextField txtName;
		private JLabel level;
		private JComboBox boxLevel;
		private JLabel baseSalary;
		private JTextField txtBaseSalary;
		private JLabel manyContractWork;
		private JComboBox txtManyContractWork;
		private JCheckBox term;
		private JButton submit;
		private JButton reset;
		private JButton nextFrame;

		
		JCalendar jcalendar = new JCalendar();
		Worker worker = new Worker();
		
		
	public InfoWorker() {
		
		setBounds(0,0,600,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("InfoWorker");
		
		c = getContentPane();
		c.setLayout(null);
		
		
		//Enter department's name
		departmentName = new JLabel("Enter department's name");
		departmentName.setSize(200,20);
		departmentName.setLocation(100,100);
		c.add(departmentName);
		
		txtDepName = new JTextField();
		txtDepName.setSize(150,20);
		txtDepName.setLocation(300,100);
		c.add(txtDepName);
		
		
		//worker dates
		dateWorker = new JLabel("Enter worker dates");
		dateWorker.setSize(200,20);
		dateWorker.setLocation(100,140);
		c.add(dateWorker);
		
		
		dates = new JComboBox(jcalendar.getDays());
		dates.setFont(new Font("Arial", Font.PLAIN, 15));
		dates.setSize(60,20);
		dates.setLocation(300,140);
		c.add(dates);
		
		
		month = new JComboBox(jcalendar.getMonths());
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(90,20);
		month.setLocation(360,140);
		month.addActionListener(this);
		c.add(month);
		 
		year = new JComboBox(jcalendar.getYears());
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(80,20);
		year.setLocation(450,140);
		c.add(year);
		
		
		name = new JLabel("Name");
		name.setSize(200, 20);
		name.setLocation(100,180);
		c.add(name);
		
		txtName = new JTextField();
		txtName.setSize(200,20);
		txtName.setLocation(300,180);
		c.add(txtName);
		
		level = new JLabel("Level");
		level.setSize(200,20);
		level.setLocation(100, 220);
		c.add(level);
		
		String levels[] = {"JUNIOR", "MID_LEVEL", "SENIOR"};
		
		boxLevel = new JComboBox(levels);
		boxLevel.setSize(100,20);
		boxLevel.setLocation(300,220);
		c.add(boxLevel);
		
		
		baseSalary = new JLabel("Base Salary");
		baseSalary.setSize(200, 20);
		baseSalary.setLocation(100,260);
		c.add(baseSalary);
		
		txtBaseSalary = new JTextField();
		txtBaseSalary.setSize(200, 20);
		txtBaseSalary.setLocation(300,260);
		c.add(txtBaseSalary);
		
		manyContractWork = new JLabel("<html>How many contracts<br>to this worker?</html>");
		manyContractWork.setSize(200,40);
		manyContractWork.setLocation(100,300);
		manyContractWork.setVerticalAlignment(SwingConstants.TOP);
		c.add(manyContractWork);
		
		String qtWork[] = {"1","2","3"};
		txtManyContractWork = new JComboBox(qtWork);
		txtManyContractWork.setSize(50,20);
		txtManyContractWork.setLocation(300,300);
		c.add(txtManyContractWork);
		
		term = new JCheckBox("Accept Terms And Conditions.");
		term.setSize(400, 20);
		term.setLocation(100,360);
		//term.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(term);
		
		submit = new JButton("Submit");
		submit.setSize(100, 20);
		submit.setLocation(100, 410);
		submit.addActionListener(this);
		c.add(submit);
		reset = new JButton("reset");
		reset.setSize(100,20);
		reset.setLocation(250,410);
		reset.addActionListener(this);
		c.add(reset);
		
		/*
		String src = "/home/estudante/eclipse-workspace/empresa/img/seta-curva-preta-para-a-direita.png";
	
		ImageIcon imageIcon = new ImageIcon(src); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(28, 28,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		*/
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//term is Selected
		if(e.getSource() == this.submit) {
			if(this.term.isSelected()) {
				System.out.println("Foi term Select");
				//worker Department
				if(txtDepName.getText().length() > 0){
					worker.getDepartment().setName(txtDepName.getText());
					//worker name
					if(txtName.getText().length() > 0) {
						worker.setName(txtName.getText());
						//worker base salary
						if(txtBaseSalary.getText().length() > 0) {
							try{
								Double bsalary = Double.parseDouble(txtBaseSalary.getText());
								worker.setSalaryBase(bsalary);
								//worker level
								worker.setLevel((String)boxLevel.getSelectedItem());
								Integer manyContractsWork = Integer.parseInt((String)this.txtManyContractWork.getSelectedItem());
								//worker many contracts
								worker.manyContractsWork =  manyContractsWork;
								JOptionPane.showInternalMessageDialog(c, "First successful registration!");
								InfoWorkerHourContracts infoWorkerHoursContracts = new InfoWorkerHourContracts();
								setVisible(false);
								infoWorkerHoursContracts.setVisible(true);
								
							}
							catch(Exception erro){
								JOptionPane.showInternalMessageDialog(c, "Invalid value 'abc..' '%$@..' ','");
							}
							
						}
						else {
							JOptionPane.showInternalMessageDialog(c, "Base Salary is empty");
						}	
					}
					else {
						JOptionPane.showInternalMessageDialog(c, "Name is empty");
					}
				}
				else {
					JOptionPane.showInternalMessageDialog(c, "Department is empty");
				}
				
			}
			else {

				JOptionPane.showInternalMessageDialog(c, "Please accept the terms & conditions..");
			}
		}
		//term is not Selected
		else if(e.getSource() == this.reset) {
			System.out.println("Foi reset");
		}
		
	}
}
