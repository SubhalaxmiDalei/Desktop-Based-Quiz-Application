import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener
{
	Score(String name,int score)
	{
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		setBounds(400,150,750,550);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("score.png"));
		Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,200,300,250);
		add(image);

		JLabel heading = new JLabel("THANKYOU "+name+" FOR PLAYING SIMPLE QUIZ");
		heading.setBounds(45,30,700,30);
		heading.setFont(new Font("Tahoma",Font.BOLD,26));
		add(heading);

		JLabel lastscore = new JLabel("YOUR SCORE IS "+score);
		lastscore.setBounds(350,200,300,30);
		lastscore.setFont(new Font("Tahoma",Font.BOLD,26));
		add(lastscore);

		JButton submit = new JButton("Play Again!!");
        submit.setBounds(380,270,120,30);
        submit.setBackground(Color.YELLOW);
		// submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.addActionListener(this);
        add(submit);
	}

	public void actionPerformed(ActionEvent ae){

		this.setVisible(false);
		new Quiz("User");
	}
	public static void main(String[] args) 
	{
		new Score("User",0);
	}
}