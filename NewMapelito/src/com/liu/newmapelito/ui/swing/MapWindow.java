package com.liu.newmapelito.ui.swing;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.liu.newmapelito.data.data_facade.MapObjectDTO;
import com.liu.newmapelito.domain.Mapelito;
import com.liu.newmapelito.domain.State;
import com.liu.newmapelito.domain.objects.MapObject;

public class MapWindow implements Runnable{
	
	private static MapWindow instance;

	
	private JFrame frame = null;
	private JPanel panel = null;
	private JButton button = null;
	private List<MapObject> mapObjects;
	
	private int mouseX;
	private int mouseY;
	
	public static synchronized MapWindow getInstance(){
        if(instance == null){
            instance = new MapWindow();
        }
        return instance;
    }


	public MapWindow() {
		run();
		addButton();
	}
	



	private void fillWithObjects() {
		mapObjects = MapObjectDTO.getInstance().loadAllMapObjects();
		
	}


	public void run() {

		frame = new JFrame("Mapelito");
		frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\hafase\\eclipse-workspace\\NewMapelito-master.zip_expanded\\NewMapelito-master\\NewMapelito\\valla.jpg")));
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
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
				Mapelito.getInstance().setState(State.addMapObject);//state number 2 is menu state and state number 1 is the normal running state
				
			}
		});
	}

		public void addButton() {
		
		button = new JButton();
		button.setText("Add map object");
		button.setSize(150, 25);
		frame.add(button);
		
		button.addMouseListener(new MouseListener() {
			
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
			public void mouseClicked(MouseEvent arg0) {
				Mapelito.getInstance().setState(State.addMapObject);
				
			}
		});
	}
		
		public void removeButton() {
			frame.remove(button);
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

	public void showPanel(JPanel panel) {
		this.panel = panel;
		frame.setContentPane(panel);
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


	public void removePanel() {
		frame.remove(panel);
		
	}

	

}
