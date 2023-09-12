package com.satc.satcloja.health;

import com.satc.satcloja.models.Produto;
import com.satc.satcloja.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @Autowired
    public ProdutoRepository produtoRepository;

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/teste")
    public String healthCheck2() {
        var produto = new Produto("teste", "desc");

        produtoRepository.save(produto);

        return "Comando executado! " + produto.getId();
    }

    @Scheduled(fixedRate = 5000)
    public void doSomething() {
        System.out.println("TESTE");
    }
}
