package br.com.projeto.perfil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.perfil.model.PerfilUsuario;

/**
 * @author Regis Michael
 * @since 2025-05-18
 */

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuario, Long> {
}
