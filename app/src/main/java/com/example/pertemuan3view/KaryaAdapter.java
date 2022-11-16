package com.example.pertemuan3view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class KaryaAdapter extends RecyclerView.Adapter<KaryaAdapter.KaryaViewHolder> {
    String data1[], data2[], data3[];
    int images[];
    BerandaFragment context;
    public KaryaAdapter(BerandaFragment ct, String s1[], String s2[], String s3[], int  img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }
    @NonNull
    @Override
    public KaryaAdapter.KaryaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_karyaseni, parent, false);
        return new KaryaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KaryaAdapter.KaryaViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.star.setText(data3[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class KaryaViewHolder extends
            RecyclerView.ViewHolder {
        TextView myText1, myText2, star;
        ImageView myImage;
        ConstraintLayout mainLayout;
        public KaryaViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            star = itemView.findViewById(R.id.star);
            myImage = itemView.findViewById(R.id.myImages);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}