package tech.alvarez.pokedex.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tech.alvarez.pokedex.models.PokemonRespuesta;


public interface apiService {

    @GET("datos")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

}
