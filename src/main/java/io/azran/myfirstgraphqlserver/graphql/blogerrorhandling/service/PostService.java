package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.error.InvalidInputGraphqlException;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Post;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostService {
    private List<Post> posts;

    public List<Post> getRecentPosts(int count, int offset) {

        // if (count < 0) {
        // throw new InvalidInputGraphqlException("count must be equal or greater than
        // zero. count = " + count,
        // "count");
        // }

        if (offset < 0) {
            throw new InvalidInputGraphqlException("offset must be equal or greater than zero. offset = " + offset,
                    "offset");
        }

        return posts.stream().skip(offset).limit(count).collect(Collectors.toList());

    }

    public List<Post> getAuthorsPosts(String authorId) {
        return posts.stream().filter(post -> authorId.equals(post.getAuthorId())).collect(Collectors.toList());
    }

    public void savePost(Post post) {
        posts.add(post);
    }
}
