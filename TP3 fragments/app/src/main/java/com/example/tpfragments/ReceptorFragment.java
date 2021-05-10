package com.example.tpfragments;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tpfragments.Validaciones.Dato;

public class ReceptorFragment extends Fragment {
TextView tvMensaje;
String strGuardado;
View layoutRhoot = null;


    public ReceptorFragment() {
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
        if(layoutRhoot==null) {
            layoutRhoot = inflater.inflate(R.layout.fragment_receptor, container, false);

            ObtenerReferencias();
        }
        tvMensaje.setText(strGuardado);



        return layoutRhoot;
    }

    private void ObtenerReferencias(){
        tvMensaje = (TextView) layoutRhoot.findViewById(R.id.tvMensaje);


    }

    public void setMensaje(String mensaje){


            strGuardado = mensaje;


    }
}