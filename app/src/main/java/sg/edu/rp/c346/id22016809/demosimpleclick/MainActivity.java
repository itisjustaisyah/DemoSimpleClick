package sg.edu.rp.c346.id22016809.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //using activity_main.xml
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById((R.id.radioGroup));
        //method to find using id
        //                        indicates id name


        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisplay.setEnabled(tbtn.isChecked());

            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.heButton){
                    tvDisplay.setText(String.format("He says %s", stringResponse));
                }
                else if(checkedRadioId == R.id.sheButton){
                    tvDisplay.setText(String.format("She says %s", stringResponse));
                }else{
                    tvDisplay.setText(String.format("They says %s", stringResponse));
                }
                tvDisplay.setText(stringResponse);
            }
        });



    }

}