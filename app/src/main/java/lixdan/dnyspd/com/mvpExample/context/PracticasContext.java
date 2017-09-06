package lixdan.dnyspd.com.mvpExample.context;

import java.util.ArrayList;
import java.util.List;

import lixdan.dnyspd.com.mvpExample.model.entities.Practica;

/**
 * @author daniel on 29/10/2016.
 */

public class PracticasContext {
    public interface IPresenterPracticas{

        void getPracticas();
        void getPractica(int id);


    }
    public interface IModelPracticas{
        void getPracticas(IModelListener listener);
        void getPractica(int id,IModelListener listener);

        interface IModelListener<E>{
            void onComplete(E e);
            void onError(String msj);
        }

    }
    public interface IViewPracticas{
        void setPracticas(List<Practica> arrPracticas);
        void mostrarPracticas();
        void showPracticasError(String msj);
        void setPractica(Practica practica);
        void showPractica();



    }

    public class PracticaPOJO{
        int id;
        String titulo;
    }


}
