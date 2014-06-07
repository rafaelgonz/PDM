package es.ugr.test.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< HEAD
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by josecolella on 16/03/2014.
 */
public class NextActivity extends Activity {


    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
=======
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleCursorAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import es.ugr.test.app.parser.CafeteriaParser;

import static android.view.ViewGroup.LayoutParams;


public class NextActivity extends Activity {

    private ListView lv;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
>>>>>>> bc3d9b75df34b9acc3895a3528df8655aaf2cd03
        setContentView(R.layout.activity_next);

        lv = (ListView) findViewById(R.id.listView);

        Document doc = null;
        Map map = new HashMap();
        ArrayList<String> your_array_list = new ArrayList<String>();

        your_array_list.add("Lunes 24 Marzo  \n Arroz a la Cubana \n Filete de Lomo a la Parrilla \n Pan, Bebida y Postre \n ");
        your_array_list.add("Martes 25 Marzo  \n Estofado de Lentejas \n Muslo de Pollo Marinado con Menestra de Verduras \n Pan, Bebida y Postre \n ");
        your_array_list.add("Miércoles 26 Marzo  \n Crema de Calabacino \n Paleta de Cerdo a la Jardinera con Revuelto de Pisto \n Pan, Bebida y Postre\n ");
        your_array_list.add("Jueves 27 Marzo  \n Lasaña \n Fritura de Pescado con Ensalada Mixta \n Pan, Bebida y Postre\n ");
        your_array_list.add("Viernes 28 Marzo  \n Macarrones con Atún \n Escalope de Ternera con Ensalada de Manzana y Piña \n Pan, Bebida y Postre\n ");
        your_array_list.add("Sábado 29 Marzo  \n Pipirrana Tropical \n Pollo Frito al Estilo Sureño con Patatas a lo Pobre \n Pan, Bebida y Postre\n ");
        your_array_list.add("Domingo 30 Marzo  \n Cerrado \n ");



        // Instanciating an array list (you don't need to do this,
        // you already have yours).


        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                 your_array_list);

        lv.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
<<<<<<< HEAD
    */

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        lv = (ListView) findViewById(R.id.listView);

        ArrayList<String> your_array_list1 = new ArrayList<String>();

        your_array_list1.add("Lunes 24 Marzo  \n Arroz a la Cubana \n Filete de Lomo a la Parrilla \n Pan, Bebida y Postre");
        your_array_list1.add("Martes 25 Marzo  \n Estofado de Lentejas \n Muslo de Pollo Marinado con Menestra de Verduras \n Pan, Bebida y Postre");
        your_array_list1.add("Miércoles 26 Marzo  \n Crema de Calabacino \n Paleta de Cerdo a la Jardinera con Revuelto de Pisto \n Pan, Bebida y Postre");
        your_array_list1.add("Jueves 27 Marzo  \n Lasaña \n Fritura de Pescado con Ensalada Mixta \n Pan, Bebida y Postre");
        your_array_list1.add("Viernes 28 Marzo  \n Macarrones con Atún \n Escalope de Ternera con Ensalada de Manzana y Piña \n Pan, Bebida y Postre");
        your_array_list1.add("Sábado 29 Marzo  \n Pipirrana Tropical \n Pollo Frito al Estilo Sureño con Patatas a lo Pobre \n Pan, Bebida y Postre");
        your_array_list1.add("Domingo 30 Marzo  \n Cerrado");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, your_array_list1);
        lv.setAdapter(arrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
=======
>>>>>>> bc3d9b75df34b9acc3895a3528df8655aaf2cd03
}