package br.com.philypygomes.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://locallost:8080/primeiraRota-----

public class MinhaPrimeiraController {


    /**
     * (SÃO METODOS DE ACESSO DO HTTP)
     * GET- BUSCAR UMA INFORMAÇÃO DENTRO DA INFORMAÇÃO
     * POST - ADICIONAR UM DADO / INFORMAÇÃO
     * PUT - ALTERAR UM DADO / INFORMAÇÃO
     * DELETE - REMOVER UM DADO
     * PATCH - ALTERAR SOMENTE UMA PARTE DO DADO / INFORMAÇÃO
     * 
     */

    // (METODOS {FUNCIONALIDADES} DE UMA CLASSE)
    @RequestMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
