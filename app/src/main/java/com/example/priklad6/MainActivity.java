package com.example.priklad6;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Vytvořte aplikaci, která načte reálné číslo X a celé číslo Y.
        Spočítejte mocninu XY. Napište svoji metodu na spočítání mocniny.
        Program ošetřete. Tlačítko obslužte pomocí třídy
         */
        Button button = findViewById(R.id.button);
        button.setOnClickListener(listener);


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                EditText editText1 = findViewById(R.id.editTextNumber);
                String n1s = editText1.getText().toString();
                Integer n1 = Integer.parseInt(n1s);
                EditText editText2 = findViewById(R.id.editTextNumberDecimal);
                String n2s = editText2.getText().toString();
                Double n2 = Double.parseDouble(n2s);
                Double n3 = 1.0;

                if(n1>0) {
                    for (int i = 0; i < n1; i++) {
                        n3 *= n2;
                    }
                }
                else {
                    for (int i = 0; i < -n1; i++) {
                        n3 /= n2;
                    }
                }
                Snackbar.make(v, String.valueOf(n3), Snackbar.LENGTH_LONG).show();
            }
            catch (Exception exception) {
                Snackbar.make(v, "nastala chyba", Snackbar.LENGTH_LONG).show();
            }
        }
    };
}