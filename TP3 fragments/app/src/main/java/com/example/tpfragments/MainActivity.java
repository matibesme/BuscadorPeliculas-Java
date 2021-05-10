package com.example.tpfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;




public class MainActivity extends AppCompatActivity {

    EnviadoFragment fragmentEnviador;
    ReceptorFragment fragmentReceptor;
    AcercaDeFragment fragmentAcercaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        crearFragments();
        reemplazarFragmenbts(fragmentEnviador,false);
    }

    public void reemplazarFragmenbts(Fragment fragmento){
        reemplazarFragmenbts(fragmento,true);
    }

    public void reemplazarFragmenbts(Fragment fragmento, Boolean blnAddToBackStack){
        FragmentManager manager= getSupportFragmentManager();
        FragmentTransaction transision = manager.beginTransaction();

        transision.replace(R.id.frameLayout, fragmento, null );
        transision.addToBackStack(null);
        transision.commit();

    }

    private void crearFragments() {
        fragmentEnviador = new EnviadoFragment();
        fragmentReceptor = new ReceptorFragment();
        fragmentAcercaDe = new AcercaDeFragment();


    }

    public  void fragmentEnviador(){

        reemplazarFragmenbts(fragmentEnviador);
    }

    public  void fragmentAcercaDe(){
        reemplazarFragmenbts(fragmentAcercaDe);
    }

    public  void fragmentReceptor(){
        reemplazarFragmenbts(fragmentReceptor);

    }



    public void EnviarMensaje(String mensaje){
        fragmentReceptor.setMensaje(mensaje);
    }
}


