package com.ingcsbenitez.testnttdata.dao;

import com.ingcsbenitez.testnttdata.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByTipoDocumentoEqualsAndNumeroDocumentoEquals(Character tipoDocumento, Long numeroDocumento);
}