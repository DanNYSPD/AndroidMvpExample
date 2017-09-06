package lixdan.dnyspd.com.mvppatternandroid.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import lixdan.dnyspd.com.mvppatternandroid.Presenter.IConctactosPresenter;
import lixdan.dnyspd.com.mvppatternandroid.R;

public class AcvityContactos extends AppCompatActivity  implements IContactosView {

    IConctactosPresenter conctactosPresenter;
    Button btnRecargar;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acvity_contactos);

        btnRecargar= (Button) findViewById(R.id.btnRecargar);


        listView = (ListView) findViewById(R.id.lstViewContactos);

        btnRecargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conctactosPresenter.consultarContactos();
            }
        });
    }

    @Override
    public void mosttrarConstactos(String[] arr) {

    }

    @Override
    public void limpiarContactos() {

    }
}
