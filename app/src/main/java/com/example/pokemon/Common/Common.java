package com.example.pokemon.Common;

import android.content.Context;

import com.example.pokemon.Model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static final String KEY_ENABLE_HOME = "enable_home";
    public static List<Pokemon> commonPokemonList = new ArrayList<>();

    public static Pokemon findPokemonByNum(String num){
        for(Pokemon pokemon: Common.commonPokemonList)
            if(pokemon.getNum().equals(num))
                return pokemon;
            return null;
    }
}
