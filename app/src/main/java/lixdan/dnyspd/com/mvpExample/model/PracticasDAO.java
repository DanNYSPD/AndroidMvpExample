package lixdan.dnyspd.com.mvpExample.model;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import lixdan.dnyspd.com.mvpExample.context.PracticasContext;
import lixdan.dnyspd.com.mvpExample.model.entities.Practica;
import lixdan.dnyspd.com.network.VolleySingleton;

/**
 * @author daniel on 29/10/2016.
 */

public class PracticasDAO implements PracticasContext.IModelPracticas {
    private Context context;
    private RequestQueue requestQueue;
    private JsonObjectRequest jsArrayRequest;
    public ArrayList<Practica> items;
    public PracticasDAO(Context context){
        this.context=context;
    }
    @Override
    public void getPracticas(final IModelListener listener) {
        requestQueue= VolleySingleton.getInstance(context).getRequestQueue();
        jsArrayRequest = new JsonObjectRequest(
                Request.Method.GET,
               "",
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        items = parseJson(response);
                        listener.onComplete(items);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError("err");
                    }
                }
        );

    }
    public ArrayList<Practica> parseJson(JSONObject jsonObject){
        // Variables locales
        ArrayList<Practica> arrPractica = new ArrayList<Practica>();
        JSONArray jsonArray= null;
        try {
            // Obtener el array del objeto
            jsonArray = jsonObject.getJSONArray("practicas");
            for(int i=0; i<jsonArray.length(); i++){
                try {
                    JSONObject objeto= jsonArray.getJSONObject(i);
                    Practica practica = new Practica(

                    );

                    arrPractica.add(practica);
                } catch (JSONException e) {

                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrPractica;
    }


    @Override
    public void getPractica(int id, IModelListener listener) {

    }
}
