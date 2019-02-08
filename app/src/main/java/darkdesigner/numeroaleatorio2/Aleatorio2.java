package darkdesigner.numeroaleatorio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Aleatorio2 extends AppCompatActivity {

    private TextView n_intentos;
    private TextView mensaje;
    private TextView numero;

    int intento = 0;
    int rndvar;


    final Random myRandom = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio2);

        n_intentos = (TextView) findViewById(R.id.intentos);
        numero = (EditText) findViewById(R.id.numadv);
        mensaje = (TextView) findViewById(R.id.mensaje);

        rndvar = myRandom.nextInt(100);
    }

    public void adivinar(View view) {

        String num = numero.getText().toString();
        int valor1 = Integer.parseInt(num);


        if (valor1 == rndvar) {
            mensaje.setText("correcto");

        } else

        {

            if (valor1 > rndvar) {
                mensaje.setText("numero menor" + valor1 + "intento fallido");
                numero.setText("");
            } else {

                mensaje.setText("numero mayor" + valor1 + "intento fallido");
                numero.setText("");
            }



            intento++;
            n_intentos.setText("intento nmero" + intento);
        }


    }
}
