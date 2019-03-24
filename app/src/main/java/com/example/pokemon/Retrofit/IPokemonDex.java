package com.example.pokemon.Retrofit;

import com.example.pokemon.Model.Pokedex;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPokemonDex {
        @GET("pokedex.json")
        Observable<Pokedex> getListPokemon();
}

