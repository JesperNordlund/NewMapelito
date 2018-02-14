package com.liu.newmapelito.data.data_transfer_objects;

import java.util.List;

import com.liu.newmapelito.domain.objects.MapObject;
import com.liu.newmapelito.domain.objects.ObjectType;

public class MapObjectDTO {
	
	private static MapObjectDTO instance;
	
    public static synchronized MapObjectDTO getInstance(){
        if(instance == null){
            instance = new MapObjectDTO();
        }
        return instance;
    }
    
    /**
     * Asks the database broker for a list of all objects of chosen type
     * @param objectType
     * @return 
     */
    public List<MapObject> getMapObjects(ObjectType objectType) {
    	return DatabaseBroker.getInstance().getListOf(objectType);
    }
   
    /**
     * Saves the object for long term storage through the database broker
     * @param mapObject
     */
    public void saveMapObject(MapObject mapObject) {
		DatabaseBroker.getInstance().saveObject(mapObject);
	}

}
