package devandroid.maddo.applistacurso.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.maddo.applistacurso.R;

public class SplashActivity extends AppCompatActivity {


    public static final int TIME_OUT_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        cumutarTelaSplach();

    }

    private void cumutarTelaSplach() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent telaPrincipal = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(telaPrincipal);
                finish();

            }
        }, TIME_OUT_SPLASH);

    }
}