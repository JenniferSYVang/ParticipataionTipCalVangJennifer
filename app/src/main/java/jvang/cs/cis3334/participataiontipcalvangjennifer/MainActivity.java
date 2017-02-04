package jvang.cs.cis3334.participataiontipcalvangjennifer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variables here
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initalize variables here
        etBill = (EditText) findViewById((R.id.editTextBill));
        etNumParty = (EditText) findViewById((R.id.editTextNumParty));
        tvTotalTip = (TextView) findViewById((R.id.textViewTotalTip));
        tvTipPerPerson = (TextView) findViewById(R.id.textViewPerPerson);
    }

    public void onClickBtnCalc(View view) {
        // declare variables
        Double totalTip = 0.0;
        Double tipPercent = .2;
        Double tipPerPerson = 0.0;

        //getting total tip and displaying it to user
        totalTip = Double.parseDouble(etBill.getText().toString()) * tipPercent;
        tvTotalTip.setText("20% tip =  $" + totalTip);

        // getting tip per person and display this amount
        tipPerPerson = totalTip / Double.parseDouble(etNumParty.getText().toString());
        tvTipPerPerson.setText("Tip per person = $" + tipPerPerson);
    }
}
