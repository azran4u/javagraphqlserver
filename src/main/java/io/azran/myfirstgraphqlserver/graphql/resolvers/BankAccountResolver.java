package io.azran.myfirstgraphqlserver.graphql.resolvers;

import java.util.UUID;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.azran.myfirstgraphqlserver.graphql.bank.BankAccount;
import io.azran.myfirstgraphqlserver.graphql.bank.Currency;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        log.info("bank account id {}", id);
        return BankAccount.builder().id(id).name("eyal").currency(Currency.ILS).build();
    }
}
