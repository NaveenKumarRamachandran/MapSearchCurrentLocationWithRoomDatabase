package com.naveen.samplemap;

import com.naveen.samplemap.model.MapModel;
import com.naveen.samplemap.model.UserModel;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APICallback {
    @GET("read_all?")
    Call<List<MapModel>> getUserLocation(@Query("id") String path);

    @GET("signin.php")
    Call<List<UserModel>> getUserData(@Query("email") String userName, @Query("password")String password);

    @GET("signup.php")
    Call<List<UserModel>> getUserStatus( @Query("Password")String password,@Query("MailID")String mailID);

}
