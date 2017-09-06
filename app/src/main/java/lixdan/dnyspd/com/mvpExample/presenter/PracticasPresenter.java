package lixdan.dnyspd.com.mvpExample.presenter;

import java.util.ArrayList;

import lixdan.dnyspd.com.mvpExample.context.PracticasContext;
import lixdan.dnyspd.com.mvpExample.model.entities.Practica;

/**
 * @author daniel on 29/10/2016.
 */

public class PracticasPresenter implements PracticasContext.IPresenterPracticas {
    PracticasContext.IViewPracticas viewPracticas;
    /***
     * modelPracticas tiene acceso a los datos, sin importar si es remoto o local,
     * para eso usamos la inyeccion de dependemcia por constructor
     */
    PracticasContext.IModelPracticas modelPracticas;
    public PracticasPresenter(PracticasContext.IViewPracticas viewPracticas, PracticasContext.IModelPracticas modelPracticas){
        this.viewPracticas=viewPracticas;
        this.modelPracticas=modelPracticas;
    }

    @Override
    public void getPracticas() {
        modelPracticas.getPracticas(new PracticasContext.IModelPracticas.IModelListener<ArrayList<Practica>>() {
            @Override
            public void onComplete(ArrayList<Practica> arrPracticas) {
                viewPracticas.setPracticas(arrPracticas);
                viewPracticas.mostrarPracticas();
            }

            @Override
            public void onError(String msj) {
                viewPracticas.showPracticasError(msj);
            }
        });

    }

    @Override
    public void getPractica(int id) {
        modelPracticas.getPractica(id, new PracticasContext.IModelPracticas.IModelListener<Practica>() {

            @Override
            public void onComplete(Practica practica) {
                viewPracticas.setPractica(practica);
                viewPracticas.showPractica();
            }

            @Override
            public void onError(String msj) {
                viewPracticas.showPracticasError(msj);
            }
        });
    }
}
