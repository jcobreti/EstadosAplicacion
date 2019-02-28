package android.edu.estadosaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAGLOG="JNG";
    private int contador;
    private EditText textoEntrada1;
    private TextView textoSalida, etiquetaSalida;
    //final     --> no se cambia ni se puede cambiar --> es constante
    //static    --> igual para todos --> número de manos --> todas las instancias tiene el mismo valor, aqui es statico para que tenga el mismo valor en todas las clases.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAGLOG,"CREAR ");
        contador=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoEntrada1=findViewById(R.id.entradaTxt);
        textoSalida=findViewById(R.id.salidaTxt);
        etiquetaSalida= findViewById(R.id.etiquetaSalida);

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("NVECES",contador);
        outState.putString("TXT",textoSalida.getText().toString());
        outState.putInt("TSV",textoSalida.getVisibility());
        outState.putInt("ESV",etiquetaSalida.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        contador= savedInstanceState.getInt("NVECES");
        textoSalida.setVisibility(savedInstanceState.getInt("TSV"));
        textoSalida.setText(savedInstanceState.getString("TXT"));
        etiquetaSalida.setVisibility(savedInstanceState.getInt("ESV"));


        Log.d(TAGLOG,"onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        Log.d(TAGLOG,"START");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAGLOG,"RESUME");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAGLOG,"PAUSE");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAGLOG,"STOP");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAGLOG,"DESTROY");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAGLOG,"RESTART");
        super.onRestart();
    }

    public void contador(View view) {
        contador++;
        textoSalida.setText(String.valueOf(contador));

        //Hacemos visibles los campos de salida
        textoSalida.setVisibility(View.VISIBLE);
        etiquetaSalida.setVisibility(View.VISIBLE);
    }
}







