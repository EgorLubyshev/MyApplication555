package com.example.myapplication555;

import java.util.ArrayList;

 class Answer {
    boolean status;
    ArrayList<User> data;

    String getUsers() {
        String res = "";
        for (User user : data) {
            res += user.toString() + "\n";

        }
        return res;
    }
}
