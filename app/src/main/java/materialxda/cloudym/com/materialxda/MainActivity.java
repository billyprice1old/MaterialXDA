package materialxda.cloudym.com.materialxda;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Toolbar toolbar;
    EditText editText;
    TextView textView;
    Button saveButton, loadButton;
    SavingAndLoading savingAndLoading = new SavingAndLoading();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        variables();
    }

    //All of the variables are set up from here with different methods to keep everything clear and easy to understand.
    public void variables(){
        toolbars();
        editTexts();
        textViews();
        buttons();
    }

    public void toolbars(){
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    public void editTexts(){
        editText = (EditText) findViewById(R.id.editText);
    }

    public void textViews(){
        textView = (TextView) findViewById(R.id.textView);
    }

    public void buttons(){
        saveButton = (Button) findViewById(R.id.saveButton);
        loadButton = (Button) findViewById(R.id.loadButton);

        saveButton.setOnClickListener(this);
        loadButton.setOnClickListener(this);
    }











    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        String writtenText = editText.getText().toString();
        String loadedText;

        switch (v.getId()){
            case R.id.saveButton:
                savingAndLoading.save(this, "testi", writtenText);
                break;

            case R.id.loadButton:
                loadedText = savingAndLoading.load(this, "testi");
                textView.setText(loadedText);
                break;
        }
    }
}
