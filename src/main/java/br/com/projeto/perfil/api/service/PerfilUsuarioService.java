package br.com.projeto.perfil.api.service;


import br.com.projeto.perfil.api.mapper.PerfilUsuarioMapper;
import br.com.projeto.perfil.api.model.PerfilUsuario;
import br.com.projeto.perfil.api.repository.PerfilUsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author pedrovictor
 * @since 2025-05-19
 */

@Service
@AllArgsConstructor
public class PerfilUsuarioService {

    private PerfilUsuarioRepository perfilUsuarioRepository;
    private PerfilUsuarioMapper mapper;

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
            Optional<PerfilUsuario> perfilCurrent = findById(id);
            mapper.toModel(perfilUsuarioUpdate, perfilCurrent);
            return perfilUsuarioRepository.save(perfilCurrent.get());
    }

    public void delete(Long id){ perfilUsuarioRepository.deleteById(id);}

}
