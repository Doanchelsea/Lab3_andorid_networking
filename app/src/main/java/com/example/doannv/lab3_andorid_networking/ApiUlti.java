package com.example.doannv.lab3_andorid_networking;

public class ApiUlti {
    public static RetrofitInterface getService() {
        return RetrofitAPI.getRetrofit("http://dotplays.com/android/").create(RetrofitInterface.class);
    }
}
