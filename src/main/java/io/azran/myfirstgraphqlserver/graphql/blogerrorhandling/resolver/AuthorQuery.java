package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Author;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Post;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service.PostService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AuthorQuery implements GraphQLResolver<Author> {

    @Autowired
    private PostService postService;

    public List<Post> getPosts(Author author) {
        return postService.getAuthorsPosts(author.getId());
    }
}
