package br.com.nonna_back.controllers;

import br.com.nonna_back.models.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    Produto getTodosProdutos(){
        Produto exemplo = new Produto(
                "1",
                "pizza",
                "gostosa",
                new BigDecimal (15.3),
                "pizzas"
        );

        return "testando a rota";

    }
  /*  @GetMapping("/produtos")
    List<Produto> listar (){

    }*/
}
