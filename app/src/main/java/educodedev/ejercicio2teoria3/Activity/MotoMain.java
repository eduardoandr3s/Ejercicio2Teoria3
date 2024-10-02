package educodedev.ejercicio2teoria3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import educodedev.ejercicio2teoria3.R;
import educodedev.ejercicio2teoria3.models.Coche;
import educodedev.ejercicio2teoria3.models.Moto;

public class MotoMain extends AppCompatActivity {

    private Button btnCancelarMoto, btnCrearMoto;
    private EditText editTxtMarcaMoto, editTxtModeloMoto, editTxtCilindradaMoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto_main);
        inicializarVistas();
        btnCancelarMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnCrearMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Moto moto = new Moto(editTxtMarcaMoto.getText().toString(),
                        editTxtModeloMoto.getText().toString(),
                        editTxtCilindradaMoto.getText().toString());

                if (editTxtMarcaMoto.getText().toString().isEmpty() ||
                        editTxtModeloMoto.getText().toString().isEmpty() ||
                        editTxtCilindradaMoto.getText().toString().isEmpty()) {
                    Toast.makeText(MotoMain.this, "Rellena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("MOTO", moto);
                    intent.putExtras(bundle);
                    finish();
                }
            }
        });

    }

    private void inicializarVistas() {
        btnCancelarMoto = findViewById(R.id.btnCancelarMotoMain);
        btnCrearMoto = findViewById(R.id.btnCrearMotoMain);

        editTxtMarcaMoto = findViewById(R.id.editTxtMarcaMotoMain);
        editTxtModeloMoto = findViewById(R.id.editTextText2);
        editTxtCilindradaMoto = findViewById(R.id.editTextText3);
    }
}