package com.algonquin.weatherw.beans;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Region {

	private Integer id;
    private String city;
    private String weathertype;
	private String outfittype;

	/**
	 * @param id
	 * @param title
	 * @param content
	 * @param createTimestamp
	 */
//	public TextLog() {
//		// TODO Auto-generated constructor stub
//		super();
//	}

	public Region(Integer ID, String city, String weatherType, String outfitType) {
	//	super();
		this.id = ID;
		this.city = city;
		this.weathertype = weathertype;
		this.outfittype = outfittype;
	
		
		System.out.println(getId());
		System.out.println(getCity());
		System.out.println(getWeathertype());
		System.out.println(getOutfittype());
		
		
	}

	
	public Region() {
	//constructor for region
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWeathertype() {
		return weathertype;
	}

	public void setWeathertype(String weathertype) {
		this.weathertype = weathertype;
	}

	public String getOutfittype() {
		return outfittype;
	}

	public void setOutfittype(String outfittype) {
		this.outfittype = outfittype;
	}

	
	
	
	
	
	
	
	
	
}
