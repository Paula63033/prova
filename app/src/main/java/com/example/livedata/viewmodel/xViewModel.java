package com.example.livedata.viewmodel;

import android.content.Intent;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.livedata.view.MainActivity;

public class xViewModel extends ViewModel {
    public MutableLiveData <String> x;

    //constructor:
    public xViewModel(){
        this.x = new MutableLiveData<>();
        this.x.setValue("HELLO WORLD!");
    }

    public void boton(){
        x.setValue("Paula");
    }
}
