package br.com.projeto.perfil.api.controller;

import br.com.projeto.perfil.api.PerfilUsuarioApi;
import br.com.projeto.perfil.api.model.PerfilUsuarioRequest;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<PerfilUsuarioRequest> createProfile(PerfilUsuarioRequest perfilUsuarioRequest) {
        return PerfilUsuarioApi.super.createProfile(perfilUsuarioRequest);
    }

    @Override
    public ResponseEntity<List<PerfilUsuarioRequest>> listProfiles() {
        return PerfilUsuarioApi.super.listProfiles();
    }

    @Override
    public ResponseEntity<List<PerfilUsuarioRequest>> getProfile(UUID id, PerfilUsuarioRequest perfilUsuarioRequest) {
        return PerfilUsuarioApi.super.getProfile(id, perfilUsuarioRequest);
    }

    @Override
    public ResponseEntity<PerfilUsuarioRequest> updateProfile(UUID id, PerfilUsuarioRequest perfilUsuarioRequest) {
        return PerfilUsuarioApi.super.updateProfile(id, perfilUsuarioRequest);
    }

    @Override
    public ResponseEntity<Void> deleteProfile(UUID id) {
        return PerfilUsuarioApi.super.deleteProfile(id);
    }
}
