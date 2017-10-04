package es.ujaen.git.sm1718_g05_practica1;

/**
 * Created by usuario on 04/10/2017.
 */

//Clase de datos personales
public class PersonalData {
    protected String name="";
    protected String surname="";

    protected String user= "";
    protected String pass="";

    //Constructor para inicializar el usuario y la clave
    public PersonalData(String user, String pass ){
        //Coge este objeto y asígnale el valor pasado a la entrada del constructor
        this.user=user;
        this.pass=pass;
    }

    //Constructor
    public PersonalData() {
    }

    //DEbido a las clase protegidas
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

