package com.example.test.petrolstation.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by test on 2015/9/25.
 */
public class Station implements Parcelable {
    private int id;
    private int distance;
    private String name;
    private String areaname;
    private String address;
    private String brandname;
    private String position;
    private String lat;
    private String lon;
    private ArrayList<Petrol> priceList;
    private ArrayList<Petrol> gaspriceList;

    public ArrayList<Petrol> getPriceList() {
        return priceList;
    }

    public void setPriceList(ArrayList<Petrol> priceList) {
        this.priceList = priceList;
    }

    public ArrayList<Petrol> getGaspriceList() {
        return gaspriceList;
    }

    public void setGaspriceList(ArrayList<Petrol> gaspriceList) {
        this.gaspriceList = gaspriceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(areaname);
        dest.writeString(brandname);
        dest.writeString(position);
        dest.writeString(lat);
        dest.writeString(lon);
        dest.writeList(priceList);
        dest.writeList(gaspriceList);
    }

    public static final Parcelable.Creator<Station> CREATOR = new Parcelable
            .Creator<Station>() {
        @Override
        public Station createFromParcel(Parcel source) {
            Station station = new Station();
            station.id = source.readInt();
            station.name = source.readString();
            station.areaname = source.readString();
            station.brandname = source.readString();
            station.position = source.readString();
            station.lat = source.readString();
            station.lon = source.readString();
            station.priceList = source.readArrayList(Petrol.class.getClassLoader());
            station.gaspriceList = source.readArrayList(Petrol.class.getClassLoader());
            return station;
        }

        @Override
        public Station[] newArray(int size) {
            return new Station[0];
        }
    };
}

