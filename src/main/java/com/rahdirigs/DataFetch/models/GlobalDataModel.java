package com.rahdirigs.DataFetch.models;

public class GlobalDataModel {
    private long recovered, cases, deaths;

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getCases() {
        return cases;
    }

    public void setCases(long cases) {
        this.cases = cases;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return "GlobalDataModel{" +
                "recovered=" + recovered +
                ", cases=" + cases +
                ", deaths=" + deaths +
                '}';
    }
}
