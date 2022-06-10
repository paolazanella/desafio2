package br.com.desafio2.imovelserver.service;

import br.com.desafio2.imovelserver.model.TipoImovel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "tipo-imovel-service")
public interface TipoImovelService {
    @GetMapping(value = "/tiposimoveis/{idTipoImovel}")
    TipoImovel listarPeloId(@PathVariable("idTipoImovel") Long idTipoImovel);
}