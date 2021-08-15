package io.azran.myfirstgraphqlserver.graphql.blog;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorDao {
    private List<Author> authors;

    public Optional<Author> getAuthor(String id) {
        return authors.stream().filter(author -> id.equals(author.getId())).findFirst();
    }
}
