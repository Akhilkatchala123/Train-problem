package com.example.geektrust.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Train {

	
	public static List<String> departurePlace = new ArrayList<>();
	public static List<Integer> departureDistance = new ArrayList<>();
	public static final Map<String, Integer> aTrain ;
	public static final Map<String, Integer> bTrain ;
	static String repeat="ENGINE";
	static {
		aTrain = new HashMap<>();
		aTrain.put("CHN", 0);
		aTrain.put("SLM", 350);
		aTrain.put("BLR", 550);
		aTrain.put("KRN", 900);
		aTrain.put("HYB", 1200);
		aTrain.put("NGP", 1600);
		aTrain.put("ITJ", 1900);
		aTrain.put("BPL", 2000);
		aTrain.put("AGA", 2500);
		aTrain.put("NDL", 2700);
		
	}

    static {
    	bTrain = new HashMap<>();
    	bTrain.put("TVC", 0);
    	bTrain.put("SRR", 300);
    	bTrain.put("MAQ", 600);
    	bTrain.put("MAO", 1000);
    	bTrain.put("PNE", 1400);
    	bTrain.put("HYB", 2000);
    	bTrain.put("NGP", 2400);
    	bTrain.put("ITJ", 2700);
    	bTrain.put("BPL", 2800);
    	bTrain.put("PTA", 3800);
    	bTrain.put("NJP", 4200);
    	bTrain.put("GHY", 4700);
		
	}

	

	
	

}
