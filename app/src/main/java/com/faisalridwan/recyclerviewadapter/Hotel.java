package com.faisalridwan.recyclerviewadapter;

import com.google.gson.annotations.SerializedName;

public class Hotel{
	@SerializedName("hotel_rate")
	private String hotelRate;
	@SerializedName("hotel_img")
	private String hotelImg;
	@SerializedName("hotel_price")
	private String hotelPrice;
	@SerializedName("hotel_name")
	private String hotelName;
	@SerializedName("hotel_loc")
	private String hotelLoc;

	public void setHotelRate(String hotelRate){
		this.hotelRate = hotelRate;
	}

	public String getHotelRate(){
		return hotelRate;
	}

	public void setHotelImg(String hotelImg){
		this.hotelImg = hotelImg;
	}

	public String getHotelImg(){
		return hotelImg;
	}

	public void setHotelPrice(String hotelPrice){
		this.hotelPrice = hotelPrice;
	}

	public String getHotelPrice(){
		return hotelPrice;
	}

	public void setHotelName(String hotelName){
		this.hotelName = hotelName;
	}

	public String getHotelName(){
		return hotelName;
	}

	public void setHotelLoc(String hotelLoc){
		this.hotelLoc = hotelLoc;
	}

	public String getHotelLoc(){
		return hotelLoc;
	}

	@Override
 	public String toString(){
		return 
			"Hotel{" + 
			"hotel_rate = '" + hotelRate + '\'' + 
			",hotel_img = '" + hotelImg + '\'' + 
			",hotel_price = '" + hotelPrice + '\'' + 
			",hotel_name = '" + hotelName + '\'' + 
			",hotel_loc = '" + hotelLoc + '\'' + 
			"}";
		}
}
