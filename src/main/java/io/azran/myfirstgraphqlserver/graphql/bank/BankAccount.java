package io.azran.myfirstgraphqlserver.graphql.bank;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class BankAccount {
    UUID id;
    String name;
    Currency currency;
}
