package com.aulapoospringboot.repository;

import com.aulapoospringboot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// primeiro paramentro no JpaRepository é a classe
// o segundo parametro é o tipo da chave primária da classe em questão
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //assinatura personalizada
    public Cliente findByNome(String nome); //SELECT * FROM CLIENTE WHERE nome = 'nome';
}

/*
O JpaRepository importa todos os seus métodos para a inteerface da classe para que ele utilize todos eles
caso veja necessidade, pode personalizar assinaturas, como o exemplo acima, mas no JpaRepository
já contém os métodos:
- save (cliente)
- findById (id - tipo long ou int)
- findAll( todos os clientes do banco de dados - retorna lista de cliente)
- delete (cliente a ser deletado)
- deleteById (id a ser deletado)

para personalizar uma query, deve-se fazer uma assinatura personalizada (não será exigido no projeto)
 */