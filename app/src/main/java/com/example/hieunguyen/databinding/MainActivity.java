package com.example.hieunguyen.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hieunguyen.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Product product = new Product(1,"Samsung J3 Pro","Smart phone"
                ,3000000,R.drawable.android);
        binding.setProduct(product);
    }
}
