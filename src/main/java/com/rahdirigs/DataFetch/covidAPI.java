package com.rahdirigs.DataFetch;

import com.rahdirigs.DataFetch.models.CountryDataModel;
import com.rahdirigs.DataFetch.models.GlobalDataModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface covidAPI {
    @GET("https://coronavirus-19-api.herokuapp.com/all")
    Call<GlobalDataModel> getGlobalData();

    @GET("https://coronavirus-19-api.herokuapp.com/countries/{countryName}")
    Call<CountryDataModel> getCountryData(@Path(value = "countryName") String countryName);
}
