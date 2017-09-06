package lixdan.dnyspd.com.mvppatternandroid.Presenter;

import lixdan.dnyspd.com.mvppatternandroid.Model.IContactosModel;
import lixdan.dnyspd.com.mvppatternandroid.View.IContactosView;

/**
 * @author daniel on 28/10/2016.
 * tendra instancias de model y view(prefereiblemente usar interfaces)
 */
public class ContactosPresenter  implements  IConctactosPresenter{

    IContactosModel contactosModel;
    IContactosView contactosView; //es sincrono

    public ContactosPresenter(IContactosView contactosView,IContactosModel contactosModel){
        this.contactosModel=contactosModel;
        this.contactosModel = contactosModel;
    }

    /****************METODOS QUE RESPONDEN A LOS EVENTOS DEL VIEW ****************************/
    @Override
    public void consultarContactos() {
       String[] arrNombres= contactosModel.getNombres();
       if(arrNombres!=null){
           contactosView.mosttrarConstactos(arrNombres);
       }
    }

    @Override
    public void consultarContacto(String name) {
        String otherDate=contactosModel.gerContacto(1);
        contactosView.limpiarContactos();

    }

    /*****METODOS QUE RESPONDEN A LOS EVENTOS DEL MODEL (POR EJEMPLO CUNADO ESTAN LISTOS LOS DATOS)****/

    public void onComplete(){

    }
    public void onFail(){

    }

}
