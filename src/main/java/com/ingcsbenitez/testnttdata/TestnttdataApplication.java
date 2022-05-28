package com.ingcsbenitez.testnttdata;

import com.ingcsbenitez.testnttdata.entities.Usuario;
import com.ingcsbenitez.testnttdata.services.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestnttdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestnttdataApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UsuarioService usuarioService) {
        return args -> {
            usuarioService.saveUsuario(new Usuario(
                    "Carlos",
                    "Santiago",
                    "Benitez",
                    "Malaver",
                    123L,
                    "CLL 1 # 1-1",
                    "Bogotá",
                    23445322L,
                    'C'
            ));
        };
    }

}
