package com.aluracursos.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAnime(
        @JsonAlias("title") String titulo,
        @JsonAlias ("episodes") Integer numeroEpisodio,
        @JsonAlias ("status") String estado,
        @JsonAlias ("rating") String clasificacion

) {
}
