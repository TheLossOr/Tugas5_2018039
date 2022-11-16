package com.example.pertemuan3view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BerandaFragment extends Fragment {
    RecyclerView recylerView;
    String s1[], s2[], s3[];
    int images[] = {
            R.drawable.pisangtempel,
            R.drawable.krayongunung,
            R.drawable.patung,
            R.drawable.gelastanah,
    };

    public BerandaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recylerView = view.findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.karya);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        KaryaAdapter appAdapter = new KaryaAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(view.getContext(),
                LinearLayoutManager.HORIZONTAL, false));
    }
}
