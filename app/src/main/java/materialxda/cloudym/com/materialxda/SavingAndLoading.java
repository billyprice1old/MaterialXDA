package materialxda.cloudym.com.materialxda;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by chris on 22.2.2015.
 */

//This class helps with saving, and reading from SharedPreferences.
public class SavingAndLoading extends Activity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    //used to save a value to the SharedPreferences
    public void save(Context context, String key, String value){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);
        editor = preferences.edit();

        editor.putString(key, value);

        editor.apply();

    }

    //used to load a value from the SharedPreferences
    public String load(Context context, String key){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);


        String value;
        value = preferences.getString(key, "Not Found");

        return value;
    }

}
