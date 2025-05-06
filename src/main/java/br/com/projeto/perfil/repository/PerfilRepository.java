package br.com.projeto.perfil.repository;

import br.com.projeto.perfil.model.PerfilPessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilPessoa, Long> {
}
