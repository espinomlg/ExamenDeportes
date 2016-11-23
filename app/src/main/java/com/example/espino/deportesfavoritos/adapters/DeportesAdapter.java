package com.example.espino.deportesfavoritos.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.espino.deportesfavoritos.DeportesFavoritosApplication;
import com.example.espino.deportesfavoritos.R;
import com.example.espino.deportesfavoritos.modelos.Deporte;
import com.example.espino.deportesfavoritos.modelos.PreferenciasAplicacion;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by espino on 23/11/16.
 */

public class DeportesAdapter extends RecyclerView.Adapter<DeportesAdapter.DeportesViewHolder> {

    private Context context;
    private ArrayList<Deporte> lista;

    public DeportesAdapter(Context context) {
        super();
        this.context = context;
        lista = new ArrayList<>(((DeportesFavoritosApplication)context.getApplicationContext()).getList());

    }

    @Override
    public DeportesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(context).inflate(R.layout.listitem_deporte, parent, false);
        return new DeportesViewHolder(item);
    }

    @Override
    public void onBindViewHolder(DeportesViewHolder holder, final int position) {
        holder.img.setImageResource(lista.get(position).getImage());
        holder.nombre.setText(lista.get(position).getNombre());
        holder.check.setChecked(lista.get(position).isChecked());
        holder.check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                lista.get(position).setChecked(isChecked);
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public ArrayList<Deporte> saveInstance(){
        return lista;
    }

    public void getInstance(Serializable o){
        lista = (ArrayList<Deporte>) o;
    }

    public void savePreferences(){
        for(int index = 0; index < lista.size(); index++){
            PreferenciasAplicacion.getInstance(context).putBoolean(lista.get(index).getNombre(), lista.get(index).isChecked());
        }
        Log.e("?","se supone guardadas");
    }


    public static  class DeportesViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView nombre;
        private CheckBox check;


        public DeportesViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.itemdeporte_imv_icono);
            nombre = (TextView) itemView.findViewById(R.id.itemdeporte_txv_name);
            check = (CheckBox) itemView.findViewById(R.id.itemdeporte_cb_checked);
        }
    }
}
