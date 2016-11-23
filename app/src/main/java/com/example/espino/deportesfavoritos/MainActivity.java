package com.example.espino.deportesfavoritos;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.espino.deportesfavoritos.adapters.DeportesAdapter;

public class MainActivity extends AppCompatActivity {

    public static final String ESTADO = "estado";

    private RecyclerView rcvDeportes;
    private DeportesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvDeportes = (RecyclerView) findViewById(R.id.deportes_rcv);
        adapter = new DeportesAdapter(getApplicationContext());
        rcvDeportes.setAdapter(adapter);
        rcvDeportes.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(ESTADO,adapter.saveInstance());;
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        adapter.getInstance(savedInstanceState.getSerializable(ESTADO));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_filtrar:
              break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onAcceptClick(View v){
        adapter.savePreferences();
    }
}
