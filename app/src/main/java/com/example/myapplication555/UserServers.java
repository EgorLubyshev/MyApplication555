package com.example.myapplication555;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

 interface UserServers{
    @GET("get_user.php")
    Call<Answer> getUsers(
            @Query("id") int id
    );

    @GET("set_user.php")
    Call<Answer> setUsers(
            @Query("login") String login,
            @Query("password") String pass,
            @Query("mail") String mail
    );
}
