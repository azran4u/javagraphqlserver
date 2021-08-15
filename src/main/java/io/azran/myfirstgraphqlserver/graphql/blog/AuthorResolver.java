package io.azran.myfirstgraphqlserver.graphql.blog;

import java.util.List;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
    private PostDao postDao;

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorsPosts(author.getId());
    }
}
