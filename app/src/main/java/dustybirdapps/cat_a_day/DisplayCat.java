package dustybirdapps.cat_a_day;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Calendar;
import android.widget.ImageView;


public class DisplayCat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cat);

        // get the day of year using calendar
        Calendar calendar = Calendar.getInstance();
        int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);
        // turn day of year into string

        String day_of_year_string = Integer.toString(day_of_year);
        // append cat and day of year string to get cat#
        String cat_string = "cat";
        String cat_image_string = cat_string + day_of_year_string;

        // need drawable resource number, finding the cat drawable resource id
        // int ResId = R.getIdentifier(cat_image_string, "drawable", getPackageName());
        // Drawable cat_image = R.getDrawable(ResId);
        // Capture the layout's "Picture frame" and put catimage in it
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(getImageId(this, cat_image_string));

    }

    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}
