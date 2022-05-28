package com.ingcsbenitez.testnttdata.controllers;

import com.ingcsbenitez.testnttdata.dao.UsuarioRepository;
import com.ingcsbenitez.testnttdata.entities.Usuario;
import com.ingcsbenitez.testnttdata.services.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/get")
    public ResponseEntity<Usuario> getUsuario(@RequestParam(required = true) Character tipoDocumento, @RequestParam(required = true) Long numeroDocumento) {
        log.info("Obteniendo todos los usuarios");
        Usuario usuario = usuarioService.getUsuarioByDoc(tipoDocumento, numeroDocumento);
        if ( usuario != null )
            return ResponseEntity.ok().body(usuarioService.getUsuarioByDoc(tipoDocumento, numeroDocumento));
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HTTP Status will be NOT FOUND (CODE 404)\n");
    }

    @PostMapping("/save")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
        return  ResponseEntity.created(null).body(usuarioService.saveUsuario(usuario));
    }

}
