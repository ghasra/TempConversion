package bh.ahlia.edu.tempconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {


    private EditText txt;
    private RadioButton rbc, rbf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText) findViewById(R.id.txtTemp);
        rbc = (RadioButton) findViewById(R.id.rbCel);
        rbf = (RadioButton) findViewById(R.id.rbFar);


    }

    public void convert(View v) {
        if (txt.getText().length() == 0) {
            Toast.makeText(this, "Please Enter a valid mnumber", Toast.LENGTH_LONG).show();
            return;
        }


        float inpVal = Float.parseFloat(txt.getText().toString());

        if (rbc.isChecked()) {
            txt.setText(String.valueOf(c2f(inpVal)));
            rbc.setChecked(false);
            rbf.setChecked(true);

        }else{
            txt.setText(String.valueOf(f2c(inpVal)));
            rbc.setChecked(true);
            rbf.setChecked(false);
        }
    }



    public float c2f(float c){
        return ((c*9/5)+32);
    }

    public float f2c(float f){

        return ((f-32) *5/9);

    }

}
