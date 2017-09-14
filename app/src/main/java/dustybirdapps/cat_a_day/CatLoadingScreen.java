package dustybirdapps.cat_a_day;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;

public class CatLoadingScreen extends AppCompatActivity {

    public final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_loading_screen);
    }

    @Override
    public void onStart() {
        super.onStart();
        Intent intent = new Intent(this, DisplayCat.class);
        handler.postDelayed(() -> {
            startActivity(intent);
            finish();
        }, 2000);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            handler.removeCallbacksAndMessages(null);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void onStop() {
        finish();
        super.onStop();
    }

    protected void onPause() {
        finish();
        super.onPause();
    }

}