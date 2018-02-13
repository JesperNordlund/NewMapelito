package com.liu.newmapelito.ui.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.liu.newmapelito.domain.objects.MapObject;
import com.liu.newmapelito.domain.objects.ObjectType;

public class IconButton {
	
	public IconButton(MapObject object) {
		makeButton(object);
	
	}
	

	private void makeButton(MapObject object) {
		ImageIcon icon = new ImageIcon("images/" + object.toString() + ".jpg");
	    JLabel label = new JLabel(icon);
		
	}
}