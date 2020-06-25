package br.com.mastertech.oauth2Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public Contato insereContato(Contato contato){
        return contatoRepository.save(contato);
    }

    public List<Contato> buscarContatoPorIdUser(Integer idUser){
        return contatoRepository.findAllByIdUser(idUser);
    }

}
