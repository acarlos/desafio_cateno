package br.com.cateno.desafio.rest.client;

import java.util.List;
import java.math.BigDecimal;
import java.io.Serializable;

public class Cotacao {

    public String context;
    public List<TipoCotacaoDolar> value;

    public static class TipoCotacaoDolar implements Serializable{
        public String cotacaoCompra;
        public String cotacaoVenda;
        public String dataHoraCotacao;
    }
}
