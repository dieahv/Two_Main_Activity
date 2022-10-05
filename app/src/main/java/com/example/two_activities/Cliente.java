package com.example.two_activities;

import java.io.Serializable;

public class Cliente implements Serializable {

    public String nameCus;
    public String surnameCus;
    public int ageCus;
    public double highestCus;
    public double weightCus;
    public double moneyCus;

    public Cliente(String nameCus, String surnameCus, int ageCus, double highestCus, double weightCus, double moneyCus) {
        this.nameCus = nameCus;
        this.surnameCus = surnameCus;
        this.ageCus = ageCus;
        this.highestCus = highestCus;
        this.weightCus = weightCus;
        this.moneyCus = moneyCus;
    }
    public Cliente(){

    }
    public String getNameCus() {return nameCus;}
    public void setNameCus( String nameCus) {this.nameCus = nameCus;}

    public String getsurnameCus() {return surnameCus;}
    public void setSurnameCus( String surnameCus) {this.surnameCus = surnameCus;}

    public int getAgeCus() {return ageCus;}
    public void setAgeCus( int ageCus) {this.ageCus = ageCus;}

    public double getHighestCus() {return highestCus;}
    public void setHighestCus( double highestCus) {this.highestCus = highestCus;}

    public double getWeightCus() {return weightCus;}
    public void setWeightCus( int weightCus) {this.weightCus = weightCus;}

    public double getMoneyCus() {return moneyCus;}
    public void setMoneyCus( double moneyCus) {this.moneyCus = moneyCus;}

}



