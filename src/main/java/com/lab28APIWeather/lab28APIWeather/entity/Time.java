package com.lab28APIWeather.lab28APIWeather.entity;

public class Time {

	private String startPeriodName;
	private Long startValidTime;
	private String tempLabel;
	
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Time(String startPeriodName, Long startValidTime, String tempLabel) {
		super();
		this.startPeriodName = startPeriodName;
		this.startValidTime = startValidTime;
		this.tempLabel = tempLabel;
	}

	public String getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(String startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	public Long getStartValidTime() {
		return startValidTime;
	}

	public void setStartValidTime(Long startValidTime) {
		this.startValidTime = startValidTime;
	}

	public String getTempLabel() {
		return tempLabel;
	}

	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
	}

	@Override
	public String toString() {
		return "Time [startPeriodName=" + startPeriodName + ", startValidTime=" + startValidTime + ", tempLabel="
				+ tempLabel + "]";
	}
	
	
}
