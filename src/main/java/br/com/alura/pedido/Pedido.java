package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Pedido {

    private String cliente;
    private Orcamento orcamento;
    private LocalDateTime data;

}
