package educodedev.ejercicio2teoria3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnCocheMainCoche, btnBiciMainBici, btnMotoMainMoto;
    private TextView txtCocheMainCoche, txtBiciMainBici, txtMotoMainMoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

        btnCocheMainCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCocheMain = new Intent(MainActivity.this, CocheMain.class);
                startActivity(intentCocheMain);
            }
        });


        btnMotoMainMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMotoMain = new Intent(MainActivity.this, MotoMain.class);
                startActivity(intentMotoMain);
            }
        });


        btnBiciMainBici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBiciMain = new Intent(MainActivity.this, BiciMain.class);
                startActivity(intentBiciMain);
            }
        });


    }

    private void inicializarVistas() {

        txtCocheMainCoche = findViewById(R.id.txtCocheMainCoche);
        btnCocheMainCoche = findViewById(R.id.btnCocheMainCoche);

        txtMotoMainMoto = findViewById(R.id.txtMotoMainMoto);
        btnMotoMainMoto = findViewById(R.id.btnMotoMainMoto);

        txtBiciMainBici = findViewById(R.id.txtBiciMainBici);
        btnBiciMainBici = findViewById(R.id.btnBiciMainBici);

    }
}