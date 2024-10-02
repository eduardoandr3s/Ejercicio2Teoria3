package educodedev.ejercicio2teoria3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import educodedev.ejercicio2teoria3.R;
import educodedev.ejercicio2teoria3.models.Bici;
import educodedev.ejercicio2teoria3.models.Coche;
import educodedev.ejercicio2teoria3.models.Moto;

public class MainActivity extends AppCompatActivity {

    private Button btnCocheMainCoche, btnBiciMainBici, btnMotoMainMoto;
    private TextView txtCocheMainCoche, txtBiciMainBici, txtMotoMainMoto;
    private ActivityResultLauncher<Intent> launcherCoche;
    private ActivityResultLauncher<Intent> launcherMoto;
    private ActivityResultLauncher<Intent> launcherBici;
    ArrayList<Coche> coches = new ArrayList<>();
    ArrayList<Moto> motos = new ArrayList<>();
    ArrayList<Bici> bicis = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();
        inicializarLaunchers();

        btnCocheMainCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCocheMain = new Intent(MainActivity.this, CocheMain.class);
                launcherCoche.launch(intentCocheMain);          }
        });


        btnMotoMainMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMotoMain = new Intent(MainActivity.this, MotoMain.class);
                launcherMoto.launch(intentMotoMain);
            }
        });


        btnBiciMainBici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBiciMain = new Intent(MainActivity.this, BiciMain.class);
                 launcherBici.launch(intentBiciMain);
            }
        });


    }

    private void inicializarLaunchers() {
        launcherCoche = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
        public void onActivityResult(ActivityResult o) {
            if (o.getResultCode() == RESULT_OK){
                if (o.getData()!=null){
                    Bundle bundle = o.getData().getExtras();
                    Coche coche = (Coche) bundle.getSerializable("COCHE");
                    coches.add(coche);
                    txtCocheMainCoche.setText("Coches: "+coches.size());
                    Toast.makeText(MainActivity.this, coche.toString(), Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "NO HAY DATOS", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(MainActivity.this, "VENTANA CANCELADA", Toast.LENGTH_SHORT).show();
            }
        }
    });

        launcherMoto = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult o) {
                if (o.getResultCode() == RESULT_OK){
                    if (o.getData()!=null){
                        Bundle bundle = o.getData().getExtras();
                        Moto moto = (Moto) bundle.getSerializable("MOTO");
                        motos.add(moto);
                        txtMotoMainMoto.setText("Motos: "+motos.size());
                        Toast.makeText(MainActivity.this, moto.toString(), Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this, "NO HAY DATOS", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "VENTANA CANCELADA", Toast.LENGTH_SHORT).show();
                }
            }
        });

        launcherBici = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult o) {
                if (o.getResultCode() == RESULT_OK){
                    if (o.getData()!=null){
                        Bundle bundle = o.getData().getExtras();
                        Bici bici = (Bici) bundle.getSerializable("BICI");
                        bicis.add(bici);
                        txtBiciMainBici.setText("Bicis: "+bicis.size());
                        Toast.makeText(MainActivity.this, bici.toString(), Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this, "NO HAY DATOS", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "VENTANA CANCELADA", Toast.LENGTH_SHORT).show();
                }
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