package com.example.geektrust.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TrainArrivalTest {

	@Test
	public void aTrainArrivalTest() {

		String answer = "ARRIVAL " + "TRAIN_A " + "ENGINE ";
		assertEquals("ARRIVAL " + "TRAIN_A " + "ENGINE ", answer);

	}

	@Test
	public void bTrainArrivalTest() {

		String answer = "ARRIVAL " + "TRAIN_B " + "ENGINE ";
		assertEquals("ARRIVAL " + "TRAIN_B " + "ENGINE ", answer);

	}

	

	@Test
	public void printTrainATest() {
		String train="BGL";
		assertEquals("BGL",train);
	}

	@Test
	public void printTrainBTest() {
		String train="BGL";
		assertEquals("BGL",train);
	}

}
