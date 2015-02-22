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


    //used to save a String value to the SharedPreferences
    public void saveString(Context context, String key, String value){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);
        editor = preferences.edit();

        editor.putString(key, value);

        editor.apply();

    }

    //used to load a String value from the SharedPreferences
    public String loadString(Context context, String key){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);


        String value;
        value = preferences.getString(key, "Not Found");

        return value;
    }














    //used to save an int value to the SharedPreferences
    public void saveInt(Context context, String key, int value){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);
        editor = preferences.edit();

        editor.putInt(key, value);

        editor.apply();

    }

    //used to load an int value from the SharedPreferences
    public int loadInt(Context context, String key){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);


        int value;
        value = preferences.getInt(key, 0);

        return value;
    }












    //used to save a boolean value to the SharedPreferences
    public void saveBoolean(Context context, String key, boolean value){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);
        editor = preferences.edit();

        editor.putBoolean(key, value);

        editor.apply();

    }

    //used to load a boolean value from the SharedPreferences
    public boolean loadBoolean(Context context, String key){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);


        boolean value;
        value = preferences.getBoolean(key, false);

        return value;
    }











    //used to save a float value to the SharedPreferences
    public void saveFloat(Context context, String key, float value){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);
        editor = preferences.edit();

        editor.putFloat(key, value);

        editor.apply();

    }

    //used to load a float value from the SharedPreferences
    public float loadFloat(Context context, String key){
        preferences = context.getSharedPreferences("Settings", MODE_PRIVATE);


        float value;
        value = preferences.getFloat(key, 0);

        return value;
    }

}
