package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {
    public int roomNumber;
    public int numberOfBeds;
    public boolean isBalcony;
    public boolean isSeeView;
    public BigDecimal pricePerNight;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeeView() {
        return isSeeView;
    }

    public void setSeeView(boolean seeView) {
        isSeeView = seeView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Room(int roomNumber, int numberOfBeds, boolean isBalcony,
                boolean isSeeView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeeView = isSeeView;
        this.pricePerNight = pricePerNight;


    }
}
