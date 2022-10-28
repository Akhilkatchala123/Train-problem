package com.example.geektrust.arrivalanddepart;

import com.example.geektrust.entities.Train;

public class TimeOfDepartingTrains {

	static int count = 0;
	static int index = 0;
	
	public static void departure() {

		System.out.print("DEPARTURE " + "TRAIN_AB " +  "ENGINE "+  "ENGINE ");

		
		while (count < Train.departureDistance.size()) {
			int max = Integer.MIN_VALUE;
			for (int z = 0; z < Train.departureDistance.size(); z++) {
				if (Train.departureDistance.get(z) > max) {
					max = Train.departureDistance.get(z);
					index = z;
				}
			}
			count++;
			Train.departureDistance.set(index, 0);
			if (!Train.departurePlace.get(index).equals("HYB")) {
				System.out.print(Train.departurePlace.get(index) + " ");
			}

		}

	}
}
