package br.com.projeto.perfil.api.controller;

import br.com.projeto.perfil.api.service.PerfilUsuarioService;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Regis Michael
 * @since 2025-10-12
 */

@RestController
@RequestMapping("/perfil")
@NoArgsConstructor
public class PerfilUsuarioController {

    private PerfilUsuarioService perfilPessoaService;


}
