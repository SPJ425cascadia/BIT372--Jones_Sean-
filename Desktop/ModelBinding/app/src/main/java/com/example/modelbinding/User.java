package com.example.modelbinding;
import androidx.lifecycle.MutableLiveData;
//user save
public class User {
    public MutableLiveData<String> email;
    public MutableLiveData<String> name;


    public User(String name, String email) {
        this.name = new MutableLiveData<>();
        this.name.setValue(name);
        this.email = new MutableLiveData<>();
        this.email.setValue(email);

    }
}
