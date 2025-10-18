package br.com.projeto.perfil.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Regis Michael
 * @since 2025-10-12
 */


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "perfil_usuario")
public class PerfilUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "email", nullable = false, length = 300)
    private String email;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    @Column(name = "profissao", length = 155)
    private String profissao;

    @Column(name= "formacao_academica", length = 150)
    private String formacaoAcademica;

    @Column(name ="codigo", length = 30, nullable = false)
    private String codigo;

    @Column(name = "caminho_imagem", length = 255)
    private String caminhoImagem;

    @Column(name = "descricao", length = 500)
    private String descricao;

}
