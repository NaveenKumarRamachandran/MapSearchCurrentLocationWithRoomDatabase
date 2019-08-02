package com.naveen.samplemap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitCallApi {

    public static final String BASE_URL_2="http://techyhire.epizy.com/";


    public static Retrofit retrofit;

    public static Retrofit getRetrofit() {

        if(retrofit==null)
        {

            //retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL_2).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }


}
