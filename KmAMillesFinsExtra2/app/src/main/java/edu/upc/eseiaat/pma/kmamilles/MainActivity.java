package edu.upc.eseiaat.pma.kmamilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_a_milles = (Button) findViewById(R.id.KmAMilles);
        Button btn_a_km = (Button) findViewById(R.id.MillesAKm);
        final EditText editKm = (EditText) findViewById(R.id.editKm);
        final EditText EditMilles = (EditText) findViewById(R.id.EditMilles);

                btn_a_milles.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String skm = editKm.getText().toString();
                        float km = Float.parseFloat(skm);
                        float millas = km / 1.609f;
                        String smillas = String.format("%f", millas);
                        EditMilles.setText(smillas);

                    }
                });

               btn_a_km.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       String smillas = EditMilles.getText().toString();
                       float millas = Float.parseFloat(smillas);
                       float km = millas * 1.609f;
                       String skm = String.format("%f", km);
                       editKm.setText(skm);
                   }
               });

    }
}
