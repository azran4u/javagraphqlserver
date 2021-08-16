package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Author;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Post;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service.AuthorService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PostQuery implements GraphQLResolver<Post> {

    @Autowired
    private AuthorService authorService;

    public Author getAuthor(Post post) {
        return authorService.getAuthor(post.getAuthorId()).orElseThrow(RuntimeException::new);
    }
}
