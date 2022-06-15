/*
 * This file is part of program parametric curve
 * Author        : Rohit Raz
 * Data          : 06/05/2022
 * Version       : 1.0
 * Company       : Razsoft
 * License       : You can use this file as you want for commercial and non - commercial use
 * 		         : The author dosen't take any garenty of correctness of the file
 * 			     : Happy coding
 * Documentation : http://razsoft.in/
 * 				 : https://razsoftedu.blogspot.com
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import ui.*;

//Starting point of the program
public class Main extends JFrame {

	private JPanel mainPanel = new MainPanel();
	public Main() {
		
		setTitle("Parametric curve drawer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new FlowLayout());;
		getContentPane().add(mainPanel);
		
		pack();
		setResizable(false);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				final Main app = new Main();
			}
		});

	}

}
