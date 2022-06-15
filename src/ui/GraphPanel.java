package ui;

import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {
	
	public GraphPanel() {
		
		setSize(new Dimension(640, 640));
		setLocation(0,40);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		//Setting Background color to black
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 639, 639);
		
		//Drawing axis 
		//X - axis
		g.setColor(Color.RED);
		g.drawLine(0, 320, 640, 320);
		g.drawString("X - axis", 0, 315);
		
		//Dividing into segments 
		int count = -3;
		for(int i = 80; i < 640; i += 80) {
			g.drawLine(i, 310, i, 330);
			if(count != 0)
				g.drawString(count + "", i, 345);
			count++;
		}
		
		//Y - axis
		g.setColor(Color.GREEN);
		g.drawLine(320, 0, 320, 640);
		g.drawString("Y - axis", 325, 10);
		
		//Dividing into segments
		count = 3;
		for(int i = 80; i < 640; i+=80) {
			g.drawLine(310, i, 330, i);
			if(count != 0)
				g.drawString(count + "", 335, i);
			count--;
		}
		g.setColor(Color.RED);
		g.drawLine(320, 310, 320, 330);
		
		//Drawing Origin
		g.setColor(Color.BLUE);
		g.drawString("O" ,320 - 15, 320 + 15);
		
		Graphics2D g2d = (Graphics2D)g;
		
	}

}
