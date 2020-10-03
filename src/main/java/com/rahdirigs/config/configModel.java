package com.rahdirigs.config;

public class configModel {
    private int refreshInterval;
    private String countryName, countryCode;

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public configModel() {
        this.refreshInterval = 300;
        this.countryName = "India";
        this.countryCode = "IN";
    }
}
