package br.com.projeto.perfil.api.controller;

import br.com.projeto.perfil.api.PerfilUsuarioApi;
import br.com.projeto.perfil.api.model.PerfilUsuarioRequest;
import br.com.projeto.perfil.api.model.PerfilUsuarioResponse;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author Regis Michael
 * @since 2025-10-12
 */
@RestController
@RequestMapping("/perfil")
@NoArgsConstructor
public class PerfilUsuarioController implements PerfilUsuarioApi {

    @Override
    public ResponseEntity<PerfilUsuarioResponse> createProfile(PerfilUsuarioRequest perfilUsuarioRequest) {
        return null;
    }

    @Override
    public ResponseEntity<List<PerfilUsuarioResponse>> listProfiles() {
        return null;
    }


}
