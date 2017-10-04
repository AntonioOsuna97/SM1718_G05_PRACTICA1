package es.ujaen.git.sm1718_g05_practica1;

import es.ujaen.git.sm1718_g05_practica1.PersonalData;

/**
 * Created by usuario on 04/10/2017.
 */

public class ConnectionUserData extends PersonalData {
    protected String connectionIP="127.0.0.1";
    protected short connectionPort=6000;

    //Necesitamos un contructor para utilizar los parametros que necesitemos
    //Constructor
    public ConnectionUserData(String user, String pass, String ip, short port){
        //Llamada al constructor de la clase padre para utilizar los parámetros anteriores
        super(user,pass);
        this.connectionIP=ip;
        this.connectionPort=port;
    }

    public String getConnectionIP() {
        return connectionIP;
    }

    public void setConnectionIP(String connectionIP) {
        this.connectionIP = connectionIP;
    }

    public short getConnectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(short connectionPort) {
        this.connectionPort = connectionPort;
    }
}
