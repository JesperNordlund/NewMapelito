package com.liu.newmapelito.data.persistance;
import java.io.*;
import java.util.*;

public class DatabaseBroker {
    
    private static DatabaseBroker instance;
    
    public DatabaseBroker(){
        
    }
    
    //Return or create instance of DatabaseBroker.
    public static DatabaseBroker getInstance(){
        if(instance == null){
            instance = new DatabaseBroker();
        }
        return instance;
    }
    
    //Return list of MapObject
    public List<MapObject> getListOf(ObjectType Request){
        ArrayList<MapObject> ReturnList = makeListOf(Request);
        
        return ReturnList;
    }
    
    
    //Store MapObject in file.
    public void saveObject(MapObject Input){
    	try(FileWriter fw = new FileWriter("/home/axeta432/workspace/Mapelito/src/Test.txt", true);
    		    BufferedWriter bw = new BufferedWriter(fw);
    		    PrintWriter out = new PrintWriter(bw))
    		{
    		    out.print((String)Input.getObjectType);
    		    out.print(Input.getPosX);
    		    out.println(Input.getPosY);
    		} catch (IOException e) {
    		}
    }
    
    
    //Creates a list of MapObjects if any exists.
    public List<MapObject> makeListOf(ObjectType Request){
    	ArrayList<MapObject> List = new ArrayList<String>();
    	
    	for (int i = 0; i < List.size()+1; i++){
    		String tempText = List.get(i);
    		if (tempText.contains("Toilet")){
    			String[] tempArray = new String[3];
    			tempArray = tempText.split("/n");
    			List.add(new MapObject((objectType)tempArray[0], tempArray[1], tempArray[2]));
    		}
    	}
    	return List;
    }
    
    //Reads from file and returns an arraylist of objects as String.
    private static ArrayList readFromFile()
	{
	    ArrayList<String> obj = new ArrayList<String>();
	    try (BufferedReader br = new BufferedReader(new FileReader("/home/axeta432/workspace/Mapelito/src/Test.txt")))
	    {
	 
	        String sCurrentLine;		       
	        while ((sCurrentLine = br.readLine()) != null)
	        {
	            obj.add(sCurrentLine);		        	
	        }
	    }
	    
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    return obj;
	}
}
