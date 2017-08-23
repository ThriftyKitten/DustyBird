package dustybirdapps.cat_a_day;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** This is called when the Enter button is pushed on the main screen */
    public void enterCat (View view) {
        Intent intent = new Intent(this, DisplayCat.class);
        startActivity(intent);

    }

    public void enterDog (View view) {
        Intent intent = new Intent(this, DisplayDog.class);
        startActivity(intent);
    }



}
