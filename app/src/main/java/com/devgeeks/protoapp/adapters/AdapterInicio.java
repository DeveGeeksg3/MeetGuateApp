package com.devgeeks.protoapp.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.devgeeks.protoapp.R;
import com.devgeeks.protoapp.entidad.InicioLugares;

import java.util.ArrayList;

/**
 * Created by Android on 2/28/2018.
 */

public class AdapterInicio extends RecyclerView.Adapter<AdapterInicio.ViewHolder>{
    private ArrayList<InicioLugares> inicioLugares = new ArrayList<>();
    private Context mContext;

    public AdapterInicio( Context mContext, ArrayList<InicioLugares> inicioLugares) {
        this.inicioLugares = inicioLugares;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_inicio,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.imagen.setImageResource(inicioLugares.get(position).getImagen());
        holder.nombre.setText(inicioLugares.get(position).getNombre().toString());
        holder.descripcion.setText(inicioLugares.get(position).getDescripcion().toString());
        holder.lugar.setText(inicioLugares.get(position).getLugar().toString());

        holder.touchCartita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, inicioLugares.get(position).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return inicioLugares.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView nombre, descripcion, lugar;
        CardView touchCartita;

        public ViewHolder(View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.imgCard);
            nombre = itemView.findViewById(R.id.txtNombre);
            descripcion = itemView.findViewById(R.id.txtDesc);
            lugar = itemView.findViewById(R.id.txtLugar);
            touchCartita = itemView.findViewById(R.id.cartitiaTouch);
        }
    }
}
