package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Author;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthorService {
    private List<Author> authors;

    public Optional<Author> getAuthor(String id) {
        return authors.stream().filter(author -> id.equals(author.getId())).findFirst();
    }
}
