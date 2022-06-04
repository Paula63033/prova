package com.example.livedata.viewmodel;

import android.content.Intent;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.livedata.view.MainActivity;

public class XViewModel extends ViewModel{

    public MutableLiveData <String> contingut;

    //constructor:
    public XViewModel(){
        this.contingut = new MutableLiveData<>();
        this.contingut.setValue("HELLO WORLD!");
    }

    public void boton(){
        this.contingut.setValue("Paula");
    }
}
