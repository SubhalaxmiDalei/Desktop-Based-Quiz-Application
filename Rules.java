import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

	String name;
	JButton start,back;
	Rules(String name){
		this.name = name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel heading = new JLabel("Welcome "+name+" to our simple Quiz..");
		heading.setBounds(50,20,700,30);
		heading.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		heading.setForeground(new Color(139, 128, 0));
		add(heading);


		JLabel rules = new JLabel();
		rules.setBounds(20,90,700,350);
		rules.setFont(new Font("Mongolian Baiti",Font.PLAIN,16));
		rules.setText(
			"<html>"+ 
				"1.Participation is open to [mention eligibility criteria e.g., students, employees, age group, etc.]."+"<br>"+"<br>"+
		
				"2.The quiz will consist of [number] rounds, which may include multiple-choice questions, true/false, fill-in-the-blanks, visual/audio rounds, and rapid-fire questions."+"<br>"+"<br>"+


				"3.Each question must be answered within the allotted time of [e.g., 15 seconds] unless specified otherwise."+"<br>"+"<br>"+

				"4.Each correct answer will earn [number] points."+"<br>"+"<br>"+

				"5.[Optional] A penalty of [number] points will be applied for every incorrect answer."+"<br>"+"<br>"+
				"6. Participants must maintain decorum and adhere to the instructions provided by the quizmaster and organizers."+"<br>"+"<br>"+
				"7. The decisions of the quizmaster and organizing committee shall be final and binding on all participants."+"<br>"+"<br>"+
		"<html>"
);		
		add(rules);

		back = new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(255,255,0));
		back.addActionListener(this);
		add(back);

		start = new JButton("START");
		start.setBounds(400,500,100,30);
		start.setBackground(new Color(255,255,0));
		start.addActionListener(this);
		add(start);

		setSize(800,650);
		setLocation(300,150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == this.start){
			this.setVisible(false);
			new Quiz(this.name);
		}
		else{
			this.setVisible(false);
			new Login();
		}
	}
	public static void main(String[] args) {
		new Rules("User");
	}
}