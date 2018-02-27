package com.liu.newmapelito.ui.views;

import com.liu.newmapelito.ui.swing.MapWindow;

public class BrowsingView {
	
private static BrowsingView instance;
	

	public static synchronized BrowsingView getInstance(){
        if(instance == null){
            instance = new BrowsingView();
        }
        return instance;
    }
	
	public void show() {
		
		MapWindow.getInstance().removePanel();
		MapWindow.getInstance().addButton();
	}

}
