package br.com.projeto.perfil.service;


import br.com.projeto.perfil.model.PerfilUsuario;
import br.com.projeto.perfil.repository.PerfilUsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/**
 * @author pedrovictor
 * @since 2025-05-19
 */

@Service
public class PerfilUsuarioService {

    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    public PerfilUsuario create(PerfilUsuario perfilUsuario)
    {
        return perfilUsuarioRepository.save(perfilUsuario);
    }

    public List<PerfilUsuario> findAll()
    {
        return perfilUsuarioRepository.findAll();
    }

    public Optional<PerfilUsuario> findById(Long id)
    {
        return perfilUsuarioRepository.findById(id);
    }

    @Transactional
    public PerfilUsuario update(Long id, PerfilUsuario perfilUsuarioUpdate)
    {
        Optional<PerfilUsuario> perfilUsuarioCurrent = perfilUsuarioRepository.findById(id);
        if(perfilUsuarioCurrent.isPresent()) {
            perfilUsuarioCurrent.get().setNome(perfilUsuarioUpdate.getNome());
            perfilUsuarioCurrent.get().setIdade(perfilUsuarioUpdate.getIdade());
            perfilUsuarioCurrent.get().setProfissao(perfilUsuarioUpdate.getProfissao());
            perfilUsuarioCurrent.get().setFormacaoAcademica(perfilUsuarioUpdate.getFormacaoAcademica());
            perfilUsuarioCurrent.get().setDescricao(perfilUsuarioUpdate.getDescricao());
            perfilUsuarioCurrent.get().setCaminhoImagem(perfilUsuarioUpdate.getCaminhoImagem());
        }
        return perfilUsuarioCurrent.get();
    }

    public void delete(Long id){ perfilUsuarioRepository.deleteById(id);}

}
