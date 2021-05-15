package com.example.myapplication555;

import androidx.annotation.NonNull;

 class User{
    int id;
    String login, password,mail;

    @NonNull
    @Override
    public String toString() {
        return id+ ", "+login+", "+password+", "+mail;
    }
}