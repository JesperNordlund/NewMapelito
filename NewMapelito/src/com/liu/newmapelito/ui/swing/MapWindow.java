package com.liu.newmapelito.ui.swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.liu.newmapelito.domain.Mapelito;

public class MapWindow implements Runnable{
	
private static MapWindow instance;

	
	private JFrame frame = null;
	private JPanel panel = null;
	
	private int mouseX;
	private int mouseY;


	public MapWindow() {
		run();
	}
	
	public void run() {
		
		frame = new JFrame("Mapelito");
		frame.setContentPane(new JLabel(new ImageIcon("valla.png")));
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if(panel != null) {
			frame.getContentPane().add(panel);
		}
		
		frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent mc) {
				mouseX = mc.getX();
				mouseY = mc.getY();
				System.out.println("MouseCoordinates: x = " + mouseX + " y = " + mouseY);
				Mapelito.getInstance().setState(2);//state number 2 is menu state and state number 1 is the normal running state
				
			}
		});

		if(Mapelito.getInstance().getState() == 2) {
			MenuPanel.getInstance().initialize();
			frame.repaint();
		}else {
			setPanel(null);
			frame.repaint();
		}
		
	}
	
    public static synchronized MapWindow getInstance(){
        if(instance == null){
            instance = new MapWindow();
        }
        return instance;
    }
	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	
	public int getMouseX() {
		return mouseX;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	

}
