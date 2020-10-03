package com.rahdirigs.DataFetch;

import com.rahdirigs.DataFetch.models.CountryDataModel;
import com.rahdirigs.DataFetch.models.DataModel;
import com.rahdirigs.DataFetch.models.GlobalDataModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.CompletableFuture;

public class DataFetchService {
    public DataModel getData(String countryName) {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://coronavirus-19-api.herokuapp.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        covidAPI covidapi = retrofit.create(covidAPI.class);

        CompletableFuture<GlobalDataModel> globalCallback = new CompletableFuture<>();
        covidapi.getGlobalData().enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<GlobalDataModel> call, Response<GlobalDataModel> response) {
                globalCallback.complete(response.body());
            }

            @Override
            public void onFailure(Call<GlobalDataModel> call, Throwable t) {
                globalCallback.completeExceptionally(t);
            }
        });

        CompletableFuture<CountryDataModel> countryCallback = new CompletableFuture<>();
        covidapi.getCountryData(countryName).enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<CountryDataModel> call, Response<CountryDataModel> response) {
                countryCallback.complete(response.body());
            }

            @Override
            public void onFailure(Call<CountryDataModel> call, Throwable t) {
                countryCallback.completeExceptionally(t);
            }
        });

        GlobalDataModel globalDataModel = globalCallback.join();
        CountryDataModel countryDataModel = countryCallback.join();

        return new DataModel(globalDataModel, countryDataModel);
    }
}
