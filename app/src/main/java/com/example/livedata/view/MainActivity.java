package com.example.livedata.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.livedata.R;
import com.example.livedata.databinding.ActivityMainBinding;
import com.example.livedata.viewmodel.xViewModel;

public class MainActivity extends AppCompatActivity {

    private xViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(xViewModel.class);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);


        //observable
        viewModel.x.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                //si cambia el textView fem un toast
                Toast.makeText(MainActivity.this, "He observat el canvi", Toast.LENGTH_SHORT).show();
            }
        });

    }
}