package br.com.projeto.perfil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.perfil.model.PerfilPessoa;

public interface PerfilPessoaRepository extends JpaRepository<PerfilPessoa, Long> {
}
