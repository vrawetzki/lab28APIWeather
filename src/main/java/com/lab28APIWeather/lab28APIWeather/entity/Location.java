package com.lab28APIWeather.lab28APIWeather.entity;

public class Location {

	private Long latitude;
	private Long longitude;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(Long latitude, Long longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
