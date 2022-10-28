package com.example.geektrust.arrivalanddepart;

import com.example.geektrust.entities.Train;

public class TimeOfArrivingTrains {
	public static void aTrainArrival(String[] train) {

		System.out.print("ARRIVAL " + "TRAIN_A " +"ENGINE ");
		loop(train);
		System.out.println();

	}

	public static void bTrainArrival(String[] train) {

		System.out.print("ARRIVAL " + "TRAIN_B " +  "ENGINE ");
		loop(train);
		System.out.println();

	}

	public static void loop(String[] train) {
		for (int k = 0; k < train.length; k++) {

			if ((Train.bTrain.containsKey(train[k]) && Train.bTrain.get(train[k]) >= Train.bTrain.get("HYB"))) {

				printTrainA(train[k]);

			} else if (Train.aTrain.containsKey(train[k]) && Train.aTrain.get(train[k]) >= Train.aTrain.get("HYB")) {
				printTrainB(train[k]);

			}
		}

	}

	public static void printTrainA(String train) {
		System.out.print(train + " ");
		if (!train.equals("HYB")) {
			Train.departurePlace.add(train);
			Train.departureDistance.add(Train.bTrain.get(train) - Train.bTrain.get("HYB"));

		}
	}
	public static void printTrainB(String train) {
		System.out.print(train + " ");
		if (!train.equals("HYB")) {
			Train.departurePlace.add(train);
			Train.departureDistance.add(Train.aTrain.get(train) - Train.aTrain.get("HYB"));

		}
	}
}
