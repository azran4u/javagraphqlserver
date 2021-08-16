package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Post;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service.PostService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    @Autowired
    private PostService postService;

    public List<Post> recentPosts(int count, int offset) {
        return postService.getRecentPosts(count, offset);
    }
}
