package com.liu.newmapelito.ui.swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.liu.newmapelito.domain.Mapelito;
import com.liu.newmapelito.domain.MapelitoObserver;
import com.liu.newmapelito.domain.objects.ObjectType;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class MenuPanel extends JPanel {

	private static MenuPanel instance;

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	List<IconButton> iconButtons = new ArrayList<IconButton>();

	public MenuPanel() {
		
		

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
		
//		for (ObjectType object : ObjectType.values()) {
//			// Create a "clickable" image icons.
//			IconButton button = new IconButton(object);
//			}
//		
		
	}

}
