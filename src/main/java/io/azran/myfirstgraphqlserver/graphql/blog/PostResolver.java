package io.azran.myfirstgraphqlserver.graphql.blog;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public Author getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId()).orElseThrow(RuntimeException::new);
    }
}
