package om.gov.ita.hctproject.initialsetup;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import om.gov.ita.hctproject.R;

public class SplashScreen extends AppCompatActivity {
    private  int DURATION_SPLASH_SCREEN=3000;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, TermconditionScreen.class);
             startActivity(intent);

             finish();

            }

        },DURATION_SPLASH_SCREEN);

    }
}
