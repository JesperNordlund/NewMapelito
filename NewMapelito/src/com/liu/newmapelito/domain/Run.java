package com.liu.newmapelito.domain;

import java.awt.EventQueue;

import com.liu.newmapelito.ui.swing.MapWindow;

public class Run {

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapWindow.getInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
