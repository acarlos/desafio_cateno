package br.com.cateno.desafio.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletionStage;
import java.util.Set;

@Path("/cotacao")
public class CotacaoResource {

    @Inject
    @RestClient
    CotacaoService cotacaoService;


    @GET
    @Path("/data/{data}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cotacao data(@PathParam String data) {
        return cotacaoService.getByData(data);
    }

    @GET
    @Path("/data-async/{data}")
    @Produces(MediaType.APPLICATION_JSON)
    public CompletionStage<Cotacao> dataAsync(@PathParam String data) {
        return cotacaoService.getByDataAsync(data);
    }
}

