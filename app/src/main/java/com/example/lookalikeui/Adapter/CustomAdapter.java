package com.example.lookalikeui.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.lookalikeui.DetailActivity;
import com.example.lookalikeui.MainActivity;
import com.example.lookalikeui.Pojo.Pojo;
import com.example.lookalikeui.R;
import com.example.lookalikeui.databinding.CustomlayoutBinding;

import java.net.URL;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.mviewholder>{

    ArrayList<Pojo> pojoArrayList = new ArrayList<>();
    Context context;

    public CustomAdapter(Context Context,ArrayList<Pojo> arrayList) {

        this.context = Context;
        this.pojoArrayList = arrayList;
    }

    @NonNull
    @Override
    public mviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new mviewholder(CustomlayoutBinding.inflate(inflater,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull mviewholder holder,int position) {

        //Set view from URL

        Pojo p = pojoArrayList.get(position);


        try {
            final URL image_thumb =  new URL(pojoArrayList.get(position).getImg_thumb()+"");
            Log.d("Image_Url_thumb",image_thumb+"");

            RequestOptions options = new RequestOptions().centerCrop()
                    .error(R.mipmap.ic_launcher_round);
            Glide.with(context).load(image_thumb).apply(options).into(holder.itemview.imgThumb);

            holder.itemview.txtcontent.setText(pojoArrayList.get(position).getContent_src());
            holder.itemview.txtCat.setText(pojoArrayList.get(position).getNewcat());
            holder.itemview.txtDate.setText(pojoArrayList.get(position).getNews_date());
            holder.itemview.txtcontentdescript.setText(pojoArrayList.get(position).getNews_desc());
            holder.itemview.txtcontentheading.setText(pojoArrayList.get(position).getTitle());

            final URL image_logo =  new URL(pojoArrayList.get(position).getNewslogo()+"");
            Glide.with(context).load(image_logo).apply(options).into(holder.itemview.imgLogo);





        } catch (Exception e) {
            e.printStackTrace();
            Log.d("TAG",e.getMessage());
        }

        holder.itemview.imgThumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("Content",p.getContent_src());
                i.putExtra("catagory",p.getNewcat());
                i.putExtra("Date",p.getNews_date());
                i.putExtra("contentdesc",p.getNews_desc());
                i.putExtra("heading",p.getTitle());
                i.putExtra("imgthumb",p.getImg_thumb());
                i.putExtra("imglogo",p.getNewslogo());
                i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                context.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return pojoArrayList.size();
    }

    public class mviewholder extends RecyclerView.ViewHolder{

       CustomlayoutBinding itemview;

       public mviewholder(CustomlayoutBinding itemview){
           super(itemview.getRoot());
           this.itemview = itemview;

       }
    }
}
