package com.example.hieunguyen.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;


public class Product extends BaseObservable {
    private int id,image,price;
    private String name,type;

    public Product() {
    }

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView view, int resource){
        view.setImageResource(resource);
    }

    public Product(int id, String name, String type, int price, int img) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.image = img;
    }

    @Bindable
    public int getId() {
        return id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        notifyPropertyChanged(BR.type);
    }

    @Bindable
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }

    @Bindable
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }
}
