package com.alexd.primerevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adaptadores.AdaptadorEst;
import Estudiante.Estudiante;

public class ListaEstudiantes extends AppCompatActivity {

    private ListView listaEstu;
    public static List<Estudiante> lstEstudiante = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);
        this.listaEstu= findViewById(R.id.lstvEstu);

        this.listaEstu.setAdapter(new AdaptadorEst(this, R.layout.plantilla_lista, lstEstudiante));
    }
}
