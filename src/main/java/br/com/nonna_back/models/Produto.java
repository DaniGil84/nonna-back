package br.com.nonna_back.models;

import java.math.BigDecimal;

public class Produto {
    String id;
    String nome;
    String descricao;
    BigDecimal preco;
    String categoria;

    public Produto (String id, String nome, BigDecimal preco, String categoria){
      this.id = id;
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
      this.categoria = categoria;
    }
}

