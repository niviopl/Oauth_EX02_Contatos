package br.com.mastertech.oauth2Contato;

import org.springframework.data.repository.CrudRepository;
import br.com.mastertech.oauth2Contato.Contato;

import java.util.List;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {
     List<Contato> findAllByIdUser(Integer idUser);
}
