package com.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RailWay {
	@Id
	private int TrainNo;
	private int Arrival;
	private String Trainname;
	private int Fare;
	RailWay(){}
	public int getTrainNo() {
		return TrainNo;
	}
	public void setTrainNo(int trainNo) {
		TrainNo = trainNo;
	}
	public int getArrival() {
		return Arrival;
	}
	public void setArrival(int arrival) {
		Arrival = arrival;
	}
	public String getTrainname() {
		return Trainname;
	}
	public void setTrainname(String trainname) {
		Trainname = trainname;
	}
	public int getFare() {
		return Fare;
	}
	public void setFare(int fare) {
		Fare = fare;
	}
	

}
