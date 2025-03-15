package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FraseService {
    @Autowired
    FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        var frase = repositorio.findById("").get();

        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
