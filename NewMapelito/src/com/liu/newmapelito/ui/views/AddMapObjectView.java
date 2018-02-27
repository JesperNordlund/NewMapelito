package com.liu.newmapelito.ui.views;

import com.liu.newmapelito.ui.swing.MapWindow;
import com.liu.newmapelito.ui.swing.MenuPanel;

public class AddMapObjectView {
	
	private static AddMapObjectView instance;


	public static synchronized AddMapObjectView getInstance(){
        if(instance == null){
            instance = new AddMapObjectView();
        }
        return instance;
    }
	
	public void show() {
		
		MapWindow.getInstance().showPanel(MenuPanel.getInstance());
		
	}


}
