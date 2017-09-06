package lixdan.dnyspd.com.network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * @author daniel on 29/10/2016.
 */

public final class VolleySingleton {
    private static VolleySingleton singleton;
    private RequestQueue requestQueue;
    public  static Context context;
    //esta es apra añdair el loader al metodo singleton
    private ImageLoader imageLoader;
    private VolleySingleton (Context context){
        VolleySingleton.context=context;
        requestQueue=getRequestQueue();
    }
    public static synchronized VolleySingleton getInstance(Context context){
        if(singleton==null){
            singleton= new VolleySingleton(context);
        }
        return singleton;
    }
    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }
    public  void addToRequestQueue(Request req) {
        getRequestQueue().add(req);
    }
    public ImageLoader getImageLoader() {
        return imageLoader;
    }
}
