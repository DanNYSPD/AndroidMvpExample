package lixdan.dnyspd.com.network;

/**
 * Clase que contiene las interfaces relacionadas a realizar peticiones
 */
public class Request{

    /**
     *    Interfaz para indicar que invoca una peticion
     *    Implenetar esta interfaz si se hace una invoca una peticion (no inicia,
     *    para iniciar usar IStartRequest)
     */


    /**
     * implementar esta interfaz si se inicia una solictud
     */
    public interface IStartRequest{
        /**
         * inicia la solictud
         */
        void startRequest();
    }

    /**
     *  Interfaz que indica que puede cancelar una peticion
     *  implemnetar esta interfaz para cancelar una peticion
     */
    public  interface  ICancelRequest{
        /**
         * cancela las peticiones
         */
        void cancelRequest();


    }
    public interface ICancelTaggedRequest{
        /**
         * cancela las peticiones que tienen un tag
         */
        void cancelRequest(String tag);
    }
    public interface  IRequest extends IStartRequest,ICancelRequest{

    }
}

