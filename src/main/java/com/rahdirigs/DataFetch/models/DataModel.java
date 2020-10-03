package com.rahdirigs.DataFetch.models;

public class DataModel {
    GlobalDataModel globalData;
    CountryDataModel countryData;

    public DataModel(GlobalDataModel globalData, CountryDataModel countryData) {
        this.globalData = globalData;
        this.countryData = countryData;
    }

    public GlobalDataModel getGlobalData() {
        return globalData;
    }

    public CountryDataModel getCountryData() {
        return countryData;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "globalData=" + globalData +
                ", countryData=" + countryData +
                '}';
    }
}
