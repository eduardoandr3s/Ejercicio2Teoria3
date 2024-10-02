package educodedev.ejercicio2teoria3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import educodedev.ejercicio2teoria3.R;
import educodedev.ejercicio2teoria3.models.Bici;
import educodedev.ejercicio2teoria3.models.Moto;

public class BiciMain extends AppCompatActivity {


    private Button btnCancelarBici, btnCrearBici;
    private EditText editTxtMarcaBici, editTxtPulgadasBici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bici_main);
        inicializarVistas();

        btnCancelarBici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCrearBici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bici bici = new Bici(editTxtMarcaBici.getText().toString(),
                        editTxtPulgadasBici.getText().toString());

                if (editTxtMarcaBici.getText().toString().isEmpty() ||editTxtPulgadasBici.getText().toString().isEmpty()){
                    Toast.makeText(BiciMain.this, "Rellena todos los campos", Toast.LENGTH_SHORT).show();

                }else{

                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("BICI", bici);
                    intent.putExtras(bundle);
                    setResult(RESULT_OK, intent);
                    finish();
                }


            }
        });

    }

    private void inicializarVistas() {
        editTxtMarcaBici = findViewById(R.id.editTxtMarcaBiciMain);
        editTxtPulgadasBici = findViewById(R.id.editTxtPulgadasBiciMain);

        btnCancelarBici = findViewById(R.id.btnCancelarBiciMain);
        btnCrearBici = findViewById(R.id.btnCrearBiciMain);


    }
}