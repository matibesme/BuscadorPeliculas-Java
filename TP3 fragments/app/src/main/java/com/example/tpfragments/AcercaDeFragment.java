package com.example.tpfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class AcercaDeFragment extends Fragment {

    ImageView imgPerfil;
    View layoutRhoot;

    public AcercaDeFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layoutRhoot = inflater.inflate(R.layout.fragment_acerca_de, container, false);

        ObtenerReferencias();


        return layoutRhoot;
    }
    private void ObtenerReferencias(){
        //imgPerfil= (ImageView) layoutRhoot.findViewById(R.id.imgPerfil);

    }
}