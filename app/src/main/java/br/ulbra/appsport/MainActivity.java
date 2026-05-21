package br.ulbra.appsport;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtPassos;

    TextView txtTitulo, txtEscolha, txtSelecione, txtResultado;

    RadioButton rbCurto, rbMedio, rbLongo;

    CheckBox chkCorrendo;

    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPassos = findViewById(R.id.edtPassos);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtEscolha = findViewById(R.id.txtEscolha);
        txtSelecione = findViewById(R.id.txtSelecione);
        txtResultado = findViewById(R.id.txtResultado);

        rbCurto = findViewById(R.id.rbCurto);
        rbMedio = findViewById(R.id.rbMedio);
        rbLongo = findViewById(R.id.rbLongo);

        chkCorrendo = findViewById(R.id.chkCorrendo);

        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String passosTexto = edtPassos.getText().toString();

                if(passosTexto.isEmpty()){

                    txtResultado.setText("Digite a quantidade de passos!");
                    return;
                }

                int passos = Integer.parseInt(passosTexto);

                double tamanhoPasso = 0;

                if(rbCurto.isChecked()){

                    tamanhoPasso = 0.5;

                }
                else if(rbMedio.isChecked()){

                    tamanhoPasso = 0.7;

                }
                else if(rbLongo.isChecked()){

                    tamanhoPasso = 1.0;

                }

                double distancia = passos * tamanhoPasso;

                if(chkCorrendo.isChecked()){

                    distancia = distancia * 1.10;

                }

                txtResultado.setText("Distância percorrida: " + String.format("%.2f", distancia) + " metros");
            }
        });

    }
}