package br.edu.utfpr.config;

import br.edu.utfpr.clientes.ClienteCRUD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ClienteCRUD clienteCRUD() {
        return new ClienteCRUD();
    }

}