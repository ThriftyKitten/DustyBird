package dustybirdapps.cat_a_day;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // get the day of year using calendar
        //Calendar calendar = Calendar.getInstance();
        //int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);
        // turn day of year into string
        //String day_of_year_string = Integer.toString(day_of_year);
        // append cat and day of year string to get cat#
        //String cat_string = "cat";
        //String cat_image = cat_string + day_of_year_string;

    }

    /** This is called when the Cat button is pushed on the main screen */
    public void enterCat (View view) {
        Intent intent = new Intent(this, CatLoadingScreen.class);
        startActivity(intent);
    }
    // called when Dog button is pressed on main
    public void enterDog (View view) {
        Intent intent = new Intent(this, DogLoadingScreen.class);
        startActivity(intent);
    }



}
