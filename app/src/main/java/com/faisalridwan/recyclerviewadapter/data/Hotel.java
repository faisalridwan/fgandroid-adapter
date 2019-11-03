package com.faisalridwan.recyclerviewadapter.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Hotel implements Parcelable {
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

	protected Hotel(Parcel in) {
		hotelRate = in.readString();
		hotelImg = in.readString();
		hotelPrice = in.readString();
		hotelName = in.readString();
		hotelLoc = in.readString();
	}

	public static final Creator<Hotel> CREATOR = new Creator<Hotel>() {
		@Override
		public Hotel createFromParcel(Parcel in) {
			return new Hotel(in);
		}

		@Override
		public Hotel[] newArray(int size) {
			return new Hotel[size];
		}
	};

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(hotelRate);
		parcel.writeString(hotelImg);
		parcel.writeString(hotelPrice);
		parcel.writeString(hotelName);
		parcel.writeString(hotelLoc);
	}
}
