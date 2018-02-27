package com.liu.newmapelito.ui.swing;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class MenuPanel extends JPanel {

	private static MenuPanel instance;

	private static final long serialVersionUID = 1L;
    private JPanel panel;
    private JButton button1;
    private JLabel label;
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
  
	        panel = new JPanel();
	        panel.setBackground(Color.green);
	        panel.setSize(150, 600);
	        
	        button1 = new JButton("Mapelito");
	        label = new JLabel("Mapelito label!");
	        
	        panel.add(button1);
	        panel.add(label);
	        
	        
	        
		}

	

}
