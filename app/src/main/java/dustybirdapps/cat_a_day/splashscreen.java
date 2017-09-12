package dustybirdapps.cat_a_day;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.Menu;

public class splashscreen extends AppCompatActivity {

    //duration of waiting...
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(() -> {
            /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(splashscreen.this,Menu.class);
            splashscreen.this.startActivity(mainIntent);
            splashscreen.this.finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}
