package com.arfudy.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfudy.backend.domain.PratoResponse;
import com.arfudy.backend.repository.PratoRepository;

@SpringBootApplication
@RestController
public class BackendApplication {

    @Autowired
    PratoRepository pratoRepository;

    public static void main(String[] args) {

        SpringApplication.run(BackendApplication.class, args);
    }

    @GetMapping("pratos")
    public PratoResponse findAllPratos() {

        return new PratoResponse(pratoRepository.findAll());
    }
}
