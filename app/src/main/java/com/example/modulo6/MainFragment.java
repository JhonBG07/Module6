package com.example.modulo6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);

        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Zazu",R.drawable.perro_1,false,6));
        mascotas.add(new Mascota("Bolt",R.drawable.perro_2,false,4));
        mascotas.add(new Mascota("Colmillo Blanco",R.drawable.perro_3,false,2));
        mascotas.add(new Mascota("Ezio",R.drawable.perro_4,false,10));
        mascotas.add(new Mascota("Altair",R.drawable.perro_5,false,1));
        mascotas.add(new Mascota("Max",R.drawable.boyero,false,25));
        mascotas.add(new Mascota("Edward",R.drawable.dalmata,false,14));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new PetAdapter(getContext(),mascotas));

        return view;
    }
}