package educodedev.ejercicio2teoria3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import educodedev.ejercicio2teoria3.R;
import educodedev.ejercicio2teoria3.models.Coche;

public class CocheMain extends AppCompatActivity {

    private Button btnCancelarCoche, btnCrearCoche;
    private EditText editTxtMarcaCoche, editTxtModeloCoche, editTxtColorCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coche_main);

        inicializarVistas();
        btnCancelarCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                Intent intent = new Intent(CocheMain.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });

        btnCrearCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Coche coche = new Coche(editTxtMarcaCoche.getText().toString(),
                        editTxtModeloCoche.getText().toString(),
                        editTxtColorCoche.getText().toString());

                if (editTxtMarcaCoche.getText().toString().isEmpty() ||
                        editTxtModeloCoche.getText().toString().isEmpty() ||
                        editTxtColorCoche.getText().toString().isEmpty()){

                    Toast.makeText(CocheMain.this, "Rellena todos los campos", Toast.LENGTH_SHORT).show();

                }else {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("COCHE", coche);
                    intent.putExtras(bundle);
                    setResult(RESULT_OK, intent);
                    finish();
                }


            }
        });

    }



    private void inicializarVistas() {
        editTxtColorCoche = findViewById(R.id.editTxtColorCocheMain);
        editTxtMarcaCoche = findViewById(R.id.editTxtMarcaCocheMain);
        editTxtModeloCoche = findViewById(R.id.editTxtModeloCocheMain);

        btnCancelarCoche = findViewById(R.id.btnCancelarCocheMain);
        btnCrearCoche = findViewById(R.id.btnCrearCocheMain);


    }
}