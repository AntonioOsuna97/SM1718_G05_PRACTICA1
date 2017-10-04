package es.ujaen.git.sm1718_g05_practica1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.R;

//Codigo fragmento vacio

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param_ip";
    private static final String ARG_PARAM2 = "param_port";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;


    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters

    public static LoginFragment newInstance(String ip, int port) {
            //Se crea un objeto
        LoginFragment fragment = new LoginFragment();
        //Se crea un bundle
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, ip);
        args.putInt(ARG_PARAM2, port);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {  //Este metodo se le pasa un paquete con parametros
        super.onCreate(savedInstanceState);
        //Se comprueba si es disntito de null
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    //Método para crear la vista
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Con el inflate dibuja el layoout
        //Ya tengo una vista con todos los botones
        View fragment = inflater.inflate(R.layout.fragment_login, container, false);

        //Quiero tener acceso a un objeto boton
        //Hacemos un casting
        Button connect = (Button) fragment.findViewById(R.id.button_login);
        //Buscar si edidText es el de usuario
        final EditText name= (EditText) fragment.findViewById(R.id.editText);   //Se declara como final por rendimiento
        final EditText pass= (EditText) fragment.findViewById(R.id.editTextPort);   //Mirad aqui
        final EditText ip= (EditText) fragment.findViewById(R.id.editTextip);   //Corregir
        final EditText port= (EditText) fragment.findViewById(R.id.editTextport);   //Corregir

        //Vincular un evento a un boton
        connect.setOnClickListener(new View.OnClickListener() {

                //Permite extraer ñlos cuatro valores
                public void onClick(View v){
                    String s_user = user.getText().toString();
                    String s_pass = pass.getText().toString();
                    String s_ip= ip.getText().toString();
                    String s_port = port.getText().toString();
                    short port2=0;
                    //Capturar excepcion para que no nos de error cuando puelsamos el boton de conectar
                    try{
                        //Short necesitamos parsear para convertirlo a
                        port2= Short.parseShort(s_port);
                    }catch (java.lang.NumberFormatException ex){
                        port2 = 6000;
                    }



                ConnectionUserData data= new ConnectionUserData(s_user,s_pass,s_ip,port2);

                //Cada vez que le das a conectar te saldran estos datos
                Toast.makeText(getContext(),"Hola"+s_user+" "+s_pass+" "+s_ip+":"+s_port, Toast.LENGTH_LONG).show();

                //Forma de llamar a una actividad (PUNTO 5)
                    Intent nueva= new Intent(getActivity(),ServiceActivity.class);
                    //Introducimos los datos
                    //Constante en user, creada en servicEActivity
                    nueva.putExtra(ServiceActivity.PARAM_USER, data.getUser());
                    nueva.putExtra("param_pass", data.getPass());
                    nueva.putExtra("param_IP", data.getConnectionIP());
                    nueva.putExtra("param_PORT", data.getConnectionPort());

                    //Empieza la actividad y puede leer los parámetros
                    startActivity(nueva);
            }
    });


        return fragment;
    }

}

