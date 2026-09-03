package br.com.nonna_back.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    String getTodosProdutos(){
        return "testando a rota";

    }
  /*  @GetMapping("/produtos")
    List<Produto> listar (){

    }*/
}
