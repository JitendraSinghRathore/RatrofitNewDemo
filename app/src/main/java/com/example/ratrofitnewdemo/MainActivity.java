package com.example.ratrofitnewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void HomeApi()
    {
        Api apiInterface = ApiClient.getClient().create(Api.class);
        final HashMap<String,String> search_parms=new HashMap<>();
        search_parms.put("search","1");
        search_parms.put("location","Warsaw, Poland");
        search_parms.put("city","Warszawa");
        search_parms.put("state","Masovian Voivodeship");
        search_parms.put("country","Poland");
        search_parms.put("lat","52.2297");
        search_parms.put("lon","21.0122");
        search_parms.put("dateselect","13-08-2019");
        search_parms.put("timeselect","07:00 PM");
        search_parms.put("persons","2");
        search_parms.put("tzone","Europe/Warsaw");
        search_parms.put("restname","");
        search_parms.put("cuisines","italian");
        search_parms.put("orderby","distance");
        search_parms.put("order","ASC");
        Call<Demo> call=apiInterface.getData(search_parms);
        call.enqueue(new Callback<Demo>() {
            @Override
            public void onResponse(Call<Demo> call, Response<Demo> response) {
                if (response.isSuccessful())
                {

                   /* Demo demo=new Demo();
                  *//* List<Demo.RestaurantsBean>list=new ArrayList<>();
                   Demo.RestaurantsBean bean=new Demo.RestaurantsBean();
                   for (int i=0;i<list.size();i++)
                   {
                       bean.getData().get(i).getOwner_id();
                   }*/

                    List<Demo.RestaurantsBean> list=new ArrayList<>();
                    Demo.RestaurantsBean bean=new Demo.RestaurantsBean();

                    for (int i=0;i<list.size();i++)
                    {
                        bean.getData().get(i).getOwner_id();
                    }
                }
            }

            @Override
            public void onFailure(Call<Demo> call, Throwable t) {

            }
        });

    }
}
