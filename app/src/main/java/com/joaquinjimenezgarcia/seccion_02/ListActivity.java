package com.joaquinjimenezgarcia.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        // Datos a mostrar
        names = new ArrayList<String>();
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");
        names.add("Joaquin");
        names.add("Julian");
        names.add("Marta");
        names.add("Antonio");
        names.add("Jhon Lee");

        // Adaptador para los datos (darle forma visual) por defecto
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        // Enlazamos el adaptador por defecto al ListView
        // listView.setAdapter(adapter);

        // Enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.item_list, names);
        listView.setAdapter(myAdapter);

        // Añadimos un listener a los elementos del listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "Soy " + names.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}
