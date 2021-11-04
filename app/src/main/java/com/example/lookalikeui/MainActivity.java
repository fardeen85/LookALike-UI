package com.example.lookalikeui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lookalikeui.Adapter.CustomAdapter;
import com.example.lookalikeui.Pojo.Pojo;
import com.example.lookalikeui.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding activityMainBinding;
    ArrayList<Pojo> pojonewArrayList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        loadnews();
        customAdapter = new CustomAdapter(this,pojonewArrayList);
        activityMainBinding.recyclerview.setAdapter(customAdapter);





    }


    public void loadnews(){


        pojonewArrayList =  new ArrayList<>();

        pojonewArrayList.add(new Pojo(

                "https://www.cnet.com/a/img/fC2Ou9vKDXIiN4ScLUa-A1foTSg=/940x0/2021/05/18/a9fd6189-6ead-47e4-a627-6c0bf3460c86/android-12-logo.jpg",
                "Introducing Android 12",
                "Introducing Android 12"
                ,"The latest Android release delivers even more personal, safe and effortless experiences on your device. With a redesigned UI, new privacy features and more",
                "https://cdn.vox-cdn.com/thumbor/YHfKvMFzpSu_j2AY8KoMefG6rTY=/1400x1050/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19086219/Android_logo_stacked__RGB_.jpg",
                "Android developers",
                "4-nov-2021"



        ));

        pojonewArrayList.add(new Pojo(

                "https://www.xda-developers.com/files/2021/02/Android-12-Logo-option-5.png",
                "Introducing Android 12",
                "Introducing Android 12"
                ,"The latest Android release delivers even more personal, safe and effortless experiences on your device. With a redesigned UI, new privacy features and more",
                "https://cdn.vox-cdn.com/thumbor/YHfKvMFzpSu_j2AY8KoMefG6rTY=/1400x1050/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19086219/Android_logo_stacked__RGB_.jpg",
                "Android developers",
                "4-nov-2021"



        ));

        pojonewArrayList.add(new Pojo(

                "https://cdn.vox-cdn.com/thumbor/Iub-AXC9N2Gl7B_DSSP6GgsnGxs=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/22311867/VRG_1777_Android_12_005.jpg",
                "Introducing Android 12",
                "Introducing Android 12"
                ,"The latest Android release delivers even more personal, safe and effortless experiences on your device. With a redesigned UI, new privacy features and more",
                "https://cdn.vox-cdn.com/thumbor/YHfKvMFzpSu_j2AY8KoMefG6rTY=/1400x1050/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19086219/Android_logo_stacked__RGB_.jpg",
                "Android developers",
                "4-nov-2021"



        ));



    }}