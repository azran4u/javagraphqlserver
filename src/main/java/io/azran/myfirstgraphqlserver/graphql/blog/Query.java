package io.azran.myfirstgraphqlserver.graphql.blog;

import java.util.List;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public List<Post> recentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
