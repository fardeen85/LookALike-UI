package com.example.lookalikeui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.lookalikeui.databinding.ActivityDetailBinding;

import java.net.URL;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding detailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailBinding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(detailBinding.getRoot());

        Intent r = getIntent();
        Bundle data = r.getExtras();

        detailBinding.txtcontentDetail.setText(data.getString("Content"));
        detailBinding.txtCatDetail.setText(data.getString("catagory"));
        detailBinding.txtDateDetail.setText(data.getString("Date"));
        detailBinding.txtcontentdescriptDetail.setText(data.getString("contentdesc"));
        detailBinding.txtcontentheadingDetail.setText(data.getString("heading"));
        String imagethumburl = data.getString("imgthumb");
        String imagelogo = data.getString("imglogo");

        RequestOptions options = new RequestOptions().centerCrop()
                .error(R.mipmap.ic_launcher_round);

        Glide.with(this).load(imagethumburl).apply(options).into(detailBinding.imgThumbDetail);
        Glide.with(this).load(imagelogo).apply(options).into(detailBinding.imgLogoDetail);





    }
}