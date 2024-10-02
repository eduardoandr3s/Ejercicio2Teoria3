package educodedev.ejercicio2teoria3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BiciMain extends AppCompatActivity {


    private Button btnCancelarBici, btnCrearBici;
    private EditText editTxtMarcaBici, editTxtPulgadasBici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bici_main);
        inicializarVistas();
    }

    private void inicializarVistas() {
        editTxtMarcaBici = findViewById(R.id.editTxtMarcaBiciMain);
        editTxtPulgadasBici = findViewById(R.id.editTxtPulgadasBiciMain);

        btnCancelarBici = findViewById(R.id.btnCancelarBiciMain);
        btnCrearBici = findViewById(R.id.btnCrearBiciMain);


    }
}