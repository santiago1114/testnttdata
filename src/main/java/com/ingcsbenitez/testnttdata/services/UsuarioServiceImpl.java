package com.ingcsbenitez.testnttdata.services;

import com.ingcsbenitez.testnttdata.dao.UsuarioRepository;
import com.ingcsbenitez.testnttdata.entities.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service @Transactional @Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioByDoc(Character tipoDocumento, Long numeroDocumento) {
        return usuarioRepository.findByTipoDocumentoEqualsAndNumeroDocumentoEquals(tipoDocumento,numeroDocumento);
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
