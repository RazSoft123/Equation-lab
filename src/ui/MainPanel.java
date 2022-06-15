package ui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

	public MainPanel() {
		
		setPreferredSize(new Dimension(640, 680));
		setLayout(null);
		
		add(new GraphPanel());
		add(new UserInputPanel());
		
	}
}
