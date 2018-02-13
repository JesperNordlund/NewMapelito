package com.liu.newmapelito.data.data_transfer_objects;


public class MapObjectDTO {
	
	private static MapObjectDTO instance;
	
    public static synchronized MapObjectDTO getInstance(){
        if(instance == null){
            instance = new MapObjectDTO();
        }
        return instance;
    }
    
    public void saveObject() {
    	
    }
    
    public void loadObject() {
    	
    }
    
    

}
