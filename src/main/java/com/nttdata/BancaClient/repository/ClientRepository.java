package com.nttdata.BancaClient.repository;

import com.nttdata.BancaClient.domain.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {
        Mono<Client> findByIdentityNumber(String dni);

}
