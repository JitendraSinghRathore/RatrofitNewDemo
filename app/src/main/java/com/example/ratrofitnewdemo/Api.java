package com.example.ratrofitnewdemo;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @POST("search")
    @FormUrlEncoded
    Call<Demo>getData(@FieldMap HashMap<String,String> search_parms);
}
