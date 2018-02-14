package com.liu.newmapelito.ui.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

public class MenuPanel extends JPanel {

	private static MenuPanel instance;

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	List<IconButton> iconButtons = new ArrayList<IconButton>();

	public MenuPanel() {	
		initialize();
	}
	
	public static synchronized MenuPanel getInstance(){
        if(instance == null){
            instance = new MenuPanel();
        }
        return instance;
    }

	public void initialize() {
		frame = MapWindow.getInstance().getFrame();
		
		JPanel eastPanel = new JPanel();
		frame.getContentPane().add(eastPanel, BorderLayout.EAST);
		
		
	}

}
