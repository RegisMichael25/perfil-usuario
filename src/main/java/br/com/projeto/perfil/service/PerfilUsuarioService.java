package br.com.projeto.perfil.service;


import br.com.projeto.perfil.model.PerfilUsuario;
import br.com.projeto.perfil.repository.PerfilUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Regis Michael
 * @since 2025-05-18
 */

@Service
public class PerfilUsuarioService {

    @Autowired
    private PerfilUsuarioRepository perfilPessoaRepository;

    public List<PerfilUsuario> findAll()
    {
        return perfilPessoaRepository.findAll();
    }

}
