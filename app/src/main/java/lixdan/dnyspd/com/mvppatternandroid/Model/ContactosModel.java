package lixdan.dnyspd.com.mvppatternandroid.Model;

/**
 * @author daniel on 28/10/2016.
 */
public class ContactosModel implements IContactosModel {
    String[] arrNombres = new String[]{"Ingrid","ALe","Diana","Lupita",""};
    @Override
    public String[] getNombres() {

        return arrNombres;
    }

    @Override
    public String gerContacto(int id) {
        for (String nombe: arrNombres) {
            ///
        }
        return null;
    }


}
