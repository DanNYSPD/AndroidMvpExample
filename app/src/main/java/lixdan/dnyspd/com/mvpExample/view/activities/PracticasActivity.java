package lixdan.dnyspd.com.mvpExample.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lixdan.dnyspd.com.mvpExample.context.PracticasContext;
import lixdan.dnyspd.com.mvpExample.model.entities.Practica;
import lixdan.dnyspd.com.mvpExample.presenter.PracticasPresenter;
import lixdan.dnyspd.com.mvppatternandroid.R;

public class PracticasActivity extends AppCompatActivity implements PracticasContext.IViewPracticas{
    ArrayList<PracticasContext.PracticaPOJO> arrPracticas;


    PracticasContext.IPresenterPracticas presenterPracticas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicas);

        presenterPracticas = new PracticasPresenter(this,);
    }


    @Override
    public void setPracticas(List<Practica> arrPracticas) {

    }

    @Override
    public void mostrarPracticas() {

    }

    @Override
    public void showPracticasError(String msj) {

    }

    @Override
    public void setPractica(Practica practica) {

    }

    @Override
    public void showPractica() {

    }
}
