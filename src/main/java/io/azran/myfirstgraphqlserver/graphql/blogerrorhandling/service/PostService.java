package io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.error.NotEnoughPostsException;
import io.azran.myfirstgraphqlserver.graphql.blogerrorhandling.model.Post;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostService {
    private List<Post> posts;

    public List<Post> getRecentPosts(int count, int offset) {
        List<Post> res = posts.stream().skip(offset).limit(count).collect(Collectors.toList());
        if (res.size() < count) {
            throw new NotEnoughPostsException(
                    "We were unable to find a enough posts. found " + res.size() + " but count is " + count, "count");
        }

        return res;
    }

    public List<Post> getAuthorsPosts(String authorId) {
        return posts.stream().filter(post -> authorId.equals(post.getAuthorId())).collect(Collectors.toList());
    }

    public void savePost(Post post) {
        posts.add(post);
    }
}
