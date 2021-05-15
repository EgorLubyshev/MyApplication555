package com.example.myapplication555;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

 class UserLoader extends AsyncTask<String, Integer, Answer> {
    TextView textView;
    int id=1;
    UserLoader(TextView textView){
        this.textView=textView;
    }
    @Override
    protected Answer doInBackground(String... strings) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(strings[0])
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserServers userServers = retrofit.create(UserServers.class);
        Call<Answer> call = userServers.getUsers(id);

        try {
            Response<Answer> response = call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    protected void onPostExecute(Answer answer) {
        if(answer!=null){
            textView.setText(answer.getUsers());
        }else {
            textView.setText("Ошибка");
        }


    }

}
