package com.example.tpfragments;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


import com.example.tpfragments.Validaciones.Dato;

public class EnviadoFragment extends Fragment {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    EditText edtRecibirTexto;
    Button btnEnviarTexto;
    View layoutRhoot;

    Button btnFoto;


    public EnviadoFragment() {
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
        layoutRhoot = inflater.inflate(R.layout.fragment_enviado, container, false);

        ObtenerReferencias();
        SetearListners();

        return layoutRhoot;
    }

    private void ObtenerReferencias(){
        edtRecibirTexto = (EditText) layoutRhoot.findViewById(R.id.edtRecibirTexto);
        btnEnviarTexto = (Button) layoutRhoot.findViewById(R.id.btnEnviarTexto);
      //  btnFoto = (Button) layoutRhoot.findViewById(R.id.btnFoto);

    }





    public void SetearListners() {
        btnEnviarTexto.setOnClickListener(btnEnviarTexto_Click);
       // btnFoto.setOnClickListener(btnFoto_Click);
    }
    View.OnClickListener btnEnviarTexto_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strTextRecibido;

            strTextRecibido = edtRecibirTexto.getText().toString();

            MainActivity actividadContenedora;
            actividadContenedora = (MainActivity) getActivity();


            actividadContenedora.EnviarMensaje(strTextRecibido);

        }
    };




  /*  public void tomarFoto(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    View.OnClickListener btnFoto_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            tomarFoto(view);

            }

           Bundle extras= intent.getExtras();
            Bitmap imageBitmap=(Bitmap) extras.get("data");
            Dato.img=imageBitmap;



    };*/
}