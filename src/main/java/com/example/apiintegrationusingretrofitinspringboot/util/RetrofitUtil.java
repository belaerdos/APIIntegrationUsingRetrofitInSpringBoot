package com.example.apiintegrationusingretrofitinspringboot.util;

import com.example.apiintegrationusingretrofitinspringboot.retrofitconstant.RestrofitConstant;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(RestrofitConstant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
