package br.com.projeto.perfil.controller;

import br.com.projeto.perfil.service.PerfilUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Regis Michael
 * @since 2025-05-18
 */

@RestController
@RequestMapping("/perfil")
public class PerfilUsuarioController {

    @Autowired
    private PerfilUsuarioService perfilPessoaService;


}
