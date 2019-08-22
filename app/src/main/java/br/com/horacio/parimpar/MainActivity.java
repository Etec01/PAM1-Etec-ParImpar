package br.com.horacio.parimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNumero;
    TextView lblResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = findViewById(R.id.txtNumero);
        lblResultado = findViewById(R.id.lblResultado);
    }
    public void onProcessar(View v){

        if( txtNumero.getText().toString().isEmpty()){

            Toast.makeText(this,"Digite o Valor", Toast.LENGTH_LONG ).show();

        }else {
            int numero = Integer.parseInt(txtNumero.getText().toString());
            if (numero % 2 == 0) {
                lblResultado.setText("par");
            } else {
                lblResultado.setText("Impar");

            }
        }
    }
}
