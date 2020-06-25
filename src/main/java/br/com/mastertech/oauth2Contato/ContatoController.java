package br.com.mastertech.oauth2Contato;

import br.com.mastertech.oauth2Contato.security.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping("/contato/{nome}/{telefone}")
    public Contato create(@PathVariable String nome, @PathVariable String telefone, @AuthenticationPrincipal Usuario usuario) {
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setIdUser(usuario.getId());
        Contato Salvar = contatoService.insereContato(contato);
        //usuario.getName();
        return contato;
    }

    @GetMapping("/contatos/{idUser}")
    public List<Contato> buscarTodosContatosPorIdUsuario(@PathVariable Integer idUser) {
        return contatoService.buscarContatoPorIdUser(idUser);
    }

}
