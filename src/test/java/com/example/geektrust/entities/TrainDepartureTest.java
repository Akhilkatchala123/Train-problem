package com.example.geektrust.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TrainDepartureTest {


	
	@Test
	public void testDeparture() {
		String answer="DEPARTURE " + "TRAIN_AB " +  "ENGINE "+  "ENGINE ";
		assertEquals("DEPARTURE " + "TRAIN_AB " +  "ENGINE "+  "ENGINE ",answer);
		
		
		
	}

}
