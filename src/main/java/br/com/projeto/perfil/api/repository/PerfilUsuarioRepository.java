package br.com.projeto.perfil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.perfil.api.model.PerfilUsuario;

/**
 * @author Regis Michael
 * @since 2025-10-12
 */

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuario, Long> {
}
