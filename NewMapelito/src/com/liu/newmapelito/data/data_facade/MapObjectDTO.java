package com.liu.newmapelito.data.data_facade;

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
     * Asks the database broker for a list of all objects
     * and loads them onto the map.
     * @param objectType
     * @return 
     */
    public List<MapObject> loadAllMapObjects() {
    	return DatabaseBroker.getInstance().getEmAll();
    }
    
    /**
     * Asks the database broker for a list of all objects of specified type
     * @param objectType
     * @return
     */
    public List<MapObject> loadMapObjectByType(ObjectType objectType) {
    	return DatabaseBroker.getInstance().getObjectByType();
    }
   
    /**
     * Saves the object for long term storage via a database broker
     * @param mapObject
     */
    public void saveMapObject(MapObject mapObject) {
		DatabaseBroker.getInstance().saveObject(mapObject);
	}
    
    public MapObject getMapObjectById(int Id) {
    	
    	return MapObject;
    }

}
