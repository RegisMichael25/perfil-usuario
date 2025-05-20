package br.com.projeto.perfil.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "perfil_usuario")
public class PerfilUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
