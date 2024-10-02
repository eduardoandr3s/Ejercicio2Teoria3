package educodedev.ejercicio2teoria3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CocheMain extends AppCompatActivity {

    private Button btnCancelarCoche, btnCrearCoche;
    private EditText editTxtMarcaCoche, editTxtModeloCoche, editTxtColorCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coche_main);

        inicializarVistas();

    }

    private void inicializarVistas() {
        editTxtColorCoche = findViewById(R.id.editTxtColorCocheMain);
        editTxtMarcaCoche = findViewById(R.id.editTxtMarcaCocheMain);
        editTxtModeloCoche = findViewById(R.id.editTxtModeloCocheMain);

        btnCancelarCoche = findViewById(R.id.btnCancelarCocheMain);
        btnCrearCoche = findViewById(R.id.btnCrearCocheMain);


    }
}