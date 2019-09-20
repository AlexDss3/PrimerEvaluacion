package com.alexd.primerevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Estudiante.Estudiante;
import static com.alexd.primerevaluacion.ListaEstudiantes.lstEstudiante;

public class NuevoEstudiante extends AppCompatActivity {

    private EditText nom,cod,mat,p1,p2,p3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_estudiante);
        this.nom= findViewById(R.id.edtNombre);
        this.cod=findViewById(R.id.edtCodigo);
        this.mat=findViewById(R.id.edtMateria);
        this.p1=findViewById(R.id.edtParcial1);
        this.p2=findViewById(R.id.edtParcial2);
        this.p3=findViewById(R.id.edtParcial3);

    }

    public void Mensaje(){
        Toast.makeText(getApplicationContext(), "Alumno ingresado con éxito", Toast.LENGTH_LONG).show();
    }

    public void Procesar(View v){
        if(nom.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
        }else{
            if(cod.getText().toString().isEmpty()){
                Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
            }else{
                if(mat.getText().toString().isEmpty()){
                    Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                }else{
                    if(p1.getText().toString().isEmpty()){
                        Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                    }else{
                        if(p2.getText().toString().isEmpty()){
                            Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                        }else{
                            if(p3.getText().toString().isEmpty()){
                                Toast.makeText(this, "Campo Requerido", Toast.LENGTH_LONG).show();
                            }else{
                                final String nomb=nom.getText().toString();
                                final String codi=cod.getText().toString();
                                final String mate=mat.getText().toString();
                                final Double pa1=Double.parseDouble(p1.getText().toString());
                                final Double pa2=Double.parseDouble(p2.getText().toString());
                                final Double pa3=Double.parseDouble(p3.getText().toString());
                                final Double prome=(pa1*0.3)+(pa2*0.3)+(pa3*0.4);
                                Estudiante est=new Estudiante();
                                est.setNombre(nomb);
                                est.setCodigo(codi);
                                est.setMateria(mate);
                                est.setParcial1(pa1);
                                est.setParcial2(pa2);
                                est.setParcial3(pa3);
                                est.setPromedio(prome);
                                lstEstudiante.add(est);
                                Mensaje();
                                Intent listo= new Intent(this, MainActivity.class);
                                startActivity(listo);
                            }
                        }
                    }
                }
            }
        }
    }

}
