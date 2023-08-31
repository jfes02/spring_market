package com.eeiren.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoSaludo {

    @GetMapping("/hola")
    public String Saludar() {
        return "Holaas";
    }

}
