package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener(e->{
			String z = JOptionPane.showInputDialog("Give me one value");
			String y = JOptionPane.showInputDialog("Give me the other value");
			int iz = Integer.parseInt(z);
			int iy = Integer.parseInt(y);
			System.out.println(iz+iy);
		}); 
	
		randNumber.addActionListener(x->{
			System.out.println(Math.random()); 
		});
		tellAJoke.addActionListener(x->{
		System.out.println("no joke");	
		});
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
	

		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
