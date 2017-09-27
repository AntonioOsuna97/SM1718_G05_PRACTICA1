package es.ujaen.git.sm1718_g05_practica1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        final EditText name= (EditText) fragment.findViewById(R.id.editText);   //Se declara como final por rendimiento ¿?

        //Vincular un evento a un boton
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = name.getText().toString();
                Toast.makeText(getContext(), nombre, Toast.LENGTH_LONG).show();
            }
    });


        return fragment;
    }

}

