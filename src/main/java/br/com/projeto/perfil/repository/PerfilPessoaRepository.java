package br.com.projeto.perfil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.perfil.model.PerfilPessoa;

/**
 * @author Regis Michael
 * @since 2025-05-18
 */

public interface PerfilPessoaRepository extends JpaRepository<PerfilPessoa, Long> {
}
