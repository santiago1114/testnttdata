package com.ingcsbenitez.testnttdata.services;
import com.ingcsbenitez.testnttdata.entities.Usuario;

public interface UsuarioService {

    Usuario getUsuarioByDoc(Character tipoDocumento, Long numeroDocumento);
    Usuario saveUsuario(Usuario usuario);

}
