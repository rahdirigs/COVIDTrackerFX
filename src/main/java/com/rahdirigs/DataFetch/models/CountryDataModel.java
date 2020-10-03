package com.rahdirigs.DataFetch.models;

public class CountryDataModel {
    private String country;
    private long recovered, cases, critical, deathsPerOneMillion, active, casesPerOneMillion, deaths, testsPerOneMillion,
            todayCases, todayDeaths, totalTests;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

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

    public long getCritical() {
        return critical;
    }

    public void setCritical(long critical) {
        this.critical = critical;
    }

    public long getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(long deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public long getActive() {
        return active;
    }

    public void setActive(long active) {
        this.active = active;
    }

    public long getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(long casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(long testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public long getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(long todayCases) {
        this.todayCases = todayCases;
    }

    public long getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(long todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public long getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(long totalTests) {
        this.totalTests = totalTests;
    }

    @Override
    public String toString() {
        return "CountryDataModel{" +
                "country='" + country + '\'' +
                ", recovered=" + recovered +
                ", cases=" + cases +
                ", critical=" + critical +
                ", deathsPerOneMillion=" + deathsPerOneMillion +
                ", active=" + active +
                ", casesPerOneMillion=" + casesPerOneMillion +
                ", deaths=" + deaths +
                ", testsPerOneMillion=" + testsPerOneMillion +
                ", todayCases=" + todayCases +
                ", todayDeaths=" + todayDeaths +
                ", totalTests=" + totalTests +
                '}';
    }
}
