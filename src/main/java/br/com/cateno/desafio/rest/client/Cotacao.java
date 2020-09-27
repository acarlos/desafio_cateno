package br.com.cateno.desafio.rest.client;

import java.util.List;

public class Cotacao {

    public String context;
    public List<TipoCotacaoDolar> value;


    public static class TipoCotacaoDolar {
        public String cotacaoCompra;
        public String cotacaoVenda;
        public String dataHoraCotacao;
    }
}
