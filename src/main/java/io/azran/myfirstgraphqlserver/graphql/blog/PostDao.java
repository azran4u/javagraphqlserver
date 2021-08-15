package io.azran.myfirstgraphqlserver.graphql.blog;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostDao {
    private List<Post> posts;

    public List<Post> getRecentPosts(int count, int offset) {
        return posts.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

    public List<Post> getAuthorsPosts(String authorId) {
        return posts.stream().filter(post -> authorId.equals(post.getAuthorId())).collect(Collectors.toList());
    }

    public void savePost(Post post) {
        posts.add(post);
    }
}
