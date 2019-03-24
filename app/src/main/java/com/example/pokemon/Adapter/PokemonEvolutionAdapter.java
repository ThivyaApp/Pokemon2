package com.example.pokemon.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pokemon.Interface.IItemClickListener;
import com.example.pokemon.Model.Evolution;
import com.example.pokemon.R;
import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnChipClickListener;

import java.util.ArrayList;
import java.util.List;

public class PokemonEvolutionAdapter extends RecyclerView.Adapter<PokemonEvolutionAdapter.MyViewHolder> {
    Context context;
    List<Evolution> evolutions;

    public PokemonEvolutionAdapter(Context context, List<Evolution> evolutions) {
        this.context = context;
        if(evolutions!=null)
            this.evolutions = evolutions;
        else
            this.evolutions = new ArrayList<>();    //Fix crash if pokemon doesn't have next or previous evolution
    }

    @NonNull
    @Override
    public PokemonEvolutionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.chip_item,parent,false);
        return new PokemonEvolutionAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonEvolutionAdapter.MyViewHolder holder, int position) {
        holder.chip.setChipText(evolutions.get(position).getName());
        //holder.chip.setChipText(evolutions.get(position).getNum());

        holder.setItemClickListener(new IItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                //Toast.makeText(context,"Click to evolution pokemon",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return evolutions.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        Chip chip;
        IItemClickListener itemClickListener;

        public void setItemClickListener(IItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public MyViewHolder(final View itemView) {
            super(itemView);
            chip = (Chip)itemView.findViewById(R.id.chip);
            chip.setOnChipClickListener(new OnChipClickListener() {
                @Override
                public void onChipClick(View v) {
                    itemClickListener.onClick(v,getAdapterPosition());
                }
            });
        }
    }
}