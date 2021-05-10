package com.example.tpfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class MenuFragment extends Fragment {

    ImageButton btnReceptor, btnEnviar, btnAcercaDe;
    View layoutRhoot;

    public MenuFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        layoutRhoot =  inflater.inflate(R.layout.fragment_menu, container, false);

        ObtenerReferencias();

        SetearListners();

        return layoutRhoot;
    }

    private void SetearListners() {
        btnEnviar.setOnClickListener(btnEnviar_Click);
        btnReceptor.setOnClickListener(btnReceptor_Click);
        btnAcercaDe.setOnClickListener(btnAcercaDe_Click);
    }
    View.OnClickListener btnEnviar_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainActivity actividadContenedora;
            actividadContenedora=(MainActivity) getActivity();
            actividadContenedora.fragmentEnviador();
        }
    };


    View.OnClickListener btnReceptor_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainActivity actividadContenedora;
            actividadContenedora=(MainActivity) getActivity();
            actividadContenedora.fragmentReceptor();
        }
    };


    View.OnClickListener btnAcercaDe_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainActivity actividadContenedora;
            actividadContenedora=(MainActivity) getActivity();
            actividadContenedora.fragmentAcercaDe();
        }
    };

    private void ObtenerReferencias(){
        btnEnviar = (ImageButton)layoutRhoot.findViewById(R.id.btnReceptor);
        btnAcercaDe = (ImageButton)layoutRhoot.findViewById(R.id.btnAcercaDe);
        btnReceptor= (ImageButton) layoutRhoot.findViewById(R.id.btnEnviar);
    }

    /*private void HizoClick(){


        actividadContenedora.fragmentReceptor();
        actividadContenedora.fragmentAcercaDe();
    }
    */
}