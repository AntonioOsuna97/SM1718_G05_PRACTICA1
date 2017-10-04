package es.ujaen.git.sm1718_g05_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {

    public static final String PARAM_USER = "param_user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //
        String user=getIntent().getStringExtra(PARAM_USER);
        String user=getIntent().getStringExtra(PARAM_USER);
        String user=getIntent().getStringExtra(PARAM_USER);
        //Crear constante
        Short port=getIntent().getStringExtra(PARAM SHORT,(short)6000);


        TextView title= (TextView) findViewById(R.id.textView);
        title.setText("hola "+ user);

        //Comprobamos si hemos pasado parametros
        //Anterior, ya no necesario debido a TextView
        Toast.makeText(this,"hola"+user, Toast.LENGTH_SHORT).show();

    }
}
