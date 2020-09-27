package br.com.cateno.desafio.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.concurrent.CompletionStage;
import java.util.Set;

@Path("/v1/odata")
@RegisterRestClient(configKey="cotacao-api")
public interface CotacaoService {

    @GET
    @Path("CotacaoDolarDia(dataCotacao='{data}')")
    @Produces("application/json")
    Cotacao getByData(@PathParam("data") String data);

    @GET
    @Path("'{data}'")
    @Produces("application/json")
    CompletionStage<Cotacao> getByDataAsync(@PathParam String data);
}
