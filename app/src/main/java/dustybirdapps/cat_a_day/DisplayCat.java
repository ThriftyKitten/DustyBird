package dustybirdapps.cat_a_day;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayCat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cat);

        // Get the Intent that started DisplayCat
        Intent intent = getIntent();

        // Capture the layout's "Picture frame" and put catimage in it
        image = (ImageView)

    }
}
