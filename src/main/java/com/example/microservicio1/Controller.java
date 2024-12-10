package com.example.microservicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/hola")
    public String saludoDesdeElMicroservicio() {
        return "Saludando desde el microservicio 1";
    }

//    @GetMapping()
//    public String envíarMensaje() {
//        service.enviarMensaje("Enviando mensaje desde el microservicio 1");
//        return "Enviando mensaje...";
//    }

}
