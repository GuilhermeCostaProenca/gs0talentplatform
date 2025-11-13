package br.com.fiap.ra_98937.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Tag(name = "Tema", description = "Endpoint da Global Solution 2 - Microservice and Web Engineering")
public class TemaController {

    @GetMapping("/info")
    @Operation(summary = "Retorna informações do tema da Global Solution 2")
    public Map<String, String> info() {
        return Map.of(
                "tema", "Plataformas que conectam talentos a projetos com propósito",
                "membro1", "Guilherme Costa Proença",
                "membro2", "Hugo Antônio Oliveira Santos",
                "descricao", "A API conecta profissionais que buscam impacto social a projetos com propósito, utilizando uma arquitetura escalável e moderna baseada em microserviços."
        );
    }
}
